import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueClass {
    Queue<Integer> antrian = new LinkedList<Integer>();
    Scanner input = new Scanner(System.in);
    int top = 0;
    int max = 5;

    // Method Insert
    public void Insert(){
        System.out.print("Input Data = ");
        antrian.add(input.nextInt());
        this.top++;
    }

    // Method Remove
    public void Remove(){
        System.out.print("Input elemen yang ingin dihapus = ");
        antrian.remove(input.nextInt());
        this.top--;
    }

    // View Menu
    public void Menu(){
        int pilih;
        String lanjut;
        do{
            System.out.println("\n===== MENU QUEUE =====");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Size");
            System.out.println("7. Tampil Data");
            System.out.println("8. Exit");
            System.out.println("======================");
            System.out.print("Input pilihan [1-8]: ");
            pilih = input.nextInt();

            switch(pilih){
                case 1 -> {
                    if(top < max){
                        Insert();
                    } else {
                        System.out.println("ANTRIAN PENUH !");
                    }
                    break;
                }
                case 2 -> {
                    if(top >= 0){
                        Remove();
                    } else {
                        System.out.println("ANTRIAN KOSONG !");
                    }
                    break;
                }
                case 3 -> {
                    if(top >= 0){
                        System.out.print("Head of Queue : "+antrian.peek());
                    } else {
                        System.out.println("ANTRIAN KOSONG !");
                    }
                    break;
                }
                case 4 -> {
                    if(top < 0){
                        System.out.println("ANTRIAN KOSONG !");
                    } else {
                        System.out.print("Queue : "+antrian);
                    }
                    break;
                }
                case 5 -> {
                    if (top > max){
                        System.out.println("ANTRIAN PENUH !");
                    } else {
                        System.out.println("Queue : "+antrian);
                    }
                    break;
                }
                case 6 -> {
                    if(top < 0){
                        System.out.println("ANTRIAN KOSONG !");
                    } else {
                        System.out.print("Size of Queue : "+antrian.size());
                        System.out.println("\nQueue : "+antrian);
                    }
                    break;
                }
                case 7 -> {
                    if(top < 0){
                        System.out.println("ANTRIAN KOSONG !");
                    } else if (top > max){
                        System.out.println("ANTRIAN PENUH !");
                    } else {
                        System.out.println("Queue : "+antrian);
                    }
                    break;
                }
                case 8 -> {
                    break;
                }
                default -> System.out.println("404 Not Found");
            }
            System.out.print("\nDo you want to continue <type Y or N> ? : ");
            lanjut = input.next();
        } while(lanjut.equalsIgnoreCase("Y"));
    }
}
