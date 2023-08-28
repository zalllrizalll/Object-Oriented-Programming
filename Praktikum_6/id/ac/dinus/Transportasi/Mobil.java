package id.ac.dinus.Transportasi;

public class Mobil {
    // Atribut of Class
    private int roda = 4;
    private int body = 1;
    private int mesin = 1;
    // Create Method 
    // Method maju
    public void maju(){
        System.out.println("Maju...");
    }
    // Method Mundur
    public void mundur(){
        System.out.println("Mundur...");
    }
    // Method Belok
    public void belok(){
        System.out.println("Belok...");
    }
    // Method Hidupkan Mobil
    public void hidupkanMobil(String name){
        System.out.println("Hidupkan Mobil\t: "+name);
    }
    // Method Matikan Mobil
    public void matikanMobil(String name){
        System.out.println("Matikan Mobil\t: "+name);
    }
    // Method Ubah Gigi
    public void ubahGigi(String name){
        System.out.println("Ubah Gigi Mobil\t: "+name);
    }
    // Setting Getter and Setter
    public void setRoda(int roda){
        this.roda = roda;
    }
    public int getRoda(){
        return roda;
    }
    public void setBody(int body){
        this.body = body;
    }
    public int getBody(){
        return body;
    }
    public int getMesin(){
        return mesin;
    }
    public void setMesin(int mesin){
        this.mesin = mesin;
    }
}

