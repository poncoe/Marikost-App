/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author J
 */
public class DaftarAkun extends javax.swing.JFrame {
    
    String Nama, Username, Password, ConfirmPassword;
    
    //database
    private Connection con;
    private Statement stat;
    private ResultSet res;

    /**
     * Creates new form DaftarAkun
     */
    public DaftarAkun() {
        initComponents();
        
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        
        // Matiin Resize / Maximize
        setResizable(false);
        
    }
    
    public boolean cekUsername(String username)
    {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `autentikasi` WHERE `username` =?";
        
        try {
            ps = Koneksi.getConnection().prepareStatement(query);
            ps.setString(1, username);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaftarAkun.class.getName()).log(Level.SEVERE, null, ex);
        }
         return checkUser;
    }
    
    // Beguna Untuk Membersihkan Text Field setelah registrasi maupun gagal registrasi
    
    public void penghapus() {
        txtNamaPengguna.setText("");
        txtPass.setText("");
        txtKonfirmasiPass.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNamaPengguna = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnDaftarAkun = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtKonfirmasiPass = new javax.swing.JPasswordField();
        btnKembali = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnDaftarMitra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marikost - Daftar Akun");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frameRegis"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hipwee-7-alasan-harus-punya-bisnis-kos-kosan-ZwmciGeY7s-2-750x419.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marikost-logo_jframe.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Daftar Akun?");

        jLabel6.setText("Nama Pengguna :");

        jLabel7.setText("Kata Sandi :");

        btnDaftarAkun.setBackground(new java.awt.Color(51, 204, 255));
        btnDaftarAkun.setText("Daftar Akun");
        btnDaftarAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarAkunActionPerformed(evt);
            }
        });

        jLabel8.setText("Konfirmasi Kata Sandi : ");

        btnKembali.setBackground(new java.awt.Color(51, 204, 255));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnDaftarMitra.setText("Pendaftaran Kemitraan");
        btnDaftarMitra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarMitraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDaftarAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNamaPengguna, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKonfirmasiPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6))
                            .addComponent(btnDaftarMitra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamaPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKonfirmasiPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDaftarAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDaftarMitra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaftarAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarAkunActionPerformed
        // TODO add your handling code here:
        String namapengguna = txtNamaPengguna.getText();
        String pass = String.valueOf(txtPass.getPassword());
        String re_pass = String.valueOf(txtKonfirmasiPass.getPassword());
                
        if(namapengguna.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Masukan Nama Pengguna!");
        }
        
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Masukan Kata Sandi!");
        }
        else if(!pass.equals(re_pass))
        {
            JOptionPane.showMessageDialog(null, "Masukan Konfirmasi Password / Password tidak cocok!");
        }
        
        else if(cekUsername(namapengguna))
        {
            JOptionPane.showMessageDialog(null, "Username Sudah Ada / Sudah Teregistrasi!");
            penghapus();
        }
        
        else{
            
        PreparedStatement ps;
        String query = "INSERT INTO `autentikasi`(`username`, `password`) VALUES (?,?)";
        
        try {
            ps = Koneksi.getConnection().prepareStatement(query);
            
            ps.setString(1, namapengguna);
            ps.setString(2, pass);
            
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Registrasi Berhasil, Silahkan Login!");
                penghapus();
                new Login().setVisible(true);
                this.dispose(); 
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DaftarAkun.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }//GEN-LAST:event_btnDaftarAkunActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnDaftarMitraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarMitraActionPerformed
        // TODO add your handling code here:
        new DaftarMitra().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDaftarMitraActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarAkun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftarAkun;
    private javax.swing.JButton btnDaftarMitra;
    private javax.swing.JButton btnKembali;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtKonfirmasiPass;
    private javax.swing.JTextField txtNamaPengguna;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
