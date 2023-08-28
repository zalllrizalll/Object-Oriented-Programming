public class MobilDemo2 {
    public static void main(String[] args) {
        // Create Instance Object
        Mobil2 avanza = new Mobil2();
        Mobil2 xenia = new Mobil2();
        // Implement of Method against Object
        avanza.hidupkanMobil("Avanza Silver");
        avanza.ubahGigi("Avanza Silver");
        // Behaviour of Instance Object
        Mobil2.maju();
        Mobil2.mundur();
        Mobil2.belok();
        // Output Instance Object
        System.out.println("Roda Avanza\t: " + avanza.getRoda() + " roda");
        System.out.println("Roda Xenia\t: " + xenia.getRoda() + " roda");
        System.out.println("Mesin Avanza\t: " +Mobil2.mesin);
        System.out.println("Mesin Xenia\t: " +Mobil2.mesin);
        // SetRoda(); => berfungsi untuk merubah suatu value data Roda
        avanza.setRoda(5);
        xenia.setRoda(4);
        // GetRoda(); => berfungsi untuk mengambil value data yang terbaru saat ini
        System.out.println("Roda Avanza\t: " + avanza.getRoda() + " roda");
        System.out.println("Roda Xenia\t: " + xenia.getRoda() + " roda");
        // Setting value data mesin sesuai keinginan user
        Mobil2.mesin = 9;
        System.out.println("Mesin Avanza\t: " +Mobil2.mesin);
        System.out.println("Mesin Xenia\t: " +Mobil2.mesin);
        // Matikan Mobil
        avanza.matikanMobil("Avanza Silver");
    }
}
