public class TesMobil {
    public static void main(String[] args) {
        Mobil avanza = new Mobil();
        System.out.println("Mobil Avanza memiliki : " + avanza.roda+" roda");
        System.out.println("Mobil Avanza memiliki : " + avanza.mesin+" mesin");
        avanza.maju();
        avanza.belok();
        avanza.mundur();
        Mobil xenia = new Mobil();
        xenia.roda = 6;
        xenia.mesin = 2;
        System.out.println("Mobil Xenia memiliki : " + xenia.roda+" roda");
        System.out.println("Mobil Xenia memiliki : " + xenia.mesin+" mesin");
        xenia.maju();
        xenia.belok();
        xenia.mundur();
    }
}
