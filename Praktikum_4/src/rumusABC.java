import java.util.Scanner;

public class rumusABC {
    double a,b,c,D,X1,X2;
    Scanner input = new Scanner(System.in);
    public rumusABC(){}
    public rumusABC(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void controller(){
        char pilih = 'Y';
        while(pilih == 'Y' || pilih == 'y'){
            isiData();
            determinant();
            hitungX1X2();
            cetakData();
            System.out.print("\nInput data lagi [Y/T] : "); pilih = input.next().charAt(0);
        }
    }

    void isiData(){
        System.out.println("\n========== Isi Data ==========\n");
        System.out.print("Nilai A\t : "); a = input.nextDouble();
        System.out.print("Nilai B\t : "); b = input.nextDouble();
        System.out.print("Nilai C\t : "); c = input.nextDouble();
    }
    
    double determinant(){
        D = (b * b)  - (4 * a * c);
        return D;
    }

    void hitungX1X2(){
        if (D > 0){
            X1 = (-b + Math.sqrt(D)) / (2 * a);
            X2 = (-b - Math.sqrt(D)) / (2 * a);
        } else if (D == 0) {
            X1 = X2 = -b / (2 * a);
        } else {
            X1 = (-b / (2 * a)) + (Math.sqrt(-D) / (2 * a));
            X2 = (-b / (2 * a)) - (Math.sqrt(-D) / (2 * a));
        }
    }

    void cetakData(){
        System.out.println("\n========== Cetak Data ==========\n");
        System.out.println("Nilai A\t   : "+a);
        System.out.println("Nilai B\t   : "+b);
        System.out.println("Nilai C\t   : "+c);
        System.out.println("Determinan : "+D);
        System.out.println("Nilai X1   : "+X1);
        System.out.println("Nilai X2   : "+X2);
    }

    public double getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(float c) {
        this.c = c;
    }
    public double getD() {
        return D;
    }
    public double getX1() {
        return X1;
    }
    public double getX2() {
        return X2;
    }
}
