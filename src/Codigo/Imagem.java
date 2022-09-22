package Codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;



// Espaço destinado às operações matemáticas
public class Imagem {

    private File imagem;
    private Image imageTemp;
    private int linhas;
    public Pix[][] MatrizPixels;
    private int colunas;
    private int valMAX;
    private int valMIN;
    private Pix objPix = null;

    public Imagem(String Nome) throws IOException {
        imagem = new File(Nome);
        linhas = 0;
        valMAX = Integer.MIN_VALUE;
        valMIN = Integer.MAX_VALUE;
        if (!abrirImagem()) {
            System.out.println("Não foi possivel ler a imagem !!!");
        }
    }

    public Imagem(int linhas, Pix[][] matriz, int colunas) {
        this.linhas = linhas;
        this.MatrizPixels = matriz;
        this.colunas = colunas;
    }

    public Imagem(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.MatrizPixels = new Pix[linhas][colunas];
    }

    public Imagem() {
    }

    public File getImagem() {
        return imagem;
    }

    public void setImagem(File imagem) {
        this.imagem = imagem;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int Linhas) {
        this.linhas = Linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public Pix[][] getMatrizPixels() {
        return MatrizPixels;
    }

    public void setMatrizPixels(Pix[][] matriz) {
        this.MatrizPixels = matriz;
    }

    public int getValMAX() {
        return valMAX;
    }

    public void setValMAX(int valMAX) {
        this.valMAX = valMAX;
    }

    public int getValMIN() {
        return valMIN;
    }

    public void setValMIN(int valMIN) {
        this.valMIN = valMIN;
    }

    private boolean abrirImagem() throws IOException {
        BufferedImage img = ImageIO.read(imagem);
        
        if (img.getWidth() > 600 || img.getHeight() > 600)
        {
            img = resize(img, 600, 600);
        }
        
        if (img.getWidth()!=img.getHeight())
        {
            int Media = (img.getWidth() + img.getHeight())/2;
            img = resize(img ,Media , Media);
        }
                
        MatrizPixels = new Pix[img.getWidth()][img.getHeight()];
        this.linhas = img.getHeight();
        this.colunas = img.getWidth();
        Color cor = null;
        if (img != null) {
            for (int i = 0; i < img.getWidth(); i++) {
                for (int j = 0; j < img.getHeight(); j++) {                  
                    cor = new Color(img.getRGB(i, j));
                    objPix = new Pix(cor.getRed(),cor.getGreen(),cor.getBlue());                  
                    MatrizPixels[i][j]= objPix;
                }
            }
            return true;
        }
        return false;
    }

    
    public BufferedImage getBufferedImage() {
        Color cor = null;
        BufferedImage nova = new BufferedImage(this.getLinhas(), this.getColunas(),Image.SCALE_DEFAULT);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                cor = new Color(MatrizPixels[i][j].getRedPix(), MatrizPixels[i][j].getGreenPix(), MatrizPixels[i][j].getBluePix());
                nova.setRGB(i, j, cor.getRGB());
            }
        }
        return nova;
    }

    public BufferedImage negativo() {   
        for (int i = 0; i < this.linhas-1; i++) {
            for (int j = 0; j < this.colunas; j++) {
                MatrizPixels[i][j].setRedPix(255 - MatrizPixels[i][j].getRedPix());               
                MatrizPixels[i][j].setGreenPix(255 - MatrizPixels[i][j].getGreenPix());
                MatrizPixels[i][j].setBluePix(255 - MatrizPixels[i][j].getBluePix());               
            }
        }
        return this.getBufferedImage();
    }
    
        public BufferedImage logaritmo() {
        int valorRed;
        int valorGreen;
        int valorBlue;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                valorRed = (int) Math.floor(255 / Math.log(255) * Math.log(MatrizPixels[i][j].getRedPix()+ 1));
                valorGreen = (int) Math.floor(255 / Math.log(255) * Math.log(MatrizPixels[i][j].getGreenPix()+ 1));
                valorBlue = (int) Math.floor(255 / Math.log(255) * Math.log(MatrizPixels[i][j].getBluePix()+ 1));
                
                //Red
                if (valorRed < 0) {
                    this.MatrizPixels[i][j].setRedPix(0); 
                } else if (valorRed > 255) {
                    this.MatrizPixels[i][j].setRedPix(255);
                } else {
                    this.MatrizPixels[i][j].setRedPix((int) valorRed);
                }
                
                //Green
                if (valorGreen < 0) {
                    this.MatrizPixels[i][j].setGreenPix(0); 
                } else if (valorGreen > 255) {
                    this.MatrizPixels[i][j].setGreenPix(255);
                } else {
                    this.MatrizPixels[i][j].setGreenPix((int) valorGreen);
                }
                
                //Blue
                if (valorBlue < 0) {
                    this.MatrizPixels[i][j].setBluePix(0); 
                } else if (valorBlue > 255) {
                    this.MatrizPixels[i][j].setBluePix(255);
                } else {
                    this.MatrizPixels[i][j].setBluePix((int) valorBlue);
                }
                
            }
        } 
        return this.getBufferedImage();
        }

        public BufferedImage PassaBaixa(int Mascara){
            
            int divisor = 0 ;
            int somatorioRed = 0;
            int somatorioGreen = 0;
            int somatorioBlue = 0;
            int mediaRed = 0;
            int mediaGreen = 0;
            int mediaBlue = 0;
            int MediaMascara = Math.round(Mascara/2);
            
            
            Pix[][] MatrizResultante = new Pix[this.getLinhas()][this.getColunas()];
            
            
            for(int M = 0 ; M <this.getLinhas();M++)
            {
                for (int N = 0; N <this.getColunas(); N++)
                {
                    objPix = new Pix(MatrizPixels[M][N].getRedPix() ,MatrizPixels[M][N].getGreenPix(),MatrizPixels[M][N].getBluePix());
                    MatrizResultante[M][N] = objPix;
                }
            }
            
            for(int h= MediaMascara;h < this.getLinhas() - MediaMascara;h++)
            {
                for(int w = MediaMascara;w < this.getColunas()- MediaMascara;w++)
                {
                    somatorioRed = 0;
                    somatorioGreen = 0;
                    somatorioBlue = 0;
                    divisor =0;
                    for(int i = h - MediaMascara ; i <= h+MediaMascara ; i++ )
                    {
                        for (int j = w - MediaMascara ; j <= w+MediaMascara ; j++)
                        {
                            somatorioRed += MatrizPixels[i][j].getRedPix() ;
                            somatorioGreen += MatrizPixels[i][j].getGreenPix() ;
                            somatorioBlue += MatrizPixels[i][j].getBluePix() ;
                            divisor++;
                        }
                    }
                    mediaRed = Math.round(somatorioRed/divisor) ;
                    mediaGreen = Math.round(somatorioGreen/divisor) ;
                    mediaBlue = Math.round(somatorioBlue/divisor) ;                   
                    MatrizResultante[h][w].setRedPix(mediaRed);
                    MatrizResultante[h][w].setGreenPix(mediaGreen);
                    MatrizResultante[h][w].setBluePix(mediaBlue);
                }
            }
        
        for(int M = 0 ; M <this.getLinhas();M++)
        {
            for (int N = 0; N <this.getColunas(); N++)
            {
                MatrizPixels[M][N].setRedPix(MatrizResultante[M][N].getRedPix());
                MatrizPixels[M][N].setGreenPix(MatrizResultante[M][N].getGreenPix());
                MatrizPixels[M][N].setBluePix(MatrizResultante[M][N].getBluePix());
            }
        }
            
        return this.getBufferedImage();
        }
        
        public BufferedImage PassaAlta(){
            
            int ValorRed = 0;
            int SomatorioRed = 0;
            int ValorFinalRed = 0;
            int ValorGreen = 0;
            int SomatorioGreen = 0;
            int ValorFinalGreen = 0;
            int ValorBlue = 0;
            int SomatorioBlue = 0;
            int ValorFinalBlue = 0;
            
            Pix[][] MatrizResultante = new Pix[this.getLinhas()][this.getColunas()];
            
            
            for(int M = 0 ; M <this.getLinhas();M++)
            {
                for (int N = 0; N <this.getColunas(); N++)
                {
                    objPix = new Pix(MatrizPixels[M][N].getRedPix() ,MatrizPixels[M][N].getGreenPix(),MatrizPixels[M][N].getBluePix());
                    MatrizResultante[M][N] = objPix;
                }
            }
            
            
            for(int w = 1;w < this.getColunas()- 1;w++)
            {
                for(int h= 1;h < this.getLinhas() - 1;h++)
                {
                    SomatorioRed = 0;
                    ValorFinalRed = 0;
                    SomatorioGreen = 0;
                    ValorFinalGreen = 0;
                    SomatorioBlue = 0;
                    ValorFinalBlue = 0;
                    for (int i = w - 1 ; i <= w+1 ; i++)
                    {
                        for(int j = h - 1 ; j <= h+1 ; j++ )  
                        {
                            if (i == w && j == h)
                            {
                                ValorRed = 8 * MatrizPixels[i][j].getRedPix();
                                ValorGreen = 8 * MatrizPixels[i][j].getGreenPix();
                                ValorBlue = 8 * MatrizPixels[i][j].getBluePix();
                                
                            }
                            else 
                            {
                                SomatorioRed += MatrizPixels[i][j].getRedPix();
                                SomatorioGreen += MatrizPixels[i][j].getGreenPix();
                                SomatorioBlue += MatrizPixels[i][j].getBluePix();
                            }    
                        }
                    }
                    
                    ValorFinalRed = ValorRed - SomatorioRed;
                    ValorFinalGreen = ValorGreen - SomatorioGreen;
                    ValorFinalBlue = ValorBlue - SomatorioBlue;
                    
                    
                    
                    //Red
                    if(ValorFinalRed < 0)
                    {
                        MatrizResultante[w][h].setRedPix(0);
                    }
                    else if (ValorFinalRed > 255)
                    {
                        MatrizResultante[w][h].setRedPix(255);
                    }
                    else
                    {
                        MatrizResultante[w][h].setRedPix(ValorFinalRed);
                    }
                    
                    //Green
                    if(ValorFinalGreen < 0)
                    {
                        MatrizResultante[w][h].setGreenPix(0);
                    }
                    else if (ValorFinalGreen > 255)
                    {
                        MatrizResultante[w][h].setGreenPix(255);
                    }
                    else
                    {
                        MatrizResultante[w][h].setGreenPix(ValorFinalGreen);
                    }
                    
                    //Blue
                    if(ValorFinalBlue < 0)
                    {
                        MatrizResultante[w][h].setBluePix(0);
                    }
                    else if (ValorFinalBlue > 255)
                    {
                        MatrizResultante[w][h].setBluePix(255);
                    }
                    else
                    {
                        MatrizResultante[w][h].setBluePix(ValorFinalBlue);
                    }
                    
                    
                }
            }
        
            
        for(int M = 0 ; M <this.getLinhas();M++)
        {
            for (int N = 0; N <this.getColunas(); N++)
            {
                MatrizPixels[M][N].setRedPix(MatrizResultante[M][N].getRedPix());
                MatrizPixels[M][N].setGreenPix(MatrizResultante[M][N].getGreenPix());
                MatrizPixels[M][N].setBluePix(MatrizResultante[M][N].getBluePix());
            }
        }    
           
        return getBufferedImage();
        }
        
        
public static BufferedImage resize(BufferedImage img, int newW, int newH) {  
    int w = img.getWidth();  
    int h = img.getHeight();  
    BufferedImage dimg = new BufferedImage(newW, newH, img.getType());  
    Graphics2D g = dimg.createGraphics();  
    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
    RenderingHints.VALUE_INTERPOLATION_BILINEAR);  
    g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);  
    g.dispose();  
    return dimg;  
}
        
        
        
        
}
