// import java.util.Scanner;
// static int operator;
public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika math = new Matematika();
        System.out.println("Penjumlahan : " + math.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pengurangan : " + math.pengurangan(12.5, 28.7, 14.2));
        System.out.println("Perkalian   : " + math.perkalian(12.5, 28.7, 14.2));
        System.out.println("Pembagian   : " + math.pembagian(12.5, 28.7, 14.2));
    }
}
        // try (Scanner sc = new Scanner(System.in)) {
            // System.out.println("========== Operasi Bilangan Bulat 2 Nilai ==========");
            // // Bilangan Bulat 2 Nilai
            // printHasilInteger(20, 20, 1);
            // printHasilInteger(10, 5, 2);
            // printHasilInteger(10, 20, 3);
            // printHasilInteger(20, 2, 4);
            // System.out.println("\n========== Operasi Bilangan Bulat 3 Nilai ==========");
            // // Bilangan Bulat 3 Nilai
            // printHasilInteger(20, 20, 10, 1);
            // printHasilInteger(10, 5, 6, 2);
            // printHasilInteger(10, 20,5, 3);
            // printHasilInteger(20, 2, 4, 4);
            // System.out.println("\n========== Operasi Bilangan Pecahan 2 Nilai==========");
            // // Bilangan Pecahan 2 Nilai
            // printHasilPecahan(20, 20, 1);
            // printHasilPecahan(10, 5, 2);
            // printHasilPecahan(10, 20, 3);
            // printHasilPecahan(20, 2, 4);
//             System.out.println("\n========== Operasi Bilangan Pecahan 3 Nilai==========");
//             // Bilangan Pecahan 2 Nilai
//             printHasilPecahan(12.5, 28.7,14.2, 1);
//             printHasilPecahan(10, 5,5, 2);
//             printHasilPecahan(10, 20, 4,3);
//             printHasilPecahan(20, 2, 4 ,4);
//             // Scanner
//             int angka = 0;
//             System.out.println("\n========== Input Data With Scanner ==========");
//             System.out.print("Masukkan Banyak Angka : "); angka = sc.nextInt();
//             if( angka == 2) {
//                 System.out.print("Input Nilai A : "); math.a = sc.nextFloat();
//                 System.out.print("Input Nilai B : "); math.b = sc.nextFloat();
//                 System.out.print("Pilih Operasi : "); operator = sc.nextInt();
//                 System.out.println("\n========== Bilangan Bulat 2 Nilai==========");
//                 printHasilInteger(math.a, math.b, operator);
//                 System.out.println("\n========== Bilangan Pecahan 2 Nilai ==========");
//                 printHasilPecahan(math.a, math.b, operator);
//             } else {
//                 System.out.print("Input Nilai A : "); math.a = sc.nextFloat();
//                 System.out.print("Input Nilai B : "); math.b = sc.nextFloat();
//                 System.out.print("Input Nilai C : "); math.c = sc.nextFloat();
//                 System.out.print("Pilih Operasi : "); operator = sc.nextInt();
//                 System.out.println("\n========== Bilangan Bulat 3 Nilai==========");
//                 printHasilInteger(math.a, math.b, math.c, operator);
//                 System.out.println("\n========== Bilangan Pecahan 3 Nilai ==========");
//                 printHasilPecahan(math.a, math.b, math.c, operator);
//             }
//         }
//     }
//     // Operasi Bilangan Bulat 2 Nilai
//     public static void printHasilInteger(float a, float b, int operator){
//         if(operator == 1){
//             System.out.println("Pertambahan\t: "+(int)a+" + "+(int)b+ "\t= "+(int)Matematika.pertambahan(a, b));
//         } else if (operator == 2){
//             System.out.println("Pengurangan\t: "+(int)a+" - "+(int)b+ "\t= "+(int)Matematika.pengurangan(a, b));
//         } else if (operator == 3){
//             System.out.println("Perkalian\t: "+(int)a+" * "+(int)b+ "\t= "+(int)Matematika.perkalian(a, b));
//         } else {
//             System.out.println("Pembagian\t: "+(int)a+" / "+(int)b+ "\t= "+(int)Matematika.pembagian(a, b));
//         }
//     }
//     // Operasi Bilangan Bulat 3 Nilai
//     public static void printHasilInteger(float a, float b, float c, int operator){
//         if(operator == 1){
//             System.out.println("Pertambahan\t: "+(int)a+" + "+(int)b+" + "+(int)c+ "\t= "+(int)Matematika.pertambahan(a, b, c));
//         } else if (operator == 2){
//             System.out.println("Pengurangan\t: "+(int)a+" - "+(int)b+" - "+(int)c+ "\t= "+(int)Matematika.pengurangan(a, b, c));
//         } else if (operator == 3){
//             System.out.println("Perkalian\t: "+(int)a+" * "+(int)b+" * "+(int)c+ "\t= "+(int)Matematika.perkalian(a, b, c));
//         } else {
//             System.out.println("Pembagian\t: "+(int)a+" / "+(int)b+" / "+(int)c+ "\t= "+(int)Matematika.pembagian(a, b, c));
//         }
//     }
//     // Operasi Bilangan Pecahan Floating-point 2 Nilai
//     public static void printHasilPecahan(float a, float b, int operator){
//         if(operator == 1){
//             System.out.println("Pertambahan\t: "+a+" + "+b+ "\t= "+Matematika.pertambahan(a,b));
//         } else if (operator == 2){
//             System.out.println("Pengurangan\t: "+a+" - "+b+ "\t= "+Matematika.pengurangan(a, b));
//         } else if (operator == 3){
//             System.out.println("Perkalian\t: "+a+" * "+b+ "\t= "+Matematika.perkalian(a, b));
//         } else {
//             System.out.println("Pembagian\t: "+a+" / "+b+ "\t= "+Matematika.pembagian(a, b));
//         }
//     }
//     // Operasi Bilangan Pecahan Double 3 Nilai
//     public static void printHasilPecahan(double a, double b, double c, int operator){
//         if(operator == 1){
//             System.out.println("Pertambahan\t: "+a+" + "+b+" + "+c+ "\t= "+Matematika.pertambahan(a, b, c));
//         } else if (operator == 2){
//             System.out.println("Pengurangan\t: "+a+" - "+b+" - "+c+ "\t= "+Matematika.pengurangan(a, b, c));
//         } else if (operator == 3){
//             System.out.println("Perkalian\t: "+a+" x "+b+" x "+c+ "\t= "+Matematika.perkalian(a, b, c));
//         } else {
//             System.out.println("Pembagian\t: "+a+" / "+b+" / "+c+ "\t= "+Matematika.pembagian(a, b, c));
//         }
