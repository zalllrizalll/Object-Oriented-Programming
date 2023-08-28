import java.util.Scanner;

public class Matrix {
    static Scanner input = new Scanner(System.in);
    // Penjumlahan Matrix
    public static void Penjumlahan(int [][]A, int [][]B, int barisA, int kolomA, int barisB, int kolomB){
        int rows = A.length;
        int columns = A[0].length;
        int [][]sum = new int[rows][columns];
        if(barisA == barisB && kolomA == kolomB){
            for(int i = 0; i < barisA; i++){
                for(int j = 0; j < kolomA; j++){
                    sum[i][j] = A[i][j] + B[i][j];
                }
            }
            System.out.println("HASIL PENJUMLAHAN");
            // Print Array
            printArray(sum, rows, columns);

        } else {
            System.out.println("ROW and COLUMN Not Equal!!");
        }
    }
    // Pengurangan Matrix
    public static void Pengurangan(int [][]A, int [][]B, int barisA, int kolomA, int barisB, int kolomB){
        int rows = A.length;
        int columns = A[0].length;
        int [][]decrease = new int[rows][columns];
        if(barisA == barisB && kolomA == kolomB){
            for(int i = 0; i < barisA; i++){
                for(int j = 0; j < kolomA; j++){
                    decrease[i][j] = A[i][j] - B[i][j];
                }
            }
            System.out.println("HASIL PENGURANGAN");
            // Print Array
            printArray(decrease, rows, columns);

        } else {
            System.out.println("ROW and COLUMN Not Equal!!");
        }
    }
    // Perkalian Matrix
    public static void Perkalian(int [][]A, int [][]B, int barisA, int kolomA, int barisB, int kolomB){
        int rows = A.length;
        int columns = B[0].length;
        int [][]multiple = new int [rows][columns];
        if(kolomA == barisB){
            for(int i = 0; i < barisA; i++){
                for(int j = 0; j < kolomB; j++){
                    for(int k = 0; k < kolomA; k++){
                        multiple[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            System.out.println("HASIL PERKALIAN");
            // Print Array
            printArray(multiple, rows, columns);
        } else {
            System.out.println("Column Matrix 1 Not Equal With Row Matrix 2");
        }
    }
    // Pembagian Matrix
    public static void Pembagian(int [][]A, int [][]B, int barisA, int kolomA, int barisB, int kolomB){
        int rows = A.length;
        int columns = A[0].length;
        int [][]division = new int[rows][columns];
        if(barisA == barisB && kolomA == kolomB){
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    division[i][j] = A[i][j] / B[i][j];
                }
            }
            System.out.println("HASIL PEMBAGIAN");
            // Print Array
            printArray(division, rows, columns);
        } else {
            System.out.println("ROW and COLUMN Not Equal!!");
        }
    }
    // Transpose Menu
    public static void TransposeMenu(int [][]A, int [][]B, int barisA, int kolomA, int barisB, int kolomB){
        System.out.println("========== Menu Transpose ==========");
        System.out.println("1. Matrix A");
        System.out.println("2. Matrix B");
        System.out.println("3. Matrix A + B");
        System.out.println("====================================");
        System.out.print("Masukkan pilihan : "); int pilih = input.nextInt();
        int rows = A.length;
        int columns = A[0].length;
        int [][]sum = new int[rows][columns];
        if(pilih == 1){
            Transpose(A);
        } else if(pilih == 2){
            Transpose(B);
        } else {
            if(barisA == barisB && kolomA == kolomB){
                for(int i = 0; i < barisA; i++){
                    for(int j = 0; j < kolomA; j++){
                        sum[i][j] = A[i][j] + B[i][j];
                    }
                }
                System.out.println("HASIL PENJUMLAHAN");
                // Print Array
                printArray(sum, rows, columns);
                // Transpose Array
                Transpose(sum);
            } else {
                System.out.println("ROW and COLUMN Not Equal!!");
            }
        }
    }
    // Transpose Matrix
    public static void Transpose(int [][]arr){
        int rows = arr.length;
        int columns = arr[0].length;
        int [][]transpose = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("HASIL TRANSPOSE");
        // Print Array
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(transpose[i][j]+ "\t"); 
            }
            System.out.println();
        }
    }
    // Print Array
    public static void printArray(int [][]arr, int rows, int columns){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}