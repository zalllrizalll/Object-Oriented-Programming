import java.util.Scanner;

public class Nilai {
    // Atribute Class
    private String nim, nama, predikat;
    private float nilaiTugas, nilaiUts, nilaiUas, pNilaiTugas, pNilaiUts, pNilaiUas, nilaiAkhir;
    static char nHuruf;
    public static Scanner input = new Scanner(System.in);
    // Default Constructor
    public Nilai(String string){};
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
    /*void controller(){
        char pilih = 'Y';
        while(pilih == 'Y' || pilih == 'y'){
            isiData();
            hitungNilai(nilaiTugas, nilaiUts, nilaiUas);
            getNilaiHuruf(nilaiAkhir);
            getPredikat(nHuruf);
            daftarNilai();
            System.out.print("\nInput data lagi [Y/T] : ");pilih = input.next().charAt(0);
            System.out.println(); input.nextLine();
        }
    }*/
    // Method Isi Data
    public void isiData(){
        System.out.println("\n============ Input Data ============\n");
        System.out.print("NIM\t\t : ");nim = input.nextLine();
        System.out.print("Nama\t\t : ");nama = input.nextLine();
        System.out.print("Nilai Tugas\t : ");nilaiTugas = input.nextFloat();
        System.out.print("Nilai UTS\t : ");nilaiUts = input.nextFloat();
        System.out.print("Nilai UAS\t : ");nilaiUas = input.nextFloat();
        System.out.println("====================================");
    }
    // Method Hitung Nilai
    public void hitungNilai(float nilaiTugas, float nilaiUts, float nilaiUas){
        pNilaiTugas = 0.2f * nilaiTugas;
        pNilaiUts = 0.35f * nilaiUts;
        pNilaiUas = 0.45f * nilaiUas;
        nilaiAkhir = pNilaiTugas + pNilaiUts + pNilaiUas;
    }
    // Method Judul
    public static void judul(){
        System.out.println();
        System.out.println("\t\t\t\t\t     Daftar Nilai PBO");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("NIM\t   Nama\t        Nilai Tugas\tNilai UTS\tNilai UAS\tNilai Akhir\tNilai Huruf\t Predikat");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }
    // Method Cetak Nilai
    public void cetakNilai(){
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
    // Method Daftar Nilai
    public void daftarNilai(){
        System.out.println(nim+"\t   "+nama+"\t   "+nilaiTugas+"\t\t   "+nilaiUts+"\t\t   "+nilaiUas+"\t\t   "+nilaiAkhir+"\t\t     "+getNilaiHuruf(nilaiAkhir)+"\t\t   "+getPredikat(nHuruf));
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }
    // Method Nilai Huruf
    public static char getNilaiHuruf(float nilaiAkhir){
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
    public String getPredikat(char nHuruf){
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
    public String getNim(){
        return nim;
    }
    void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    void setTugas(float nilaiTugas){
        this.nilaiTugas = nilaiTugas;
    }
    public float getTugas(){
        return nilaiTugas;
    }
    void setNilaiUts(float nilaiUts){
        this.nilaiUts = nilaiUts;
    }
    public float getNilaiUts(){
        return nilaiUts;
    }
    public void setNilaiUas(float nilaiUas){
        this.nilaiUas = nilaiUas;
    }
    public float getNilaiUas(){
        return nilaiUas;
    }
}
