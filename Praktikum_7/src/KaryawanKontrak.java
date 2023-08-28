import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaryawanKontrak extends Karyawan {
    double upahHarian;

    public void inputData() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----- KARYAWAN KONTRAK -----");
        System.out.print("Upah Harian\t : ");
        upahHarian = Double.parseDouble(input.readLine());
        System.out.print("Jumlah Masuk\t : ");
        jumlahHariMasuk = Integer.parseInt(input.readLine());
        System.out.print("Tunjangan Anak\t : ");
        tunjanganAnak = Integer.parseInt(input.readLine());
        System.out.println("\t\t ----------- +");
    }

    public double totalUpah(){
        return (jumlahHariMasuk * upahHarian) + (tunjanganAnak * (0.1 * (jumlahHariMasuk * upahHarian)));
    }
}