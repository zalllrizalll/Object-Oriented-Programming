public class Mobil2 {
    // Atribut of Class
    private int roda = 4;
    private int body = 1;
    static int mesin = 1;
    // Create Method 
    // Method maju
    static void maju(){
        System.out.println("Maju...");
    }
    // Method Mundur
    static void mundur(){
        System.out.println("Mundur...");
    }
    // Method Belok
    static void belok(){
        System.out.println("Belok...");
    }
    // Method Hidupkan Mobil
    void hidupkanMobil(String name){
        System.out.println("Hidupkan Mobil\t: "+name);
    }
    // Method Matikan Mobil
    void matikanMobil(String name){
        System.out.println("Matikan Mobil\t: "+name);
    }
    // Method Ubah Gigi
    void ubahGigi(String name){
        System.out.println("Ubah Gigi Mobil\t: "+name);
    }
    // Setting Getter and Setter
    void setRoda(int roda){
        this.roda = roda;
    }
    int getRoda(){
        return roda;
    }
    void setBody(int body){
        this.body = body;
    }
    int getBody(){
        return body;
    }
}
