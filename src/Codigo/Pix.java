package Codigo;

/*
 * @author matheus
 */
public class Pix {
    
    private int RedPix;
    private int GreenPix;
    private int BluePix;
    private int NcPix;

    public Pix(int RedPix, int GreenPix, int BluePix) {
        this.RedPix = RedPix;
        this.GreenPix = GreenPix;
        this.BluePix = BluePix;
        this.NcPix = (int) (RedPix + GreenPix + BluePix)/3;
        
    }

    public int getRedPix() {
        return RedPix;
    }

    public void setRedPix(int RedPix) {
        this.RedPix = RedPix;
    }

    public int getBluePix() {
        return BluePix;
    }

    public void setBluePix(int BluePix) {
        this.BluePix = BluePix;
    }

    public int getGreenPix() {
        return GreenPix;
    }

    public void setGreenPix(int GreenPix) {
        this.GreenPix = GreenPix;
    }
    
    public int getNcPix() {
        return NcPix;
    }
    
    
}
