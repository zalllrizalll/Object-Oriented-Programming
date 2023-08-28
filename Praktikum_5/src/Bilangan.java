import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
        int n, pecah;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : "); n = input.nextInt();
        System.out.println("========== CETAK DATA ==========");
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
            if(i % 5 == 0 || i == n){
                System.out.println();
            }
        }
        // Dipecah
        System.out.println("================================");
        System.out.print("Dipecah : "); pecah = input.nextInt();
        System.out.println();
        System.out.println("========== CETAK DATA ==========");
        for(int j = 1; j <= n; j++){
            System.out.print(j+" ");
            if(j % pecah == 0){
                System.out.println();
            }
        }
        System.out.println("\n================================");
        input.close();
    }
}
