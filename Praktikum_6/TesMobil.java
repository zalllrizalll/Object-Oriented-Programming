import id.ac.dinus.Transportasi.Mobil;
public class TesMobil {
    public static void main(String[] args) {
    // Class Mobil
    Mobil xenia = new Mobil();
    // Implement of Method against Object
    xenia.hidupkanMobil("Xenia Silver");
    xenia.ubahGigi("Xenia Silver");
    xenia.maju();
    xenia.mundur();
    xenia.belok();
    // Output Instance Object
    System.out.println("Roda Xenia\t: " + xenia.getRoda() + " roda");
    System.out.println("Mesin Xenia\t: " +xenia.getMesin() + " mesin");
    xenia.setRoda(5);
    // GetRoda(); => berfungsi untuk mengambil value data yang terbaru saat ini
    System.out.println("Roda Xenia\t: " + xenia.getRoda() + " roda");
    xenia.setMesin(9);
    System.out.println("Mesin Xenia\t: " +xenia.getMesin() + " mesin");
    // Matikan Mobil
    xenia.matikanMobil("Xenia Silver");
    }
}