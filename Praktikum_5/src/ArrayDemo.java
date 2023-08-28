import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayClass test = new ArrayClass();
        Scanner input = new Scanner(System.in);
        int pilih;
        String lanjut;
        do{
            System.out.println("\n========== MENU ARRAYCLASS ==========");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Exit");
            System.out.println("=====================================");
            System.out.print("Input pilihan [1-5]: ");
            pilih = input.nextInt();
            switch(pilih){
                case 1 -> {
                    test.inputArray();
                    test.Penjumlahan();
                    test.TampilData();
                    test.ResetValue();
                    break;
                }
                case 2 -> {
                    test.inputArray();
                    test.Pengurangan();
                    test.TampilData();
                    test.ResetValue();
                    break;
                }
                case 3 -> {
                    test.inputArray();
                    test.Perkalian();
                    test.TampilData();
                    test.ResetValue();
                    break;
                }
                case 4 -> {
                    test.inputArray();
                    test.Pembagian();
                    test.TampilData();
                    test.ResetValue();
                    break;
                }
                case 5 -> {
                    break;
                }
                default -> System.out.println("404 Not Found");
            }
            System.out.print("\nInput data lagi [Y/T] : ");
            lanjut = input.next();
        }while(lanjut.equalsIgnoreCase("Y"));
        input.close();
    }
}
