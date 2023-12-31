/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Penjualan;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Acer
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuUtama = new javax.swing.JMenu();
        menuBarang = new javax.swing.JMenuItem();
        menuKonsumen = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuKeluar = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenu();
        menuLaporan = new javax.swing.JMenu();
        reportBarang = new javax.swing.JMenuItem();
        reportKonsumen = new javax.swing.JMenuItem();
        reportPenjualan = new javax.swing.JMenuItem();
        menuUtility = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        menuUtama.setText("Data Master");

        menuBarang.setText("Data Barang");
        menuBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarangActionPerformed(evt);
            }
        });
        menuUtama.add(menuBarang);

        menuKonsumen.setText("Data Konsumen");
        menuKonsumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKonsumenActionPerformed(evt);
            }
        });
        menuUtama.add(menuKonsumen);
        menuUtama.add(jSeparator2);

        menuKeluar.setText("Keluar");
        menuUtama.add(menuKeluar);

        jMenuBar1.add(menuUtama);

        menuTransaksi.setText("Transaksi");
        menuTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksiActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuTransaksi);

        menuLaporan.setText("Laporan");

        reportBarang.setText("Data Barang");
        reportBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBarangActionPerformed(evt);
            }
        });
        menuLaporan.add(reportBarang);

        reportKonsumen.setText("Data Konsumen");
        reportKonsumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportKonsumenActionPerformed(evt);
            }
        });
        menuLaporan.add(reportKonsumen);

        reportPenjualan.setText("Data Penjualan");
        reportPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportPenjualanActionPerformed(evt);
            }
        });
        menuLaporan.add(reportPenjualan);

        jMenuBar1.add(menuLaporan);

        menuUtility.setText("Utility");
        jMenuBar1.add(menuUtility);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // Panggil Form Barang
    private void menuBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarangActionPerformed
        // TODO add your handling code here:
        new FrmBarang().setVisible(true);
    }//GEN-LAST:event_menuBarangActionPerformed
    
    // Panggil Form Transaksi
    private void menuTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksiActionPerformed
        // TODO add your handling code here:
        // new FrmTransaksi().setVisible(true);
    }//GEN-LAST:event_menuTransaksiActionPerformed
    
    // Panggil Form Konsumen
    private void menuKonsumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKonsumenActionPerformed
        // TODO add your handling code here:
        new FrmKonsumen().setVisible(true);
    }//GEN-LAST:event_menuKonsumenActionPerformed

    private void reportBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBarangActionPerformed
        // TODO add your handling code here:
        try{
            KoneksiMysql koneksi = new KoneksiMysql("localhost", "root", "", "penjualan");
            String reportPath = "src/Report/report_barang.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, koneksi.getConnection());
            JasperViewer.viewReport(jp);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_reportBarangActionPerformed

    private void reportKonsumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportKonsumenActionPerformed
        // TODO add your handling code here:
        try{
            KoneksiMysql koneksi = new KoneksiMysql("localhost", "root", "", "penjualan");
            String reportPath = "src/Report/report_konsumen.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, koneksi.getConnection());
            JasperViewer.viewReport(jp);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_reportKonsumenActionPerformed

    private void reportPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportPenjualanActionPerformed
        // TODO add your handling code here:
        try{
            KoneksiMysql koneksi = new KoneksiMysql("localhost", "root", "", "penjualan");
            String reportPath = "src/Report/report_penjualan.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, koneksi.getConnection());
            JasperViewer.viewReport(jp);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_reportPenjualanActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem menuBarang;
    private javax.swing.JMenuItem menuKeluar;
    private javax.swing.JMenuItem menuKonsumen;
    private javax.swing.JMenu menuLaporan;
    private javax.swing.JMenu menuTransaksi;
    private javax.swing.JMenu menuUtama;
    private javax.swing.JMenu menuUtility;
    private javax.swing.JMenuItem reportBarang;
    private javax.swing.JMenuItem reportKonsumen;
    private javax.swing.JMenuItem reportPenjualan;
    // End of variables declaration//GEN-END:variables
}
