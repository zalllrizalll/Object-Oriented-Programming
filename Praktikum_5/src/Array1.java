import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int []data;
        int n;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Jumlah Data : "); n = input.nextInt();
            data = new int[n];
            for(int i = 0; i < n; i++) {
                System.out.print("Data ke - "+(i+1)+" = "); data[i] = input.nextInt();
            }
            // Cetak Data
            for(int j = 0; j < n; j++) {
                System.out.println("Hasil nilai["+ j +"] = "+data[j]);
            }
        }
    }
}