import java.util.Scanner;
public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan data string: ");
    String input = scanner.nextLine();
    scanner.close();

    System.out.println("Data string yang dimasukkan adalah: " + input);
  }
}
