public class Matematika {
    // Atribut class
    float a,b;
    // Default Constructor
    public Matematika(){}
    // Method Class
    static float pertambahan(double a, double b){
        float jumlah = (float)(a + b);
        return jumlah;
    }
    // Overloading => suatu kondisi nama method sama dalam suatu class, akan tetapi parameter dari method tersebut berbeda
    static float pertambahan(double a, double b, double c){
        float jumlah = (float)(a + b + c);
        return jumlah;
    }
    static float pengurangan(double a, double b){
        float kurang = (float)(a - b);
        return kurang;
    }
    // Overloading
    static float pengurangan(double a, double b, double c){
        float kurang = (float)(a - b - c);
        return kurang;
    }
    static float perkalian(double a, double b){
        float kali = (float)(a * b);
        return kali;
    }
    // Overloading
    static float perkalian(double a, double b, double c){
        float kali = (float)(a * b * c);
        return kali;
    }
    static float pembagian(double a, double b){
        float bagi = (float)(a / b);
        return bagi;
    }
    // Overloading
    static float pembagian(double a, double b, double c){
        float bagi = (float)(a / b / c);
        return bagi;
    }
    // Setting Setter and Getter
    void setNilaiA(double a){
        this.a = (float)a;
    }
    float getNilaiA(){
        return a;
    }
    void setNilaiB(double b){
        this.b = (float)b;
    }
    float getNilaiB(){
        return b;
    }
}
