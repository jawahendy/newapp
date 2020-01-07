
package com.janjipalsu.view;

import com.janjipalsu.conn.config;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.*;
import java.awt.print.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JanjiPalsu extends javax.swing.JFrame {

   
    public JanjiPalsu() {
        initComponents();
        datatable();
        Bersih();
    }
 //method tampilkan data
    private void datatable(){
    
    DefaultTableModel janji = new DefaultTableModel();
    janji.addColumn("no");
    janji.addColumn("ID Product");
    janji.addColumn("Nama Barang");
    janji.addColumn("tanggal");
    janji.addColumn("ID Jenis");
    janji.addColumn("Nama Kopi");
    janji.addColumn("Harga");
    janji.addColumn("Total");
    
  
    try{
        int no = 1;
        String sql = "select * from laporan";
        java.sql.Connection conn = (Connection) config.configDB();
        java.sql.Statement quer = conn.createStatement();
        java.sql.ResultSet list = quer.executeQuery(sql);
        while (list.next()){
            janji.addRow(new Object[]{no++, list.getString(1), list.getString(2), list.getString(3), list.getString(4), list.getString(5), list.getInt(6), list.getString(7)});
        }
        jTable1.setModel(janji);
    } catch (Exception e){
    }
}
    //method bersih
    private void Bersih(){
    
    txt_id.setText(null);
    txt_namaP.setText(null);
    dateChooserCombo1.setText(null);
    txt_idJ.setText(null);
    txt_namaK.setText(null);
    int_harga.setText(null);
    txt_totalP.setText(null);
    txt_search.setText(null);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_namaP = new javax.swing.JTextField();
        txt_idJ = new javax.swing.JTextField();
        txt_namaK = new javax.swing.JTextField();
        int_harga = new javax.swing.JTextField();
        txt_totalP = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_Print = new javax.swing.JButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Product ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 74, 25));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Product");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 74, 29));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tanggal");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 74, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Jenis");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 74, 31));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama Kopi");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 74, 28));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Harga");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 74, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Penjualan");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 35));

        txt_id.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txt_id.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 190, 25));

        txt_namaP.setMinimumSize(new java.awt.Dimension(2, 23));
        txt_namaP.setPreferredSize(new java.awt.Dimension(2, 23));
        txt_namaP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_namaPKeyTyped(evt);
            }
        });
        jPanel2.add(txt_namaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 190, 25));

        txt_idJ.setForeground(new java.awt.Color(51, 51, 51));
        txt_idJ.setMinimumSize(new java.awt.Dimension(2, 23));
        jPanel2.add(txt_idJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 190, 25));

        txt_namaK.setForeground(new java.awt.Color(51, 51, 51));
        txt_namaK.setMinimumSize(new java.awt.Dimension(2, 23));
        jPanel2.add(txt_namaK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 190, 25));

        int_harga.setForeground(new java.awt.Color(51, 51, 51));
        int_harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                int_hargaKeyTyped(evt);
            }
        });
        jPanel2.add(int_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 190, 25));

        txt_totalP.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txt_totalP.setForeground(new java.awt.Color(51, 51, 51));
        txt_totalP.setToolTipText("");
        jPanel2.add(txt_totalP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 190, 25));

        btn_simpan.setIcon(new javax.swing.ImageIcon("C:\\Users\\hendy nurfriyanto\\Documents\\NetBeansProjects\\JaniPalsu\\icon\\add_18px.png")); // NOI18N
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel2.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 40, -1));

        btn_update.setIcon(new javax.swing.ImageIcon("C:\\Users\\hendy nurfriyanto\\Documents\\NetBeansProjects\\JaniPalsu\\icon\\update_file_18px.png")); // NOI18N
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel2.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 40, -1));

        btn_hapus.setIcon(new javax.swing.ImageIcon("C:\\Users\\hendy nurfriyanto\\Documents\\NetBeansProjects\\JaniPalsu\\icon\\delete_18px.png")); // NOI18N
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel2.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 40, -1));

        btn_clear.setIcon(new javax.swing.ImageIcon("C:\\Users\\hendy nurfriyanto\\Documents\\NetBeansProjects\\JaniPalsu\\icon\\broom_18px.png")); // NOI18N
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel2.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 40, -1));

        btn_Print.setIcon(new javax.swing.ImageIcon("C:\\Users\\hendy nurfriyanto\\Documents\\NetBeansProjects\\JaniPalsu\\icon\\print_18px.png")); // NOI18N
        btn_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrintActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 40, -1));
        jPanel2.add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 190, 25));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hendy nurfriyanto\\Documents\\NetBeansProjects\\JaniPalsu\\icon\\coffee_beans__30px.png")); // NOI18N
        jLabel1.setText("KOPI JIWA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 294, 69));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\hendy nurfriyanto\\Documents\\NetBeansProjects\\JaniPalsu\\icon\\twitter_30px.png")); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\hendy nurfriyanto\\Documents\\NetBeansProjects\\JaniPalsu\\icon\\linkedin_30px.png")); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, -1, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\hendy nurfriyanto\\Documents\\NetBeansProjects\\JaniPalsu\\icon\\facebook_30px.png")); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, -1, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\hendy nurfriyanto\\Documents\\NetBeansProjects\\JaniPalsu\\icon\\instagram_new_30px.png")); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Product", "Nama Product", "Tanggal", "ID Jenis", "Nama Kopi", "Harga", "Total Penjualan"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        btn_search.setIcon(new javax.swing.ImageIcon("C:\\Users\\hendy nurfriyanto\\Documents\\NetBeansProjects\\JaniPalsu\\icon\\search_18px.png")); // NOI18N
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_search))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\hendy nurfriyanto\\Documents\\NetBeansProjects\\JaniPalsu\\icon\\minimize_window_30px.png")); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\hendy nurfriyanto\\Documents\\NetBeansProjects\\JaniPalsu\\icon\\delete_sign_30px.png")); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //untuk bisa diklik tablenya
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
      int baris = jTable1.getSelectedRow();
      String id_product = jTable1.getValueAt(baris, 1).toString();
      txt_id.setText(id_product);
      String nama_product = jTable1.getValueAt(baris, 2).toString();
      txt_namaP.setText(nama_product);
      String tanggal = jTable1.getValueAt(baris, 3).toString();
      dateChooserCombo1.setText(tanggal);
      String id_jenis = jTable1.getValueAt(baris, 4).toString();
      txt_idJ.setText(id_jenis);
      String nama_kopi = jTable1.getValueAt(baris, 5).toString();
      txt_namaK.setText(nama_kopi);
      String harga = jTable1.getValueAt(baris, 6).toString();
      int_harga.setText(harga);
      String total_penjualan = jTable1.getValueAt(baris, 7).toString();
      txt_totalP.setText(total_penjualan);
      
        
    }//GEN-LAST:event_jTable1MouseClicked

    
    //simpan button ke table
    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
       
     try {
         String sql = "INSERT INTO laporan VALUES ('"+txt_id.getText()+"','"+txt_namaP.getText()+"','"+dateChooserCombo1.getText()+"','"+txt_idJ.getText()+"','"+txt_namaK.getText()+"','"+Integer.parseInt(int_harga.getText())+"','"+txt_totalP.getText()+"')";
         java.sql.Connection hub = (java.sql.Connection)config.configDB();
         java.sql.PreparedStatement add = hub.prepareStatement(sql);
         add.execute();
         JOptionPane.showMessageDialog(null, "sukses");
     } catch (Exception e){
         JOptionPane.showMessageDialog(this, e.getMessage());
         }
     datatable();
     Bersih();
    }//GEN-LAST:event_btn_simpanActionPerformed

    //button untuk clear
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
       
        Bersih();
        
    }//GEN-LAST:event_btn_clearActionPerformed

    //untuk hapus button
    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        
       try{
           
           String sql = "delete from laporan where id_product ='"+txt_id.getText()+"'";
           java.sql.Connection hub =(Connection)config.configDB();
           java.sql.PreparedStatement hapus = hub.prepareStatement(sql);
           hapus.execute();
           JOptionPane.showMessageDialog(this, "sukses delete");
       } catch (Exception e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
        datatable();
        Bersih();
    }//GEN-LAST:event_btn_hapusActionPerformed

    //untuk search aplikasi
    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        
        DefaultTableModel search = new DefaultTableModel();
        search.addColumn("no");
        search.addColumn("ID Product");
        search.addColumn("Nama Barang");
        search.addColumn("tanggal");
        search.addColumn("ID Jenis");
        search.addColumn("Nama Kopi");
        search.addColumn("Harga");
        search.addColumn("Total");
        try{
            int no = 1;
            String sql = "select * from laporan where id_product like '%"+txt_search.getText()+"%'"+"or id_jenis like '%"+txt_search.getText()+"%'"+"or nama_kopi like '%"+txt_search.getText()+"%'";
            java.sql.Connection conn =(Connection) config.configDB();
            java.sql.Statement quer =conn.createStatement();
            java.sql.ResultSet list = quer.executeQuery(sql);
            while (list.next()){
                search.addRow(new Object[]{no++, list.getString(1), list.getString(2), list.getString(3), list.getString(4), list.getString(5), list.getInt(6), list.getString(7)});
            }
            jTable1.setModel(search);
       }catch (Exception e){
       
       }
        Bersih();
    }//GEN-LAST:event_btn_searchActionPerformed

    //untuk update aplikasi
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        
        try{
            String sql = "update laporan set nama_product  ='"+txt_namaP.getText()+"', tanggal = '"+dateChooserCombo1.getText()+"', id_jenis  ='"+txt_idJ.getText()+"', nama_kopi  = '"+txt_namaK.getText()+"', harga = '"+int_harga.getText()+"', total_penjualan  = '"+txt_totalP.getText()+"' where id_product = '"+txt_id.getText()+"'";
            java.sql.Connection hub =(Connection)config.configDB();
            java.sql.PreparedStatement ubah = hub.prepareStatement(sql);
            ubah.execute();
            JOptionPane.showMessageDialog(null, "sukses di ubah");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "gagal update"+e.getMessage());
        } 
        datatable();
        Bersih();
        
        
    }//GEN-LAST:event_btn_updateActionPerformed

    //validasi dalam harga tidak boleh character
    private void int_hargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_int_hargaKeyTyped
       
        char s=evt.getKeyChar();
        if(!Character.isDigit(s)){
        getToolkit().beep();
        evt.consume();
        }
        
    }//GEN-LAST:event_int_hargaKeyTyped

    //untuk print tanpa jasper
    private void btn_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrintActionPerformed
       MessageFormat header = new MessageFormat("Laporan Janji Palsu ");
       
       MessageFormat footer = new MessageFormat("1");
            
       try{
        jTable1.print(JTable.PrintMode.NORMAL, header, footer);
       }catch (java.awt.print.PrinterException e){
           System.err.format("Cannot print %s%n", e.getMessage());
       }
       
    }//GEN-LAST:event_btn_PrintActionPerformed

    private void txt_namaPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_namaPKeyTyped
        if(Character.isDigit(evt.getKeyChar())){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_namaPKeyTyped

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked


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
            java.util.logging.Logger.getLogger(JanjiPalsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanjiPalsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanjiPalsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanjiPalsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanjiPalsu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Print;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_update;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JTextField int_harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_idJ;
    private javax.swing.JTextField txt_namaK;
    private javax.swing.JTextField txt_namaP;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_totalP;
    // End of variables declaration//GEN-END:variables
}
