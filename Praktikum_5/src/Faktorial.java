import java.util.Scanner;

public class Faktorial{
    public static void main(String[] args) {
        int n, faktorial = 1;
        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Angka : "); n = input.nextInt();
        for (int i = 2; i <= n; i++) {
            System.out.print(faktorial+ " x "+ i +" = ");
            faktorial *= i;
            System.out.println(faktorial);
        }
        input.close();
    }
}