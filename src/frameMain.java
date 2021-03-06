
import com.sun.istack.internal.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mokleters
 */
public class frameMain extends javax.swing.JFrame {

    /**
     * Creates new form frameMain
     */
    
    String nol_jam = "";
    String nol_menit = "";
    String nol_detik = "";
    
    public frameMain() {
        initComponents();
        setTanggal();
        setJam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jamlabel = new javax.swing.JLabel();
        tanggalabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nis = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        l = new javax.swing.JRadioButton();
        p = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        kelas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        tempat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Tanggal = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        edit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("FORM BIODATA SISWA SMK TELKOM");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 20, 450, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("The Real Informatic Schools");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 80, 370, 30);

        jamlabel.setForeground(new java.awt.Color(240, 240, 240));
        jamlabel.setText("Jam");
        jPanel2.add(jamlabel);
        jamlabel.setBounds(660, 70, 130, 30);

        tanggalabel.setForeground(new java.awt.Color(240, 240, 240));
        tanggalabel.setText("Tanggal");
        jPanel2.add(tanggalabel);
        tanggalabel.setBounds(670, 20, 70, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 20, 950, 120);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Jenis Kelamin");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 270, 220, 30);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(2, 32, 280, 10);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel4.setText("ISIAN DATA SISWA");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(12, 2, 220, 30);
        jPanel3.add(email);
        email.setBounds(10, 410, 160, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("NIS");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(12, 32, 220, 30);

        nis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(nis);
        nis.setBounds(12, 62, 120, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Alamat");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 440, 220, 30);

        buttonGroup1.add(l);
        l.setText("Laki-Laki");
        jPanel3.add(l);
        l.setBounds(10, 300, 90, 23);

        buttonGroup1.add(p);
        p.setText("Perempuan");
        jPanel3.add(p);
        p.setBounds(110, 300, 100, 23);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Nama");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(12, 92, 220, 30);
        jPanel3.add(nama);
        nama.setBounds(12, 122, 170, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Kelas");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 320, 220, 30);
        jPanel3.add(kelas);
        kelas.setBounds(10, 350, 80, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Email");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 380, 220, 30);

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 470, 276, 96);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Tempat Lahir");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 150, 220, 30);
        jPanel3.add(tempat);
        tempat.setBounds(10, 180, 170, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Tanggal Lahir");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 210, 220, 30);
        jPanel3.add(Tanggal);
        Tanggal.setBounds(10, 240, 170, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 150, 300, 580);

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel4.add(edit);
        edit.setBounds(440, 10, 90, 40);

        save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel4.add(save);
        save.setBounds(10, 10, 90, 40);

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel4.add(clear);
        clear.setBounds(220, 10, 90, 40);

        refresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel4.add(refresh);
        refresh.setBounds(330, 70, 90, 40);

        delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete);
        delete.setBounds(110, 70, 90, 40);

        print.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel4.add(print);
        print.setBounds(540, 70, 90, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(320, 150, 640, 120);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        table.setBackground(new java.awt.Color(255, 204, 153));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "TempatLahir", "TanggalLahir", "JenisKelamin", "Kelas", "Email", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 20, 620, 410);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(320, 290, 640, 440);

        setBounds(0, 0, 982, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(Tanggal.getDate());
        String jk = "";
            if (l.isSelected()){
                jk="L";
            } 
            if (p.isSelected())
                jk = "P";
            
            
        if(nis.getText().equals("") ||
           nama.getText().equals("") ||
           tempat.getText().equals("") ||
           tanggal.equals("") ||
                jk.equals("") ||
           kelas.getText().equals("") ||
                email.getText().equals("") ||
                alamat.getText().equals("")
         
           
           ){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            
            String SQL = "INSERT INTO t_siswa (NIS,NamaSiswa,TempatLahir,TanggalLahir,JenisKelamin,Kelas,Email,Alamat)"
                    + "VALUES"
                    + "('"+nis.getText()+"',"
                    + "'"+nama.getText()+"',"
                    + "'"+tempat.getText()+"',"
                    + "'"+tanggal+"',"
                    + "'"+jk+"',"
                    + "'"+kelas.getText()+"',"
                    + "'"+email.getText()+"',"
                    + "'"+alamat.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if(status == 1){
            
               JOptionPane.showMessageDialog(this, "data berhasil ditambahkan", "sukses", JOptionPane.INFORMATION_MESSAGE);
               selectData();
            }  else {
                JOptionPane.showMessageDialog(this, "data gagal ditambahkan", "sukses", JOptionPane.WARNING_MESSAGE);
            } 
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        int baris = table.getSelectedRow();
        if (baris != -1){
            String NIS = table.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if(status==1){
                JOptionPane.showMessageDialog(this, "data berhasil dihapus","sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "data gagal dihapus","gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "pilih bais data terlebih dahulu", "error", JOptionPane.WARNING_MESSAGE);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
       nama.setText("");
       nis.setText("");
       tempat.setText("");
       Tanggal.setDate(null);
       kelas.setText("");
       buttonGroup1.clearSelection();
       email.setText("");
       alamat.setText("");
   
  

        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
            
        selectData();
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

        
        
       if ("".equals(nis.getText()) || 
           "".equals(nama.getText()) ||
           "".equals(tempat.getText()) ||
           "".equals(kelas.getText()) || 
            
           "".equals(email.getText()) ||
           "".equals(alamat.getText())
               ){
         JOptionPane.showMessageDialog(this, "Harap lengkapi data","Error", JOptionPane.WARNING_MESSAGE);
       }   else {
           String jk ="";
           if(l.isSelected()){
               jk="L";
           } else {
               jk = "P";
           }
           
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(Tanggal.getDate());
           String SQL = "UPDATE t_siswa SET" 
                   + "NamaSiswa='"+nama.getText()+"',"
                   + "TempatLahir='"+tempat.getText()+"',"
                   
                   + "TanggalLahir='"+tanggal+"',"
                  + "JenisKelamin='"+jk+"',"
                   + "Kelas='"+kelas.getText()+"',"
                   + "Email='"+email.getText()+"'"
                   + "Alamat='"+alamat.getText()+"'"
                   + "WHERE t_siswa NIS='"+nis.getText()+"'"
                   ;
           int status = KoneksiDB.execute(SQL);
           if(status == 0){
               JOptionPane.showMessageDialog(this, "data berhasil diupdate","sukses", JOptionPane.INFORMATION_MESSAGE);
               selectData();
           } else {
               JOptionPane.showMessageDialog(this, "data gagal diupdate", "sukses", JOptionPane.WARNING_MESSAGE);
           }
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    
        int baris = table.getSelectedRow();
        if (baris != -1){
            nis.setText(table.getValueAt(baris, 0).toString());
           
            nama.setText(table.getValueAt(baris, 1).toString());
            tempat.setText(table.getValueAt(baris, 2).toString());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = table.getValueAt(baris, 3).toString();
        Date tgl;
        try{
            tgl = dateFormat.parse(tanggal);
            Tanggal.setDate(tgl);
        } catch (ParseException ex) {
           // Logger.getLogger(frameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        String jk= table.getValueAt(baris, 4).toString();
            if (jk.equals("Laki-Laki")){
                l.setSelected(true);
            } else {
                p.setSelected(true);
            }
            kelas.setText(table.getValueAt(baris, 5).toString());
            email.setText(table.getValueAt(baris, 6).toString());
            alamat.setText(table.getValueAt(baris, 7).toString());
        }
    
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        
        MessageFormat header = new MessageFormat("Biodata Siswa SMK Telkom Malang");
        MessageFormat footer = new MessageFormat("Page (0,number,integer)   ");
        
        try {
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("cannot print %s%n", e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed
    
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
            java.util.logging.Logger.getLogger(frameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Tanggal;
    private javax.swing.JTextArea alamat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jamlabel;
    private javax.swing.JTextField kelas;
    private javax.swing.JRadioButton l;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nis;
    private javax.swing.JRadioButton p;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JTable table;
    private javax.swing.JLabel tanggalabel;
    private javax.swing.JTextField tempat;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"NIS","NamaSiswa","TempatLahir","TanggalLahir","JenisKelamin","Kelas","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()) {
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String TempatLahir = rs.getString(3);
                String TanggalLahir = rs.getString(4);
                String JenisKelamin = "";
                if ("L".equals(rs.getString(5))){
                    JenisKelamin = "Laki-Laki";
                } else {
                    JenisKelamin = "Perempuan";
                }
                String Kelas = rs.getString(6);
                String Email = rs.getString(7);
                String Alamat = rs.getString(8);
                String data[] = {NIS,NamaSiswa,TempatLahir,TanggalLahir,JenisKelamin,Kelas,Email,Alamat};
                dtm.addRow(data);
            }
         
        } catch (SQLException ex){
        //Logger.getLogger(frameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        table.setModel(dtm);
    }
    
    public void setTanggal(){
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new
            java.text.SimpleDateFormat("dd/MM/yyyy");
        tanggalabel.setText(kal.format(skrg));
    }
    
    public void setJam(){
        ActionListener taskPerformed = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if(nilai_jam <= 9 ){
                    nol_jam = "0";
                }
                if(nilai_menit <= 9 ){
                    nol_menit = "0";
                }
                if(nilai_detik <= 9 ){
                    nol_detik = "0";
                }
                
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                jamlabel.setText("Jam "+jam + ":" + menit + ":" + detik);
                
            }
        };
        new Timer(100, taskPerformed).start();
    }
    
}
