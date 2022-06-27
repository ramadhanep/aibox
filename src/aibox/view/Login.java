/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package aibox.view;

import aibox.model.LoginInformation;
import aibox.utils.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author  Romadhan Edy
 * @version 1.0
 */
public class Login extends javax.swing.JFrame {
    
    Koneksi koneksi = new Koneksi();
    private ArrayList<LoginInformation> LoginInformation = new ArrayList<>();

    /** Creates new form Login */
    public Login() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        LoginLabelIDPegawai = new javax.swing.JLabel();
        LoginInputIDPegawai = new javax.swing.JTextField();
        LoginLabelKataSandi = new javax.swing.JLabel();
        LoginInputKataSandi = new javax.swing.JPasswordField();
        LoginButtonMasuk = new javax.swing.JButton();
        LogoText = new javax.swing.JLabel();
        LogoImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        Container.setBackground(new java.awt.Color(249, 249, 249));

        LoginLabelIDPegawai.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LoginLabelIDPegawai.setText("ID Pegawai");

        LoginInputIDPegawai.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        LoginLabelKataSandi.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LoginLabelKataSandi.setText("Kata Sandi");

        LoginInputKataSandi.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        LoginButtonMasuk.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LoginButtonMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aibox/img/ic-login.png"))); // NOI18N
        LoginButtonMasuk.setText(" Masuk");
        LoginButtonMasuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButtonMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonMasukActionPerformed(evt);
            }
        });

        LogoText.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        LogoText.setText("AIBOX");

        LogoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aibox/img/aibox-logo.png"))); // NOI18N
        LogoImg.setText("jLabel2");

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginLabelIDPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LoginButtonMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginLabelKataSandi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginInputIDPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginInputKataSandi, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LogoText)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(LogoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogoText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(LoginLabelIDPegawai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginInputIDPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(LoginLabelKataSandi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginInputKataSandi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(LoginButtonMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonMasukActionPerformed
        // TODO add your handling code here:
        String IdPegawai = LoginInputIDPegawai.getText();
        String KataSandi = LoginInputKataSandi.getText();
        String Nama;
        
        try {
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();

            String sql = "SELECT * FROM user WHERE id = '" + IdPegawai + "' AND kata_sandi = '" + KataSandi + "'";
            ResultSet r = s.executeQuery(sql);
            int CekLength = 0;
            while (r.next()) {
                CekLength++;
                Nama = r.getString("nama");
                JOptionPane.showMessageDialog(null, "Selamat datang, " + Nama + "!");
                this.setVisible(false);
                this.dispose();
                Layout uiLayout = new Layout();
                uiLayout.LoginInformation.add(new LoginInformation(IdPegawai, Nama));
                uiLayout.setVisible(true);
            }
            if (CekLength == 0) {
                JOptionPane.showMessageDialog(null, "ID Pegawai atau Kata Sandi salah!");
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ID Pegawai atau Kata Sandi salah!");
        }
    }//GEN-LAST:event_LoginButtonMasukActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JButton LoginButtonMasuk;
    private javax.swing.JTextField LoginInputIDPegawai;
    private javax.swing.JPasswordField LoginInputKataSandi;
    private javax.swing.JLabel LoginLabelIDPegawai;
    private javax.swing.JLabel LoginLabelKataSandi;
    private javax.swing.JLabel LogoImg;
    private javax.swing.JLabel LogoText;
    // End of variables declaration//GEN-END:variables

}
