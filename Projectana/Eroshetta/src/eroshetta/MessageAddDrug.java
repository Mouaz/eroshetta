/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eroshetta;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;

/**
 *
 * @author Mouaz
 */
public class MessageAddDrug extends javax.swing.JFrame {
//ImageObserver imageObserver;
ImageIcon icon = new ImageIcon("p.jpg");
Image imagp = icon.getImage();
ImageIcon iconn = new ImageIcon("n.jpg");
Image imagi = iconn.getImage();
 ImageIcon iconi = new ImageIcon("i.jpg");
Image imagn = iconi.getImage();
ImageObserver imageObserver = icon.getImageObserver();
ImageObserver imageObserver1 = iconn.getImageObserver();
ImageObserver imageObserver2 = iconi.getImageObserver();

boolean w1 = false;

    public boolean isW1() {
        return w1;
    }

    public void setW1(boolean w1) {
        this.w1 = w1;
        this.pregnantTeext.setVisible(w1);
    }

    public boolean isW2() {
        return w2;
    }

    public void setW2(boolean w2) {
        this.w2 = w2;
            this.drugsText.setVisible(w2);
        
    }

    public boolean isW3() {
        return w3;
    }

    public void setW3(boolean w3) {
        this.w3 = w3;
        this.diagnosesContra.setVisible(w3);
    }
boolean w2 = false;
boolean w3 = false;
    /**
     * Creates new form MessageAddDrug
     */
static Eroshetta e;
    public MessageAddDrug(Eroshetta er) throws IOException {
        e=er;
        initComponents();
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//        this.setUndecorated(true);  
//this.getRootPane().setWindowDecorationStyle(JRootPane.NONE); 
//this.getContentPane().add(new JLabel(), BorderLayout.CENTER);
        this.setLocation(500, 230);
        //w1=b1;
        
// this.images.setLayout(new java.awt.BorderLayout());
// BufferedImage myPicture = ImageIO.read(new File("p.jpg"));
//JLabel picLabel = new JLabel(icon );
//
//images.add( picLabel,BorderLayout.NORTH);
//
// picLabel = new JLabel(iconn );
// iconn.setImageObserver(imageObserver);
//images.add( picLabel,BorderLayout.CENTER);
// picLabel = new JLabel(iconi );
//images.add( picLabel,BorderLayout.SOUTH);
    }
        public void paint( Graphics g ) {
       super.paint( g );
       this.pregnantTeext.setVisible(w1);
        //this.pregnantTeext.removeAll();
        //w2=b2;
        this.drugsText.setVisible(w3);
        //w3=b3;
        this.diagnosesContra.setVisible(w2);
       if(w1){
       g.drawImage(imagp,  400 , 50 , 60 , 60 , imageObserver);
       }
//       }else{
//           this.setSize(this.getHeight()-70, WIDTH);
//       }
       if(w3){
       g.drawImage(imagn,  400, 120 , 60 , 60 , imageObserver1);
       }
//       }else{
//           this.setSize(this.getHeight()-70, WIDTH);
//       }
       if(w2){
       g.drawImage(imagi,  400 , 190 , 60 , 60 , imageObserver2);
       }
//       }else{
//           this.setSize(this.getHeight()-70, WIDTH);
//       }
       
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pregnantTeext = new javax.swing.JLabel();
        diagnosesContra = new javax.swing.JLabel();
        drugsText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(403, 301));

        jButton1.setText("Proceed");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("NO, I will revise my choice");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Warning!!");

        pregnantTeext.setText("the drug does not harm pregnants");

        diagnosesContra.setText("drugs with diagnoses");

        drugsText.setText("no interactions with any drug in prescription");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pregnantTeext, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drugsText, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diagnosesContra, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(pregnantTeext, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drugsText, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(diagnosesContra, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        e.enable();
        e.openWarning = false;
//        e.setVisible(false);
        e.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        e.addDirect = true;
        e.addDrugDirect();
        this.setVisible(false);
        
        e.openWarning = false;
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MessageAddDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MessageAddDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MessageAddDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MessageAddDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new MessageAddDrug(e).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MessageAddDrug.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel diagnosesContra;
    public javax.swing.JLabel drugsText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel pregnantTeext;
    // End of variables declaration//GEN-END:variables
}
