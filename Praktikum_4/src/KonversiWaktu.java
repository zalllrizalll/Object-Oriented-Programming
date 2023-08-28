import java.util.Scanner;

public class KonversiWaktu {
    int detik, menit, jam, hari;
    Scanner input = new Scanner(System.in);
    public KonversiWaktu(){}
    public KonversiWaktu(int detik){
        this.detik = detik;
    }
    void controller(){
        char pilih = 'Y';
        while(pilih == 'Y' || pilih == 'y'){
            inputDetik();
            konversiDetik();
            cetakHasil();
            System.out.print("\nInput data lagi [Y/T] : "); pilih = input.next().charAt(0);
        }
    }

    void inputDetik(){
        System.out.println("\n========== Input Detik ==========\n");
        System.out.print("Input detik : "); detik = input.nextInt();
    }
    void konversiDetik(){
        int sisaMenit, sisaJam, sisaHari;
        hari = detik / 86400;
        sisaHari = detik % 86400;
        jam = sisaHari / 3600;
        sisaJam = sisaHari % 3600;
        menit = sisaJam / 60;
        sisaMenit = sisaJam % 60;
        detik = sisaMenit;
    }

    void cetakHasil(){
        System.out.println("\n========== Hasil Konversi ==========\n");
        System.out.println("Hari\t : "+hari);
        System.out.println("Jam\t : "+jam);
        System.out.println("Menit\t : "+menit);
        System.out.println("Detik\t : "+detik);
    }
    public int getDetik() {
        return detik;
    }
    public void setDetik(int detik) {
        this.detik = detik;
    }
    public int getMenit() {
        return menit;
    }
    public int getJam() {
        return jam;
    }
    public int getHari() {
        return hari;
    }
}
