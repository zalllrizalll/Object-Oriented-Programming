/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Penjualan;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class FrmBeli extends javax.swing.JFrame {
    Connection conn;
    ResultSet RsBrg, RsSup;
    Statement stm;
    double total = 0;
    String tanggal;
    Boolean edit = false;
    String idBrg;
    String namaBrg;
    String hargaBrg;
    
    DefaultTableModel tableModel = new DefaultTableModel(
            new Object[][] {},
            new String[] {
                "Kode Barang", "Nama Barang", "Harga", "Jumlah", "Total"
            }
    );
    /**
     * Creates new form FrmBeli
     */
    public FrmBeli() {
        initComponents();
        open_db();
        inisialisasi_tabel();
        aktif(false);
        setTombol(true);
        txtTgl.setEditor(new JSpinner.DateEditor(txtTgl,"yyyy/MM/dd"));
        dataSupplier();
        dataBarang();
        nomorBeli();
        resetData();
        resetDetailBarang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // Method Koneksi Database
    private void open_db(){
        try{
            KoneksiMysql koneksi = new KoneksiMysql("localhost", "root", "", "penjualan");
            conn = koneksi.getConnection();
        } catch (Exception e){
            System.out.println("Error : "+e);
        }
    }
    // Method Hitung Penjualan
    private void hitung_jual(){
        double xTot, xHrg;
        int xJml;
        xHrg = Double.parseDouble(fieldHargaBarang.getText());
        xJml = Integer.parseInt(fieldJumlah.getText());
        xTot = xHrg * xJml;
        String xTotal = Double.toString(xTot);
        fieldTotalBarang.setText(xTotal);
        total += xTot;
        fieldTotal.setText(Double.toString(total));
    }
    // Method Read Data Konsumen
    private void dataSupplier(){
        try{
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String readSupplier = "Select kd_sup, nm_sup from supplier";
            RsSup = stm.executeQuery(readSupplier);
            RsSup.beforeFirst();
            while(RsSup.next()){
                cmbKodeSupplier.addItem(RsSup.getString(1).trim());
            }
            RsSup.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Method Read Data Barang
    private void dataBarang(){
        try{
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String readBarang = "Select * from barang";
            RsBrg = stm.executeQuery(readBarang);
            RsBrg.beforeFirst();
            while(RsBrg.next()){
                cmbKodeBarang.addItem(RsBrg.getString(1).trim());
            }
            RsBrg.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Method Read Data Barang -> Combo Barang Di Klik
    private void detailBarang(String xKode){
        try{
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String readDetailBarang = "Select * from barang where kd_brg = '"+xKode+"'";
            RsBrg = stm.executeQuery(readDetailBarang);
            RsBrg.beforeFirst();
            while(RsBrg.next()){
                fieldNamaBarang.setText(RsBrg.getString(2).trim());
                fieldHargaBarang.setText(Double.toString((Double) RsBrg.getDouble(4)));
            }
            RsBrg.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Method Read Data Konsumen -> Combo Barang Di Klik
    private void detailSupplier(String xKode){
        try{
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String readDetailSupplier = "Select * from supplier where kd_sup = '"+xKode+"'";
            RsSup = stm.executeQuery(readDetailSupplier);
            RsSup.beforeFirst();
            while(RsSup.next()){
                namaSupplier.setText(RsSup.getString(2).trim());
            }
            RsSup.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    // Set Model Table
    public void inisialisasi_tabel(){
        tblBarang.setModel(tableModel);
    }
    // Reset Data
    private void resetData(){
        noBeli.setText("");
        namaSupplier.setText("");
        fieldHargaBarang.setText("");
        fieldTotal.setText("");
    }
    // Reset Detail Barang
    private void resetDetailBarang(){
        fieldNamaBarang.setText("");
        fieldHargaBarang.setText("");
        fieldJumlah.setText("");
        fieldTotalBarang.setText("");
        fieldKodeBarang.setText("");
        fieldTotal.setText("");
    }
    // Enabled/Disabled Field Text
    private void aktif(boolean x){
        noBeli.setEnabled(x);
        dateChooser.setEnabled(x);
        cmbDate.setEnabled(x);
        cmbKodeSupplier.setEnabled(x);
        cmbKodeBarang.setEnabled(x);
        txtTgl.setEnabled(x);
        fieldJumlah.setEditable(x);
        fieldBayar.setEnabled(x);
    }
    // Enabled/Disabled Button
    private void setTombol(boolean t){
        btnTambah.setEnabled(t);
        btnSimpan.setEnabled(!t);
        btnBatal.setEnabled(!t);
        btnKeluar.setEnabled(t);
        btnHapusItem.setEnabled(!t);
    }
    // Create Number Sale Otomation
    private void nomorBeli(){
        try{
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "Select no_beli from beli";
            ResultSet RsNumber = stm.executeQuery(query);
            int row = 0;
            while(RsNumber.next()){
                row = RsNumber.getRow();
            }
            if(row == 0){
                noBeli.setText("1");
            } else {
                row += 1;
                noBeli.setText(Integer.toString(row));
            }
            RsNumber.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Simpan detail jual di table
    private void saveAtTable(){
        try{
            String columnKode = cmbKodeBarang.getSelectedItem().toString();
            String columnNama = fieldNamaBarang.getText();
            double columnHarga = Double.parseDouble(fieldHargaBarang.getText());
            int columnJumlah = Integer.parseInt(fieldJumlah.getText());
            double columnTotal = Double.parseDouble(fieldTotalBarang.getText());
            tableModel.addRow(new Object[]{
                columnKode,
                columnNama,
                columnHarga,
                columnJumlah,
                columnTotal
            });
            inisialisasi_tabel();
        } catch(Exception e){
            System.out.println("Error : "+e);
        }
    }
    // Simpan transaksi penjualan pada table di MySQL
    private void saveTransaction(){
        try{
            String x_noBeli = noBeli.getText();
            String x_kodeSupplier = cmbKodeSupplier.getSelectedItem().toString();
            // Function Format Tanggal
            formatDate();
            String query = "INSERT INTO beli VALUES ('"+x_noBeli+"', '"+x_kodeSupplier+"', '"+tanggal+"')";
            stm.executeUpdate(query);
            
            for(int i = 0; i < tblBarang.getRowCount(); i++){
                String kodeBarang = (String) tblBarang.getValueAt(i, 0);
                double harga = (Double) tblBarang.getValueAt(i, 2);
                int jumlah = (Integer) tblBarang.getValueAt(i, 3);
                String addTransaksi = "INSERT INTO dbeli VALUES ('"+x_noBeli+"', '"+kodeBarang+"', '"+harga+"', '"+jumlah+"')";
                stm.executeUpdate(addTransaksi);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Membuat Format Tanggal sesuai dengan MySQL
    private void formatDate(){
        String DATE_FORMAT = "yyyy-MM-dd";
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat(DATE_FORMAT);
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        tanggal = Integer.toString(year) +"-"+ Integer.toString(month) +"-"+ Integer.toString(day);
    }
    
    private class PrintingTask extends SwingWorker<Object, Object>{
        private final MessageFormat headerFormat;
        private final MessageFormat footerFormat;
        private final boolean interactive;
        private volatile boolean complete = false;
        private volatile String message;
        
        public PrintingTask(MessageFormat header, MessageFormat footer, boolean interactive){
            this.headerFormat = header;
            this.footerFormat = footer;
            this.interactive = interactive;
        }
        
        @Override
        protected Object doInBackground(){
            try{
                complete = text.print(headerFormat, footerFormat, true, null, null, interactive);
                message = "Printing "+(complete ? "complete" : "canceled");
            } catch(PrinterException ex){
                message = "Sorry, a printer error occured";
            } catch(SecurityException ex){
                message = "Sorry, cannot access the printer due to security reasons";
            }
            return null;
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        noBeli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTgl = new javax.swing.JSpinner();
        dateChooser = new com.toedter.calendar.JDateChooser();
        cmbDate = new datechooser.beans.DateChooserCombo();
        jLabel3 = new javax.swing.JLabel();
        cmbKodeSupplier = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        namaSupplier = new javax.swing.JTextField();
        cmbKodeBarang = new javax.swing.JComboBox<>();
        btnHapusItem = new javax.swing.JButton();
        fieldNamaBarang = new javax.swing.JTextField();
        btnPilihBarang = new javax.swing.JButton();
        fieldHargaBarang = new javax.swing.JTextField();
        fieldKodeBarang = new javax.swing.JTextField();
        fieldJumlah = new javax.swing.JTextField();
        fieldTotalBarang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fieldTotal = new javax.swing.JTextField();
        fieldBayar = new javax.swing.JTextField();
        fieldKembalian = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No. Beli");

        jLabel2.setText("Tgl. Beli");

        txtTgl.setModel(new javax.swing.SpinnerDateModel());

        jLabel3.setText("Kode Supplier");

        cmbKodeSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --" }));
        cmbKodeSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKodeSupplierActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Supplier");

        namaSupplier.setEditable(false);
        namaSupplier.setBackground(new java.awt.Color(0, 153, 153));

        cmbKodeBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --" }));
        cmbKodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKodeBarangActionPerformed(evt);
            }
        });

        btnHapusItem.setText("Hapus Item");
        btnHapusItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusItemActionPerformed(evt);
            }
        });

        fieldNamaBarang.setEditable(false);
        fieldNamaBarang.setBackground(new java.awt.Color(0, 153, 153));

        btnPilihBarang.setText("Pilih Barang");
        btnPilihBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihBarangActionPerformed(evt);
            }
        });

        fieldHargaBarang.setEditable(false);
        fieldHargaBarang.setBackground(new java.awt.Color(0, 153, 153));

        fieldKodeBarang.setEditable(false);
        fieldKodeBarang.setBackground(new java.awt.Color(0, 153, 153));

        fieldJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldJumlahActionPerformed(evt);
            }
        });

        fieldTotalBarang.setEditable(false);
        fieldTotalBarang.setBackground(new java.awt.Color(0, 153, 153));

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblBarang);

        text.setColumns(20);
        text.setRows(5);
        jScrollPane2.setViewportView(text);

        jLabel5.setText("Total");

        jLabel6.setText("Bayar");

        jLabel7.setText("Kembalian");

        fieldTotal.setEditable(false);
        fieldTotal.setBackground(new java.awt.Color(0, 153, 153));

        fieldBayar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldBayarFocusLost(evt);
            }
        });
        fieldBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBayarActionPerformed(evt);
            }
        });

        fieldKembalian.setEditable(false);
        fieldKembalian.setBackground(new java.awt.Color(0, 153, 153));

        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnCetak.setText("CETAK");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(fieldKembalian))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldTotal)
                                            .addComponent(fieldBayar)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(noBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbKodeSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(namaSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnHapusItem)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPilihBarang))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fieldNamaBarang)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fieldHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fieldTotalBarang))
                                    .addComponent(fieldKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatal)
                        .addGap(18, 18, 18)
                        .addComponent(btnCetak)
                        .addGap(18, 18, 18)
                        .addComponent(btnKeluar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(noBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(cmbKodeSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(namaSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTotalBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapusItem)
                    .addComponent(btnPilihBarang)
                    .addComponent(fieldKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(fieldKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnSimpan)
                    .addComponent(btnBatal)
                    .addComponent(btnCetak)
                    .addComponent(btnKeluar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusItemActionPerformed
        // TODO add your handling code here:
        resetDetailBarang();
    }//GEN-LAST:event_btnHapusItemActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        aktif(false);
        setTombol(true);
        resetData();
        resetDetailBarang();
        nomorBeli();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        String cetak = "Nota Penjualan\nNo : "+noBeli.getText()+"\nTanggal : "+tanggal+"\n"+"-------------------------------------------------------------------------------------------------\n"+"Kode\tNama Barang\tHarga\tJumlah\tTotal\n"+"-------------------------------------------------------------------------------------------------"; 
        for(int i = 0; i < tblBarang.getRowCount(); i++){
            String kodeBarang = (String)tblBarang.getValueAt(i, 0);
            String namaBarang = (String)tblBarang.getValueAt(i, 1);
            double harga = (Double)tblBarang.getValueAt(i, 2);
            int jumlah = (Integer)tblBarang.getValueAt(i, 3);
            double total = (Double)tblBarang.getValueAt(i, 4);
            cetak += "\n"+kodeBarang+"\t"+namaBarang+"\t"+harga+"\t"+jumlah+"\t"+total;
        }
        cetak += "\n"+"-------------------------------------------------------------------------------------------------";
        text.setText(cetak);
        String headerField = "";
        String footerField = "";
        MessageFormat header = new MessageFormat(headerField);
        MessageFormat footer = new MessageFormat(footerField);
        boolean interactive = true;
        boolean background = true;
        PrintingTask task = new PrintingTask(header, footer, interactive);
        if(background){
            task.execute();
        } else {
            task.run();
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        aktif(true);
        setTombol(false);
        resetData();
        nomorBeli();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        saveAtTable();
        saveTransaction();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void cmbKodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKodeBarangActionPerformed
        JComboBox cSatuan = (javax.swing.JComboBox)evt.getSource();
        //Membaca Item Yang Terpilih — > String
        String sSatuan = (String)cSatuan.getSelectedItem();
        detailBarang(sSatuan);
    }//GEN-LAST:event_cmbKodeBarangActionPerformed

    private void cmbKodeSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKodeSupplierActionPerformed
        JComboBox cSatuan = (javax.swing.JComboBox)evt.getSource();
        //Membaca Item Yang Terpilih — > String
        String sSatuan = (String)cSatuan.getSelectedItem();
        detailSupplier(sSatuan);
    }//GEN-LAST:event_cmbKodeSupplierActionPerformed

    private void fieldJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldJumlahActionPerformed
        hitung_jual();
    }//GEN-LAST:event_fieldJumlahActionPerformed

    private void btnPilihBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihBarangActionPerformed
        FrmSelectBarang2 fDB = new FrmSelectBarang2();
        fDB.fAC = this;
        fDB.setVisible(true);
        fDB.setResizable(false);
    }//GEN-LAST:event_btnPilihBarangActionPerformed

    private void fieldBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldBayarActionPerformed
        float bayar = Float.valueOf(fieldBayar.getText());
        float total = Float.valueOf(fieldTotal.getText());
        float kembalian = bayar - total;
        fieldKembalian.setText(Float.toString(kembalian));
    }//GEN-LAST:event_fieldBayarActionPerformed

    private void fieldBayarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldBayarFocusLost
        // TODO add your handling code here:
        double a = Double.parseDouble(fieldTotal.getText());
        double b = Double.parseDouble(fieldBayar.getText());
        double hasil = b-a;
        String xtotal = Double.toString(hasil);
        fieldKembalian.setText(xtotal);
    }//GEN-LAST:event_fieldBayarFocusLost
    
    public void itemTerpilih(){
        FrmSelectBarang2 fDB = new FrmSelectBarang2();
        fDB.fAC = this;
        fieldKodeBarang.setText(idBrg);
        fieldNamaBarang.setText(namaBrg);
        fieldHargaBarang.setText(hargaBrg);
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
            java.util.logging.Logger.getLogger(FrmBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBeli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnHapusItem;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnPilihBarang;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private datechooser.beans.DateChooserCombo cmbDate;
    private javax.swing.JComboBox<String> cmbKodeBarang;
    private javax.swing.JComboBox<String> cmbKodeSupplier;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JTextField fieldBayar;
    private javax.swing.JTextField fieldHargaBarang;
    private javax.swing.JTextField fieldJumlah;
    private javax.swing.JTextField fieldKembalian;
    private javax.swing.JTextField fieldKodeBarang;
    private javax.swing.JTextField fieldNamaBarang;
    private javax.swing.JTextField fieldTotal;
    private javax.swing.JTextField fieldTotalBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField namaSupplier;
    private javax.swing.JTextField noBeli;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextArea text;
    private javax.swing.JSpinner txtTgl;
    // End of variables declaration//GEN-END:variables
}
