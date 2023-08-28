public class Hewan {
    public String jenis, ciri;

    public Hewan(){}
    public String suara(int x){
        String suara;
        switch(x){
            case 1 -> {
                suara = "Aummm";
                break;
            }
            case 2 -> {
                suara = "WooshWoosh";
                break;
            }
            case 3 -> {
                suara = "NgungNgung";
                break;
            }
            case 4 -> {
                suara = "Mpshhh";
                break;
            }
            default -> {
                suara = "404 Not Found";
                break;
            }
        }
        return suara;
    }
    public String berjalan(int y){
        String berjalan;
        switch(y){
            case 1 -> {
                berjalan = "4 Kaki";
                break;
            }
            case 2 -> {
                berjalan = "Terbang(sayap)";
                break;
            }
            case 3 -> {
                berjalan = "Merayap";
                break;
            }
            case 4 -> {
                berjalan = "Berenang(Sirip)";
                break;
            }
            default -> {
                berjalan = "404 Not Found";
                break;
            }
        }
        return berjalan;
    }
    public String bernafas(int z){
        String bernafas;
        switch(z){
            case 1 -> {
                bernafas = "Paru-Paru";
                break;
            }
            case 2 -> {
                bernafas = "Insang";
                break;
            }
            case 3 -> {
                bernafas = "Trakea";
                break;
            }
            case 4 -> {
                bernafas = "Kulit";
                break;
            }
            default -> {
                bernafas = "404 Not Found";
                break;
            }
        }
        return bernafas;
    }
    public void cetak(String hewan, String jenis, String ciri, String suara, String berjalan, String bernafas) {
        System.out.println("===== Cetak Data =====");
        System.out.println("Hewan    : " + hewan);
        System.out.println("Jenis    : " + jenis);
        System.out.println("Ciri     : " + ciri);
        System.out.println("Suara    : " + suara);
        System.out.println("Berjalan : " + berjalan);
        System.out.println("Bernafas : " + bernafas);
    }
}