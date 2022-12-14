/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bad_uas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author liwax
 */
public class InputBarang extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement PStatement = null;
    ResultSet rs = null;
    Statement stmt = null;
    /**
     * Creates new form inputBarang
     */
    public String kb = null;
    public boolean isUpdate = false;
    public InputBarang() {
        initComponents();
        loadKategori();
        loadSatuan();
        System.out.println(isUpdate);
        System.out.print(kb);
        if(isUpdate){
            loadData(kb);
            System.out.print("load data");
        }
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxKategori = new javax.swing.JComboBox<>();
        kd_barang = new javax.swing.JTextField();
        nm_barang = new javax.swing.JTextField();
        cbxSatuan1 = new javax.swing.JComboBox<>();
        cbxSatuan2 = new javax.swing.JComboBox<>();
        cbxSatuan3 = new javax.swing.JComboBox<>();
        cbxSatuan4 = new javax.swing.JComboBox<>();
        cbxSatuan5 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        harga_barang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Kategori :");

        jLabel2.setText("Kode Barang :");

        jLabel3.setText("Nama :");

        jLabel4.setText("Satuan 1 :");

        jLabel5.setText("Satuan 2 :");

        jLabel6.setText("Satuan 3 :");

        jLabel7.setText("Satuan 4 :");

        jLabel8.setText("Satuan 5 :");

        cbxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxKategoriActionPerformed(evt);
            }
        });

        kd_barang.setToolTipText("");

        cbxSatuan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxSatuan2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxSatuan3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxSatuan4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxSatuan5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Harga :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxKategori, 0, 193, Short.MAX_VALUE)
                                    .addComponent(kd_barang)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nm_barang)
                                    .addComponent(harga_barang))))
                        .addGap(0, 98, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(cbxSatuan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSatuan5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSatuan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSatuan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSatuan4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kd_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nm_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(harga_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxSatuan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxSatuan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxSatuan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxSatuan4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxSatuan5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new DaftarBarang().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxKategoriActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        submitForm();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if(isUpdate){
            loadData(kb);
        }
    }//GEN-LAST:event_formWindowOpened
    
    private void loadData(String kb){
        conn = DBConnect.DBConnect();
        String sql = "SELECT * FROM barang WHERE Kd_barang = '"+kb+"';";
       try {
           PStatement = conn.prepareStatement(sql);
           rs = PStatement.executeQuery();
           if(rs.next()){
               cbxKategori.setSelectedItem(rs.getString("kategori"));
               cbxSatuan1.setSelectedItem(rs.getString("satuan1"));
               cbxSatuan2.setSelectedItem(rs.getString("satuan2"));
               cbxSatuan3.setSelectedItem(rs.getString("satuan3"));
               cbxSatuan4.setSelectedItem(rs.getString("satuan4"));
               cbxSatuan5.setSelectedItem(rs.getString("satuan5"));
               kd_barang.setText(rs.getString("Kd_Barang"));
               nm_barang.setText(rs.getString("Nm_Barang"));
               harga_barang.setText(rs.getString("Harga"));
           }
           
       } catch(Exception ex) {
           System.out.println("Error: "+ex);
       }
    }
    
    private void loadKategori(){
        conn = DBConnect.DBConnect();
        String sql = "SELECT * FROM kategori";
       try {
           
           PStatement = conn.prepareStatement(sql);
           rs = PStatement.executeQuery();
           cbxKategori.removeAllItems();
           while(rs.next()){
               cbxKategori.addItem(rs.getString("Nm_Kategori"));
           }
           
       } catch(Exception ex) {
           System.out.println("Error: "+ex);
       }
    }
    
    private void loadSatuan(){
        conn = DBConnect.DBConnect();
        String sql = "SELECT * FROM satuan";
       try {
           
           PStatement = conn.prepareStatement(sql);
           rs = PStatement.executeQuery();
           cbxSatuan1.removeAllItems();
           cbxSatuan2.removeAllItems();
           cbxSatuan3.removeAllItems();
           cbxSatuan4.removeAllItems();
           cbxSatuan5.removeAllItems();
           while(rs.next()){
               cbxSatuan1.addItem(rs.getString("Nm_Satuan"));
               cbxSatuan2.addItem(rs.getString("Nm_Satuan"));
               cbxSatuan3.addItem(rs.getString("Nm_Satuan"));
               cbxSatuan4.addItem(rs.getString("Nm_Satuan"));
               cbxSatuan5.addItem(rs.getString("Nm_Satuan"));
           }
           
       } catch(Exception ex) {
           System.out.println("Error: "+ex);
       }
    }
    
    private boolean checkJenisSatuan(String s1,String s2,String s3,String s4,String s5){
        if(s1.equals(s2)  || s1.equals(s3) || s1.equals(4) || s1.equals(s5)) {
            return false;
        } else {
            return true;
        }
    }
    
    private void submitForm(){
        String kode_barang = kd_barang.getText();
        String nama_barang = nm_barang.getText();
        int hrg_barang = (int) Double.parseDouble(harga_barang.getText());
        String kategori_barang = (String)cbxKategori.getSelectedItem();
        String satuan1 = (String)cbxSatuan1.getSelectedItem();
        String satuan2 = (String)cbxSatuan2.getSelectedItem();
        String satuan3 = (String)cbxSatuan3.getSelectedItem();
        String satuan4 = (String)cbxSatuan4.getSelectedItem();
        String satuan5 = (String)cbxSatuan5.getSelectedItem();
        
        if(checkJenisSatuan(satuan1,satuan2,satuan3,satuan4,satuan5)){
            if(kb == null){
                String sql = "INSERT INTO barang(Kd_Barang, Nm_Barang, Harga, kategori, satuan1, satuan2, satuan3, satuan4, satuan5) VALUES('"+kode_barang+"','"+nama_barang+"','"+hrg_barang+"','"+kategori_barang+"','"+satuan1+"','"+satuan2+"','"+satuan3+"','"+satuan4+"','"+satuan5+"')";
                try {
                   stmt = conn.createStatement();
                  if(stmt.executeUpdate(sql) == 1){
                      JOptionPane.showMessageDialog(null,"Success","INSERT",JOptionPane.INFORMATION_MESSAGE);
                      new DaftarBarang().setVisible(true);
                      this.setVisible(false);
                  } else {
                      JOptionPane.showMessageDialog(null,"Opps?! Something went wrong","INSERT",JOptionPane.WARNING_MESSAGE);
                  }

               } catch(Exception ex) {
                   System.out.println("Error: "+ex);
               }
            } else {
                String sql = "UPDATE barang SET Nm_Barang='"+nama_barang+"', Harga='"+hrg_barang+"', kategori='"+kategori_barang+"', satuan1='"+satuan1+"', satuan2='"+satuan2+"', satuan3='"+satuan3+"', satuan4='"+satuan4+"', satuan5='"+satuan5+"' WHERE Kd_Barang='"+kb+"';";
                try {
                   stmt = conn.createStatement();
                  if(stmt.executeUpdate(sql) == 1){
                      JOptionPane.showMessageDialog(null,"Success","Update",JOptionPane.INFORMATION_MESSAGE);
                      new DaftarBarang().setVisible(true);
                      this.setVisible(false);
                  } else {
                      JOptionPane.showMessageDialog(null,"Opps?! Something went wrong","Update",JOptionPane.WARNING_MESSAGE);
                  }

               } catch(Exception ex) {
                   System.out.println("Error: "+ex);
               }
            }
        } else {
            JOptionPane.showMessageDialog(null,"Jenis Satuan tidak boleh sama!","INSERT",JOptionPane.WARNING_MESSAGE);
        }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxKategori;
    private javax.swing.JComboBox<String> cbxSatuan1;
    private javax.swing.JComboBox<String> cbxSatuan2;
    private javax.swing.JComboBox<String> cbxSatuan3;
    private javax.swing.JComboBox<String> cbxSatuan4;
    private javax.swing.JComboBox<String> cbxSatuan5;
    private javax.swing.JTextField harga_barang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kd_barang;
    private javax.swing.JTextField nm_barang;
    // End of variables declaration//GEN-END:variables
}
