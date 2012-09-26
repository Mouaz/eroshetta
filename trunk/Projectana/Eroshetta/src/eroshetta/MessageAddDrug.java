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
import javax.swing.JLabel;

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


    /**
     * Creates new form MessageAddDrug
     */
static Eroshetta e;
    public MessageAddDrug(Eroshetta er) throws IOException {
        e=er;
        initComponents();
//this.getContentPane().add(new JLabel(), BorderLayout.CENTER);
        this.setLocation(500, 230);
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
       g.drawImage(imagp,  400 , 70 , 60 , 60 , imageObserver);
       g.drawImage(imagn,  400, 140 , 60 , 60 , imageObserver1);
       g.drawImage(imagi,  400 , 210 , 60 , 60 , imageObserver2);
       
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
        jScrollPane1 = new javax.swing.JScrollPane();
        drugsText = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        diagnosesContra = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        pregnantTeext = new javax.swing.JTextArea();

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

        drugsText.setColumns(20);
        drugsText.setEditable(false);
        drugsText.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        drugsText.setRows(5);
        drugsText.setText("no interactions with any drug in prescription\n\t");
        jScrollPane1.setViewportView(drugsText);

        diagnosesContra.setColumns(20);
        diagnosesContra.setEditable(false);
        diagnosesContra.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        diagnosesContra.setRows(5);
        diagnosesContra.setText("there is no contraindication with any diagnoses");
        jScrollPane3.setViewportView(diagnosesContra);

        pregnantTeext.setColumns(20);
        pregnantTeext.setEditable(false);
        pregnantTeext.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        pregnantTeext.setRows(5);
        pregnantTeext.setText("the drug does not harm pregnants");
        jScrollPane4.setViewportView(pregnantTeext);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(73, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        e.enable();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        e.addDirect = true;
        e.addDrugDirect();
        this.setVisible(false);
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
    public javax.swing.JTextArea diagnosesContra;
    public javax.swing.JTextArea drugsText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTextArea pregnantTeext;
    // End of variables declaration//GEN-END:variables
}
