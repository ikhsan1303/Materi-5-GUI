/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author SMK TELKOM
 */
public class Latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan1
     */
    public Latihan1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editnama = new javax.swing.JTextField();
        editkelas = new javax.swing.JTextField();
        editalamat = new javax.swing.JTextField();
        buttonproses = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hasilnama = new javax.swing.JTextField();
        hasilkelas = new javax.swing.JTextField();
        hasilalamat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setText("Data Isian");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 42, -1, -1));

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 82, -1, -1));

        jLabel3.setText("Kelas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 112, -1, 20));

        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 152, -1, -1));

        editnama.setAutoscrolls(false);
        editnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editnamaActionPerformed(evt);
            }
        });
        getContentPane().add(editnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 82, 160, -1));
        getContentPane().add(editkelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 112, 160, -1));
        getContentPane().add(editalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 152, 160, -1));

        buttonproses.setText("PROSES");
        buttonproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonprosesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonproses, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 192, -1, -1));

        jLabel5.setText("Nama");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 232, -1, -1));

        jLabel6.setText("Kelas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 272, -1, -1));

        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 312, -1, -1));
        getContentPane().add(hasilnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 232, 160, -1));
        getContentPane().add(hasilkelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 272, 160, -1));
        getContentPane().add(hasilalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 312, 160, -1));

        setSize(new java.awt.Dimension(456, 421));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editnamaActionPerformed

    private void buttonprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonprosesActionPerformed
        // TODO add your handling code here:
        String nama = editnama.getText();
        hasilnama.setText(nama);
        String kelas = editkelas.getText();
        hasilkelas.setText(kelas);
        String alamat = editalamat.getText();
        hasilalamat.setText(alamat);
    }//GEN-LAST:event_buttonprosesActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonproses;
    private javax.swing.JTextField editalamat;
    private javax.swing.JTextField editkelas;
    private javax.swing.JTextField editnama;
    private javax.swing.JTextField hasilalamat;
    private javax.swing.JTextField hasilkelas;
    private javax.swing.JTextField hasilnama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
