/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Asus
 */
public class Kitapİslemleri extends javax.swing.JFrame {

    static void setModel(DefaultTableModel defaultTableModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    DefaultTableModel defaultTableModel=new DefaultTableModel();
    Object[] coloms={"BarkodNumarasi","KitapAdi","KitapYazari","KitapBaskıYılı","KitapSayfaSayisi","Dil","KitapYayınevi","Durum"};
    static int getSelectedRow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object[] line=new Object[8];

    /**
     * Creates new form AdminPanel
     */
    public Kitapİslemleri() {
        initComponents();
      
        showTable();
//       kontrolislemi();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Durum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        KitapYazari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BtnTemizle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnCikis = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BtnGeriDonus = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        BarkodNumarasi = new javax.swing.JTextField();
        KitapBaskıYılı = new javax.swing.JTextField();
        KitapAdi = new javax.swing.JTextField();
        KitapSayfaSayisi = new javax.swing.JTextField();
        InsertButton = new javax.swing.JButton();
        Dil = new javax.swing.JTextField();
        DeletedButton = new javax.swing.JButton();
        KitapYayınevi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AdminPanel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yönetici Paneli");
        setLocation(new java.awt.Point(200, 50));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kitap Yazarı :");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kitap Baskı Yılı:");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kitap Sayfa Sayısı :");

        BtnTemizle.setBackground(new java.awt.Color(0, 0, 0));
        BtnTemizle.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        BtnTemizle.setForeground(new java.awt.Color(255, 255, 255));
        BtnTemizle.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\Software\\icons for java\\blue-document-cross-icon 32.png")); // NOI18N
        BtnTemizle.setText("Temizle");
        BtnTemizle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTemizleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Barkod Numarası :");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kitabın Dili :");

        BtnCikis.setBackground(new java.awt.Color(0, 0, 0));
        BtnCikis.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        BtnCikis.setForeground(new java.awt.Color(255, 255, 255));
        BtnCikis.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\Software\\icons for java\\blue-cross-icon (1).png")); // NOI18N
        BtnCikis.setText("Çıkış Yap");
        BtnCikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCikisActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kitap Adı:");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kitap Yayınevi :");

        BtnGeriDonus.setBackground(new java.awt.Color(0, 0, 0));
        BtnGeriDonus.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        BtnGeriDonus.setForeground(new java.awt.Color(255, 255, 255));
        BtnGeriDonus.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\Software\\icons for java\\Actions-go-previous-icon.png")); // NOI18N
        BtnGeriDonus.setText("Önceki Menüye Dön");
        BtnGeriDonus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGeriDonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGeriDonusActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Durum :");

        InsertButton.setBackground(new java.awt.Color(0, 0, 0));
        InsertButton.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        InsertButton.setForeground(new java.awt.Color(255, 255, 255));
        InsertButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\Software\\icons for java\\Floppy-Small-icon.png")); // NOI18N
        InsertButton.setText("    Ekle");
        InsertButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        DeletedButton.setBackground(new java.awt.Color(0, 0, 0));
        DeletedButton.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        DeletedButton.setForeground(new java.awt.Color(255, 255, 255));
        DeletedButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\Software\\icons for java\\trash-blue-full-icon.png")); // NOI18N
        DeletedButton.setText("   Çıkar");
        DeletedButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeletedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletedButtonActionPerformed(evt);
            }
        });

        AdminPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        AdminPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminPanelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AdminPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(KitapBaskıYılı)
                            .addComponent(BarkodNumarasi)
                            .addComponent(KitapAdi)
                            .addComponent(KitapSayfaSayisi)
                            .addComponent(Dil)
                            .addComponent(KitapYayınevi)
                            .addComponent(Durum)
                            .addComponent(KitapYazari, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(DeletedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGeriDonus)
                    .addComponent(BtnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(BarkodNumarasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(KitapAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(KitapYazari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KitapBaskıYılı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(KitapSayfaSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Dil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(KitapYayınevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Durum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InsertButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeletedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnTemizle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnGeriDonus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(682, 682, 682))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
        
        
            String Barkod=BarkodNumarasi.getText();
            
            boolean cevap = kontrolislemi();
            if (cevap==true){
                JFrame f=new JFrame();
                JOptionPane.showMessageDialog(f,"Bu Barkod Numarası Zaten Var");
            }
            else {
                
            String BarkodNumarasii, KitapAdii,KitapYazarii,KitapBaskıYılıı,KitapSayfaSayisii,Dill,KitapYayınevii,Durumm;
            BarkodNumarasii=BarkodNumarasi.getText();
            KitapAdii=KitapAdi.getText();
            KitapYazarii=KitapYazari.getText();
            KitapBaskıYılıı=KitapBaskıYılı.getText();
            KitapSayfaSayisii=KitapSayfaSayisi.getText();
            Dill=Dil.getText();
            KitapYayınevii=KitapYayınevi.getText();
            Durumm=Durum.getText();
       
            String insertSQL = "INSERT INTO kitaplar (BarkodNumarasi,KitapAdi,KitapYazari,KitapBaskıYılı,KitapSayfaSayisi,Dil,KitapYayınevi,Durum )"+ "VALUES ('" + BarkodNumarasii +"' ,'" + KitapAdii +"' ,'"+KitapYazarii+"' ,'" +KitapBaskıYılıı+ "' ,'" +KitapSayfaSayisii+"' ,'" +Dill+"' ,'" +KitapYayınevii+"' ,'" +Durumm+"')";
            DataBase.DataBaseConnection.insert(insertSQL);
            defaultTableModel.setColumnCount(0);
            defaultTableModel.setRowCount(0);
            showTable();
             
            }
             
    }//GEN-LAST:event_InsertButtonActionPerformed

    private void AdminPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminPanelMouseClicked

        BarkodNumarasi.setText((String) defaultTableModel.getValueAt(AdminPanel.getSelectedRow(), 0));
        KitapAdi.setText((String) defaultTableModel.getValueAt(AdminPanel.getSelectedRow(), 1));
        KitapYazari.setText((String) defaultTableModel.getValueAt(AdminPanel.getSelectedRow(), 2));
        KitapBaskıYılı.setText((String) defaultTableModel.getValueAt(AdminPanel.getSelectedRow(), 3));
        KitapSayfaSayisi.setText((String) defaultTableModel.getValueAt(AdminPanel.getSelectedRow(), 4));
        Dil.setText((String) defaultTableModel.getValueAt(AdminPanel.getSelectedRow(), 5));
        KitapYayınevi.setText((String) defaultTableModel.getValueAt(AdminPanel.getSelectedRow(), 6));
        Durum.setText((String) defaultTableModel.getValueAt(AdminPanel.getSelectedRow(), 7));
    }//GEN-LAST:event_AdminPanelMouseClicked

    private void DeletedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletedButtonActionPerformed
        String BarkodNumarasii;
        BarkodNumarasii=BarkodNumarasi.getText();
        String deletedSQL = "DELETE FROM kitaplar WHERE BarkodNumarasi= '" + BarkodNumarasii + "'";
        System.out.println(deletedSQL);
        DataBase.DataBaseConnection.insert(deletedSQL);
        defaultTableModel.setColumnCount(0);
        defaultTableModel.setRowCount(0);
        showTable();

    }//GEN-LAST:event_DeletedButtonActionPerformed

    private void BtnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTemizleActionPerformed
                   // TODO add your handling code here:
        BarkodNumarasi.setText("");
        KitapAdi.setText("");
        KitapYazari.setText("");
        KitapBaskıYılı.setText("");
        KitapSayfaSayisi.setText("");
        Dil.setText("");
        KitapYayınevi.setText("");
        Durum.setText("");
    }//GEN-LAST:event_BtnTemizleActionPerformed

    private void BtnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCikisActionPerformed
        dispose ();
    }//GEN-LAST:event_BtnCikisActionPerformed

    private void BtnGeriDonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGeriDonusActionPerformed
        // TODO add your handling code here:
        Adminİslemleri  frm3 = new Adminİslemleri();
        frm3.setVisible(true); 
        dispose();
    }//GEN-LAST:event_BtnGeriDonusActionPerformed

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
            java.util.logging.Logger.getLogger(Kitapİslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kitapİslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kitapİslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kitapİslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kitapİslemleri().setVisible(true);
            }
        });
    }
    
    private void showTable(){
        
        String sqlRequest = "select * from kitaplar ";
        ResultSet resultSet=DataBase.DataBaseConnection.list(sqlRequest);
        defaultTableModel.setColumnIdentifiers(coloms);
        try {
            while(resultSet.next()){
                line[0]=resultSet.getString("BarkodNumarasi");
                line[1]=resultSet.getString("KitapAdi");
                line[2]=resultSet.getString("KitapYazari");
                line[3]=resultSet.getString("KitapBaskıYılı");
                line[4]=resultSet.getString("KitapSayfaSayisi");
                line[5]=resultSet.getString("Dil");
                line[6]=resultSet.getString("KitapYayınevi");
                line[7]=resultSet.getString("Durum");
                defaultTableModel.addRow(line);
            }
            AdminPanel.setModel(defaultTableModel);
        } catch (Exception e) {
            e.printStackTrace();

            
    }
    }
   
    public boolean kontrolislemi(){
        String BarkodNumarasii;
        BarkodNumarasii=BarkodNumarasi.getText();
        String aramasorgu = "Select * FROM kitaplar WHERE BarkodNumarasi='" + BarkodNumarasii + "'";
        System.out.println(aramasorgu);
        ResultSet resultSet=DataBase.DataBaseConnection.list(aramasorgu);
        
        try {
             while(resultSet.next()){
                 System.out.println(resultSet.getString("BarkodNumarasi"));
        if (BarkodNumarasii.equals(resultSet.getString("BarkodNumarasi")) ) {
            System.out.println("true sonuç");
            return true ;
            
        }
        
        }
            }
           
         catch (Exception e) {
            e.printStackTrace();

    }
          return false;
    
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AdminPanel;
    private javax.swing.JTextField BarkodNumarasi;
    private javax.swing.JButton BtnCikis;
    private javax.swing.JButton BtnGeriDonus;
    private javax.swing.JButton BtnTemizle;
    private javax.swing.JButton DeletedButton;
    private javax.swing.JTextField Dil;
    private javax.swing.JTextField Durum;
    private javax.swing.JButton InsertButton;
    private javax.swing.JTextField KitapAdi;
    private javax.swing.JTextField KitapBaskıYılı;
    private javax.swing.JTextField KitapSayfaSayisi;
    private javax.swing.JTextField KitapYayınevi;
    private javax.swing.JTextField KitapYazari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}