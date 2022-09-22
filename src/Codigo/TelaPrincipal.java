package Codigo;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    private static Imagem objImagem;


    public TelaPrincipal() {
        initComponents();
    }

    private Image image = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        LabelNCImagem1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelImagem = new javax.swing.JLabel();
        LabelImagem1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnCarregar = new javax.swing.JButton();
        btnNegativo = new javax.swing.JButton();
        btnLogaritmo = new javax.swing.JButton();
        lblMascara = new javax.swing.JLabel();
        btnPassaBaixa = new javax.swing.JButton();
        txtMascara = new javax.swing.JTextField();
        btnPassaAlta = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho do 3º Periodo");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LabelNCImagem1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(222, 232, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setMaximumSize(new java.awt.Dimension(265, 265));
        jPanel2.setMinimumSize(new java.awt.Dimension(265, 265));
        jPanel2.setPreferredSize(new java.awt.Dimension(265, 265));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        LabelImagem.setMaximumSize(new java.awt.Dimension(800, 600));
        LabelImagem.setPreferredSize(new java.awt.Dimension(800, 600));
        LabelImagem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LabelImagemMouseMoved(evt);
            }
        });
        LabelImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelImagemMouseExited(evt);
            }
        });
        jPanel2.add(LabelImagem, new java.awt.GridBagConstraints());

        LabelImagem1.setMaximumSize(new java.awt.Dimension(800, 600));
        LabelImagem1.setPreferredSize(new java.awt.Dimension(800, 600));
        LabelImagem1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LabelImagem1MouseMoved(evt);
            }
        });
        LabelImagem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelImagem1MouseExited(evt);
            }
        });
        jPanel2.add(LabelImagem1, new java.awt.GridBagConstraints());

        jPanel4.setBackground(new java.awt.Color(222, 232, 247));

        btnCarregar.setBackground(new java.awt.Color(175, 188, 209));
        btnCarregar.setText("Carregar Imagem");
        btnCarregar.setToolTipText("Carregar imagem 1");
        btnCarregar.setBorder(null);
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        btnNegativo.setText("Negativo");
        btnNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoActionPerformed(evt);
            }
        });

        btnLogaritmo.setText("Logaritmo");
        btnLogaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogaritmoActionPerformed(evt);
            }
        });

        lblMascara.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMascara.setText("Digite um valor impar para a Máscara :");

        btnPassaBaixa.setText("Passa-Baixa");
        btnPassaBaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassaBaixaActionPerformed(evt);
            }
        });

        btnPassaAlta.setText("Passa-Alta");
        btnPassaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassaAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPassaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNegativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMascara, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(btnLogaritmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMascara, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPassaBaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogaritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblMascara, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMascara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPassaBaixa)
                .addGap(65, 65, 65)
                .addComponent(btnPassaAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(LabelNCImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(LabelNCImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        SelectImg objImg = new SelectImg(this, true);
        objImg.setVisible(true);
        File arq;
        ImageIcon icone;
        if (objImg.getImagem() != null) {
            try {
                arq = new File(objImg.getImagem().getAbsolutePath().replaceAll("\\\\", "\\\\\\\\"));
                image = ImageIO.read(arq);
            } catch (IOException | NullPointerException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
            icone = new ImageIcon(image);
            if (icone.getIconWidth()> 600 || icone.getIconHeight() > 600)
            {
                icone.setImage(icone.getImage().getScaledInstance(600, 600, 1));
            }
            if (icone.getIconWidth()!=icone.getIconHeight())
            {
                int Media = (icone.getIconWidth() + icone.getIconHeight())/2;
                icone.setImage(icone.getImage().getScaledInstance(Media , Media , 1));
            }
            LabelImagem.setIcon((Icon) icone);       
            try {
                objImagem = new Imagem(arq.getAbsolutePath());
            } catch (IOException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            habilitarBotoes(true);
        }
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void LabelImagemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelImagemMouseExited
        LabelNCImagem1.setText("");
    }//GEN-LAST:event_LabelImagemMouseExited

    private void LabelImagemMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelImagemMouseMoved
        //if (LabelImagem.getIcon() != null) {
            //LabelNCImagem1.setText("<html>Pixel: (" + String.valueOf(evt.getX()) + "," + String.valueOf(evt.getY()) + ")" + "<br/> NC: " + objImagem.NC(evt.getX(), evt.getY()) + "</html>");
        //}
    }//GEN-LAST:event_LabelImagemMouseMoved

    private void LabelImagem1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelImagem1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelImagem1MouseMoved

    private void LabelImagem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelImagem1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelImagem1MouseExited

    private void btnNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed
        
        ImageIcon icone;
        icone = new ImageIcon(objImagem.negativo());
        LabelImagem.setIcon((Icon) icone);
    }//GEN-LAST:event_btnNegativoActionPerformed

    private void btnLogaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogaritmoActionPerformed
        // TODO add your handling code here:
        LabelImagem.setIcon(new ImageIcon(objImagem.logaritmo()));
    }//GEN-LAST:event_btnLogaritmoActionPerformed

    private void btnPassaBaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassaBaixaActionPerformed
        // TODO add your handling code here:
        try
        {
            int Valor = Integer.parseInt(txtMascara.getText());
            if (Valor%2 == 0)
            {
                JOptionPane.showMessageDialog(null,"Por Favor insira um valor Ímpar");
            }
            else
            {
                LabelImagem.setIcon(new ImageIcon(objImagem.PassaBaixa(Valor)));
            }
        }
        catch(HeadlessException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Erro de Formato Numérico!");
        }
       
        
        
    }//GEN-LAST:event_btnPassaBaixaActionPerformed

    private void btnPassaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassaAltaActionPerformed
        // TODO add your handling code here:
        LabelImagem.setIcon(new ImageIcon(objImagem.PassaAlta()));
    }//GEN-LAST:event_btnPassaAltaActionPerformed

    private void habilitarBotoes(boolean atv) {
        if (objImagem != null) {
            btnNegativo.setEnabled(atv);

        }
    }

    public void habilitarBotoesCarregar(boolean x) {
        btnCarregar.setEnabled(x);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel LabelImagem;
    private static javax.swing.JLabel LabelImagem1;
    private javax.swing.JLabel LabelNCImagem1;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnLogaritmo;
    private javax.swing.JButton btnNegativo;
    private javax.swing.JButton btnPassaAlta;
    private javax.swing.JButton btnPassaBaixa;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblMascara;
    private javax.swing.JTextField txtMascara;
    // End of variables declaration//GEN-END:variables
}
