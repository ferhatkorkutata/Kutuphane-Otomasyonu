/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class UsersLogin extends javax.swing.JFrame {

    /**
     * Creates new form UsersLogin
     */
    public UsersLogin() {
        initComponents();
        DataBase.DataBaseConnection.connect();
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
        username_users_edit_text = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password_users_edit_text = new javax.swing.JTextField();
        login_users_button = new javax.swing.JButton();
        change_password_button = new javax.swing.JButton();
        BtnUyeOl = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcı Girişi");
        setLocation(new java.awt.Point(450, 150));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kullanıcı Girişi");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kullanıcı Adı:");

        username_users_edit_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_users_edit_textActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Şifre:");

        password_users_edit_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_users_edit_textActionPerformed(evt);
            }
        });

        login_users_button.setBackground(new java.awt.Color(102, 102, 102));
        login_users_button.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        login_users_button.setForeground(new java.awt.Color(255, 255, 255));
        login_users_button.setText("Giriş");
        login_users_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_users_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_users_buttonActionPerformed(evt);
            }
        });

        change_password_button.setBackground(new java.awt.Color(102, 102, 102));
        change_password_button.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        change_password_button.setForeground(new java.awt.Color(255, 255, 255));
        change_password_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\Software\\icons for java\\Security-Password-2-icon.png")); // NOI18N
        change_password_button.setText("Şifre Değiştir");
        change_password_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        change_password_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_password_buttonActionPerformed(evt);
            }
        });

        BtnUyeOl.setBackground(new java.awt.Color(102, 102, 102));
        BtnUyeOl.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        BtnUyeOl.setForeground(new java.awt.Color(255, 255, 255));
        BtnUyeOl.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\Software\\icons for java\\Actions-user-group-new-icon (1).png")); // NOI18N
        BtnUyeOl.setText("Üye Ol");
        BtnUyeOl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnUyeOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUyeOlActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/kulanıcı.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(password_users_edit_text, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(username_users_edit_text, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(BtnUyeOl, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2))
                        .addComponent(login_users_button, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(change_password_button, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_users_edit_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_users_edit_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(login_users_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(change_password_button)
                .addGap(11, 11, 11)
                .addComponent(BtnUyeOl)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_users_edit_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_users_edit_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_users_edit_textActionPerformed

    private void password_users_edit_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_users_edit_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_users_edit_textActionPerformed

    private void login_users_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_users_buttonActionPerformed
        ConnectDataBase();
    }//GEN-LAST:event_login_users_buttonActionPerformed

    private void change_password_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_password_buttonActionPerformed
        ChangePasswordUsers changePasswordUsers=new ChangePasswordUsers();
        changePasswordUsers.setVisible(true);
        dispose();
    }//GEN-LAST:event_change_password_buttonActionPerformed

    private void BtnUyeOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUyeOlActionPerformed
        // TODO add your handling code here:
        Frmuyeol uyeolformu=new Frmuyeol();
        uyeolformu.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BtnUyeOlActionPerformed

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
            java.util.logging.Logger.getLogger(UsersLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersLogin().setVisible(true);
            }
        });
    }
    
    private boolean controlPassword(String username , String password){
        return username_users_edit_text.getText().equals(username) && password_users_edit_text.getText().equals(password) ;       
    }
    
    private void ConnectDataBase(){

            String sqlRequest = "select username , password from users where users_id=1 ";
            
            try {
                ResultSet resultSet = DataBase.DataBaseConnection.list(sqlRequest);
                
                while (resultSet.next()) {                                      
                    if (controlPassword(resultSet.getString("username"), resultSet.getString("password"))) {
                        nextScene();
                     break;
                    }
                }
            } catch (Exception e) {
            }

    }
    
    private void nextScene(){
        UsersPanel usersPanel=new UsersPanel();
        usersPanel.setVisible(true);
        dispose();
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUyeOl;
    private javax.swing.JButton change_password_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_users_button;
    private javax.swing.JTextField password_users_edit_text;
    private javax.swing.JTextField username_users_edit_text;
    // End of variables declaration//GEN-END:variables

    
}
