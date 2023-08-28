import java.util.Scanner;

public class MatrixDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilih;
        int menu;
        do{
            System.out.println("========== INPUT DATA ==========");
            // Input data array A
            System.out.print("Input Row A\t: "); int rowsA = input.nextInt();
            System.out.print("Input Column A\t: "); int columnsA = input.nextInt();
            // Initialize index matrix A
            System.out.println("================================\n");
            int [][] matrixA = new int[rowsA][columnsA];
            // fill the index of matrix A
            System.out.println("========== INPUT ELEMENT ARRAY A ==========");
            for(int i = 0; i < rowsA; i++){
                for(int j = 0; j < columnsA; j++){
                    System.out.print("Elements Array["+i+"]["+j+"] = ");
                    matrixA[i][j] = input.nextInt();
                }
            }
            System.out.println("===========================================\n");
            // Input data array B
            System.out.println("========== INPUT DATA ==========");
            System.out.print("Input Row B\t: "); int rowsB = input.nextInt();
            System.out.print("Input Column B\t: "); int columnsB = input.nextInt();
            // Initialize index matrix A
            System.out.println("================================\n");
            int [][] matrixB = new int[rowsB][columnsB];
            // fill the index of matrix A
            System.out.println("========== INPUT ELEMENT ARRAY B ==========");
            for(int i = 0; i < rowsB; i++){
                for(int j = 0; j < columnsB; j++){
                    System.out.print("Elements Array["+i+"]["+j+"] = ");
                    matrixB[i][j] = input.nextInt();
                }
            }
            System.out.println("===========================================\n");
            System.out.println("========== MENU MATRIX ==========");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Transpose");
            System.out.println("=================================");
            System.out.print("Input pilihan [1-5]: "); menu = input.nextInt();
            System.out.println();
            switch(menu){
                case 1 -> Matrix.Penjumlahan(matrixA, matrixB, rowsA, columnsA, rowsB, columnsB);
                case 2 -> Matrix.Pengurangan(matrixA, matrixB, rowsA, columnsA, rowsB, columnsB);
                case 3 -> Matrix.Perkalian(matrixA, matrixB, rowsA, columnsA, rowsB, columnsB);
                case 4 -> Matrix.Pembagian(matrixA, matrixB, rowsA, columnsA, rowsB, columnsB);
                case 5 -> Matrix.TransposeMenu(matrixA, matrixB, rowsA, columnsA, rowsB, columnsB);
            }
            System.out.print("Input data lagi[Y/T] = "); pilih = input.next();
        }while(pilih.equalsIgnoreCase("Y"));
        input.close();
    }
}
