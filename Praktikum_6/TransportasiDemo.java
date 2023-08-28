import id.ac.dinus.Transportasi.*;
public class TransportasiDemo {
    public static void main(String[] args) {
        // Class Bicycle
        System.out.println("========== Bicycle Java ==========");
        Bicycle bike = new Bicycle();
        bike.changeGear(3);
        bike.changeSpeed(40);
        System.out.println("==================================");
        System.out.println();
        System.out.println("========== Mobil Java ==========");
        // Class Mobil
        Mobil avanza = new Mobil();
        // Implement of Method against Object
        avanza.hidupkanMobil("Avanza Silver");
        avanza.ubahGigi("Avanza Silver");
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        // Output Instance Object
        System.out.println("Roda Avanza\t: " + avanza.getRoda() + " roda");
        System.out.println("Mesin Avanza\t: " +avanza.getMesin() + " mesin");
        avanza.setRoda(5);
        // GetRoda(); => berfungsi untuk mengambil value data yang terbaru saat ini
        System.out.println("Roda Avanza\t: " + avanza.getRoda() + " roda");
        avanza.setMesin(9);
        System.out.println("Mesin Avanza\t: " +avanza.getMesin() + " mesin");
        // Matikan Mobil
        avanza.matikanMobil("Avanza Silver");
        System.out.println("================================");
    }
}