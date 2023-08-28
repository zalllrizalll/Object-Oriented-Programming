import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class KaryawanDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat decimal = new DecimalFormat("##, ###, ##0.00");
        String lanjut;
        Karyawan karyawan = new Karyawan();
        do{
            karyawan.inputKaryawan();
            switch(karyawan.sts_pegawai){
                case 1 -> {
                    KaryawanTetap karyawanTetap = new KaryawanTetap();
                    karyawanTetap.inputData();
                    System.out.println("Gaji Diterima\t : Rp." + decimal.format(karyawanTetap.totalGaji()));
                }
                case 2 -> {
                    KaryawanKontrak karyawanKontrak = new KaryawanKontrak();
                    karyawanKontrak.inputData();
                    System.out.println("Upah Diterima\t : Rp." + decimal.format(karyawanKontrak.totalUpah()));
                }
                default -> System.out.println("404 Not Found");
            }
            System.out.print("\nInput Kembali [Y/T] : ");
            lanjut = input.readLine();
            System.out.println();
        } while(lanjut.equalsIgnoreCase("Y"));
    }
}