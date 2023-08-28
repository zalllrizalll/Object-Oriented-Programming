public class PenjualanDemo {
    public static void main(String[] args) {
        // Input Data With Constructor
        Penjualan Budi = new Penjualan("50149", "Budi Doremi", 20000, 6);
        Budi.getTotalPembelian();
        Budi.getBonus();
        Budi.cetakNota();
        // Input Data With Scanner
        Penjualan Selling = new Penjualan();
        Selling.controller();
    }
}
