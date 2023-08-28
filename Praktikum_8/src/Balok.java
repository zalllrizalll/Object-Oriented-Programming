public class Balok extends PersegiPanjang{
    double t, volume;

    void hitungVolume(){
        volume = luas * t;
    }
    void cetak(){ // Overriding dari method parent class
        super.cetak();
        System.out.println("Tinggi\t: " + t);
        System.out.println("Volume\t: " + volume);
    }
    void cetak(String nama){ // Overloading dari method cetak()
        System.out.println("Balok\t: " + nama);
        cetak(); // Panggil method cetak()
    }
}