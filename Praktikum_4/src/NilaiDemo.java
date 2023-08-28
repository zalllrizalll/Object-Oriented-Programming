import java.util.ArrayList;
import java.util.Scanner;

public class NilaiDemo {
    public static void main(String[] args) {
        String nim, nama;
        float nilaiTugas, nilaiUts, nilaiUas;
        ArrayList<Nilai> nilaiMhs = new ArrayList<Nilai>();
        String pilih;
        //Nilai[] nilaiMhs;
        Scanner input = new Scanner(System.in);

        do{
            // Tambah Elemen ke dalam ArrayList
            System.out.println("\n============ Input Data ============\n");
            System.out.print("NIM\t\t : ");nim = input.nextLine();
            System.out.print("Nama\t\t : ");nama = input.nextLine();
            System.out.print("Nilai Tugas\t : ");nilaiTugas = input.nextFloat();
            System.out.print("Nilai UTS\t : ");nilaiUts = input.nextFloat();
            System.out.print("Nilai UAS\t : ");nilaiUas = input.nextFloat();
            System.out.println("====================================");
            // Create Instance of Object
            Nilai nilai = new Nilai(nim, nama, nilaiTugas, nilaiUts, nilaiUas);
            nilaiMhs.add(nilai);
            nilai.hitungNilai(nilaiTugas, nilaiUts, nilaiUas);
            Nilai.judul();
            // Cetak Data
            for(int i = 0; i < nilaiMhs.size(); i++){
                nilaiMhs.get(i).daftarNilai();
            }
            System.out.print("Input data lagi [Y/T] = "); pilih = input.next();
            input.nextLine();
        }while(pilih.equalsIgnoreCase("Y"));
        input.close();
        
        /* Instance Object with value of constructor
            Nilai Budi = new Nilai("A11.2021.14657", "Budi Haryanto", 75, 86, 83);
            // Implement of Method against Instance Object
            Budi.hitungNilai();
            Budi.cetakNilai();
            // Inisialisasi change of NIM
            Budi.setNim("A11.2021.15647");
            Budi.cetakNilai(); 
        */
        // Instance Object with Input Data
    }
}

