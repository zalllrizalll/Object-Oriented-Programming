import java.util.Scanner;

public class Nilai {
    // Atribute Class
    String nim, nama, predikat;
    float nilaiTugas, nilaiUts, nilaiUas, pNilaiTugas, pNilaiUts, pNilaiUas, nilaiAkhir;
    char nHuruf;
    Scanner input = new Scanner(System.in);
    // Default Constructor
    public Nilai(){};
    // Constructor dengan input value of parameter
    public Nilai(String nim, String nama, float nilaiTugas, float nilaiUts, float nilaiUas){
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }
    // Create Method
    // Controller function
    void controller(){
        char pilih = 'Y';
        while(pilih == 'Y' || pilih == 'y'){
            isiData();
            hitungNilai();
            getNilaiHuruf(nilaiAkhir);
            getPredikat(nHuruf);
            cetakNilai();
            System.out.print("\nInput data lagi [Y/T] : ");pilih = input.next().charAt(0);
            System.out.println(); input.nextLine();
        }
    }
    // Method Isi Data
    void isiData(){
        System.out.println("\n============ Input Data ============\n");
        System.out.print("NIM\t\t : ");nim = input.nextLine();
        System.out.print("Nama\t\t : ");nama = input.nextLine();
        System.out.print("Nilai Tugas\t : ");nilaiTugas = input.nextFloat();
        System.out.print("Nilai UTS\t : ");nilaiUts = input.nextFloat();
        System.out.print("Nilai UAS\t : ");nilaiUas = input.nextFloat();
    }
    // Method Hitung Nilai
    void hitungNilai(){
        pNilaiTugas = 0.2f * nilaiTugas;
        pNilaiUts = 0.35f * nilaiUts;
        pNilaiUas = 0.45f * nilaiUas;
        nilaiAkhir = pNilaiTugas + pNilaiUts + pNilaiUas;
    }
    // Method Cetak Nilai
    void cetakNilai(){
        System.out.println("\n============ Cetak Data ============\n");
        System.out.println("NIM\t\t : "+nim);
        System.out.println("Nama\t\t : "+nama);
        System.out.println("Nilai Tugas\t : "+nilaiTugas+" * 20% = "+pNilaiTugas);
        System.out.println("Nilai UTS\t : "+nilaiUts+ " * 35% = "+pNilaiUts);
        System.out.println("Nilai UAS\t : "+nilaiUas+ " * 45% = "+pNilaiUas);
        System.out.println("Nilai Akhir\t : "+nilaiAkhir);
        System.out.println("Nilai Huruf\t : "+getNilaiHuruf(nilaiAkhir));
        System.out.println("Predikat\t : "+getPredikat(nHuruf));
    }
    // Method Nilai Huruf
    char getNilaiHuruf(float nilaiAkhir){
        if (nilaiAkhir >= 85){
            nHuruf = 'A';
        } else if (nilaiAkhir >= 70 && nilaiAkhir < 85){
            nHuruf = 'B';
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 70) {
            nHuruf = 'C';
        } else if (nilaiAkhir >= 40 && nilaiAkhir < 60) {
            nHuruf = 'D';
        } else {
            nHuruf = 'E';
        }
        return nHuruf;
    }
    // Method Predikat
    String getPredikat(char nHuruf){
        switch(nHuruf){
            case 'A' :
                predikat = "Apik";
                break;
            case 'B' :
                predikat = "Baik";
                break;
            case 'C' :
                predikat = "Cukup";
                break;
            case 'D' :
                predikat = "Dablek";
                break;
            default :
                predikat = "Elek";
                break;
        }
        return predikat;
    }
    // Setting Getter and Setter
    void setNim(String nim){
        this.nim = nim;
    }
    String getNim(){
        return nim;
    }
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return nama;
    }
    void setTugas(float nilaiTugas){
        this.nilaiTugas = nilaiTugas;
    }
    float getTugas(){
        return nilaiTugas;
    }
    void setNilaiUts(float nilaiUts){
        this.nilaiUts = nilaiUts;
    }
    float getNilaiUts(){
        return nilaiUts;
    }
    void setNilaiUas(float nilaiUas){
        this.nilaiUas = nilaiUas;
    }
    float getNilaiUas(){
        return nilaiUas;
    }
}
