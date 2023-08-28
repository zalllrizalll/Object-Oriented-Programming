import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaryawanTetap extends Karyawan {
    double gajiPokok;

    public void inputData() throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----- KARYAWAN TETAP -----");
        System.out.print("Gaji Pokok\t : ");
        gajiPokok = Double.parseDouble(input.readLine());
        System.out.print("Tunjangan Anak\t : ");
        tunjanganAnak = Integer.parseInt(input.readLine());
        System.out.println("\t\t --------- +");
    }

    public double totalGaji(){
        return gajiPokok + (tunjanganAnak * (0.1 * gajiPokok));
    }
}