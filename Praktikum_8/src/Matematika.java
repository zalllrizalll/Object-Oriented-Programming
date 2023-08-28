public class Matematika {
    // Atribut class
    double a, b, c;
    // Default Constructor
    public Matematika(){}
    // Method Class
    public double pertambahan(double a, double b){
        double jumlah = a + b;
        return jumlah;
    }
    // Overloading => suatu kondisi nama method sama dalam suatu class, akan tetapi parameter dari method tersebut berbeda
    public double pertambahan(double a, double b, double c){
        double jumlah = a + b + c;
        return jumlah;
    }
    public double pengurangan(double a, double b){
        double kurang = a - b;
        return kurang;
    }
    // Overloading
    public double pengurangan(double a, double b, double c){
        double kurang = a - b - c;
        return kurang;
    }
    public double perkalian(double a, double b){
        double kali = a * b;
        return kali;
    }
    // Overloading
    public double perkalian(double a, double b, double c){
        double kali = a * b * c;
        return kali;
    }
    public double pembagian(double a, double b){
        double bagi = a / b;
        return bagi;
    }
    // Overloading
    public double pembagian(double a, double b, double c){
        double bagi =  a / b / c;
        return bagi;
    }
    // Setting Setter and Getter
    public void setNilaiA(double a){
        this.a = a;
    }
    public double getNilaiA(){
        return a;
    }
    public void setNilaiB(double b){
        this.b = b;
    }
    public double getNilaiB(){
        return b;
    }  
}