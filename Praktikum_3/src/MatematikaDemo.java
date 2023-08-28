import java.util.Scanner;

public class MatematikaDemo {
    static int operator;
    public static void main(String[] args) {
        Matematika math = new Matematika();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("========== Operasi Bilangan Bulat ==========");
            // Bilangan Bulat
            printHasilInteger(20, 20, 1);
            printHasilInteger(10, 5, 2);
            printHasilInteger(10, 20, 3);
            printHasilInteger(20, 2, 4);
            System.out.println("\n========== Operasi Bilangan Pecahan ==========");
            // Bilangan Pecahan
            printHasilPecahan(20, 20, 1);
            printHasilPecahan(10, 5, 2);
            printHasilPecahan(10, 20, 3);
            printHasilPecahan(20, 2, 4);
            // Scanner
            System.out.println("\n========== Input Data With Scanner ==========");
            System.out.print("Input Nilai A : "); math.a = sc.nextFloat();
            System.out.print("Input Nilai B : "); math.b = sc.nextFloat();
            System.out.print("Pilih Operasi : "); operator = sc.nextInt();
            System.out.println("\n========== Bilangan Bulat ==========");
            printHasilInteger(math.a, math.b, operator);
            System.out.println("\n========== Bilangan Pecahan ==========");
            printHasilPecahan(math.a, math.b, operator);
        }
    }
    // Operasi Bilangan Bulat
    public static void printHasilInteger(float a, float b, int operator){
        if(operator == 1){
            System.out.println("Pertambahan\t: "+(int)a+" + "+(int)b+ "\t= "+(int)Matematika.pertambahan(a, b));
        } else if (operator == 2){
            System.out.println("Pengurangan\t: "+(int)a+" - "+(int)b+ "\t= "+(int)Matematika.pengurangan(a, b));
        } else if (operator == 3){
            System.out.println("Perkalian\t: "+(int)a+" * "+(int)b+ "\t= "+(int)Matematika.perkalian(a, b));
        } else {
            System.out.println("Pembagian\t: "+(int)a+" / "+(int)b+ "\t= "+(int)Matematika.pembagian(a, b));
        }
    }
    // Operasi Bilangan Pecahan
    public static void printHasilPecahan(float a, float b, int operator){
        if(operator == 1){
            System.out.println("Pertambahan\t: "+a+" + "+b+ "\t= "+Matematika.pertambahan(a,b));
        } else if (operator == 2){
            System.out.println("Pengurangan\t: "+a+" - "+b+ "\t= "+Matematika.pengurangan(a, b));
        } else if (operator == 3){
            System.out.println("Perkalian\t: "+a+" * "+b+ "\t= "+Matematika.perkalian(a, b));
        } else {
            System.out.println("Pembagian\t: "+a+" / "+b+ "\t= "+Matematika.pembagian(a, b));
        }
    }
}
