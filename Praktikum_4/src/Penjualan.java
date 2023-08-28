import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Penjualan {
    String kode, nama, bonus = "", rupiahFormat = "";
    float hargaBarang, totalPembelian;
    int jumlahBarang;
    Scanner input = new Scanner(System.in);
    public Penjualan(){}
    public Penjualan(String kode, String nama, float hargaBarang, int jumlahBarang){
        this.kode = kode;
        this.nama = nama;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    void controller(){
        char pilih = 'Y';
        while(pilih == 'Y' || pilih == 'y'){
            isiData();
            getTotalPembelian();
            getBonus();
            cetakNota();
            System.out.print("\nInput data lagi [Y/T] : "); pilih = input.next().charAt(0);
            System.out.println(); input.nextLine();
        }
    }

    void isiData(){
        System.out.println("\n========== Isi Data ==========\n");
        System.out.print("Kode\t\t : "); kode = input.nextLine();
        System.out.print("Nama\t\t : "); nama = input.nextLine();
        System.out.print("Harga Barang\t : "); hargaBarang = input.nextFloat();
        System.out.print("Jumlah Barang\t : "); jumlahBarang = input.nextInt();
    }

    float getTotalPembelian(){
        totalPembelian = jumlahBarang * hargaBarang;
        return totalPembelian;
    }

    String getBonus(){
        if (totalPembelian >= 500000 && jumlahBarang > 5){
            bonus = "Setrika";
        } else if (totalPembelian >= 100000 && jumlahBarang > 3){
            bonus = "Payung";
        } else if (totalPembelian >= 50000 || jumlahBarang > 2){
            bonus = "ballpoint";
        } else {
            bonus = "-";
        }
        return bonus;
    }

    void cetakNota(){
        System.out.println("\n========== Cetak Nota ==========\n");
        System.out.println("Kode\t\t : "+kode);
        System.out.println("Nama\t\t : "+nama);
        System.out.println("Harga Barang\t : "+formatRupiah(hargaBarang));
        System.out.println("Jumlah Barang\t : "+jumlahBarang);
        System.out.println("-------------------------------- + ");
        System.out.println("Total Pembelian  : "+formatRupiah(totalPembelian));
        System.out.println("Bonus\t\t : "+this.bonus);
    }

    String formatRupiah(float value){
        rupiahFormat = NumberFormat.getNumberInstance(Locale.US).format(value);
        rupiahFormat = rupiahFormat.replace(',', '.');
        return "Rp. "+String.format(rupiahFormat);
    }

    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public float getHargaBarang() {
        return hargaBarang;
    }
    public void setHargaBarang(float hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    public int getJumlahBarang() {
        return jumlahBarang;
    }
    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
}
