public class TestPesawat {
    public static void main(String[] args) {
        Pesawat airbus = new Pesawat();
        PesawatTempur f16 = new PesawatTempur();

        // Airbus
        airbus.nama = "... Airbus ...";
        System.out.println(airbus.nama);
        airbus.terbang();
        airbus.mendarat();
        
        // F16
        f16.nama = "... F16 ...";
        System.out.println(f16.nama);
        f16.terbang();
        f16.mendarat();
        f16.manuver();
    }
}