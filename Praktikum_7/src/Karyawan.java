import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Karyawan {
    int NIP, sts_pegawai, tunjanganAnak, jumlahHariMasuk;
    String name;

    public void inputKaryawan() throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----- DATA KARYAWAN -----");
        System.out.print("NIP\t : ");
        NIP = Integer.parseInt(input.readLine());
        System.out.print("Nama\t : ");
        name = input.readLine();
        System.out.println();
        System.out.println("----- JENIS KARYAWAN -----");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak\n");
        System.out.print("Input pilihan [1-2] : ");
        sts_pegawai = Integer.parseInt(input.readLine());
        System.out.println();
    }
}