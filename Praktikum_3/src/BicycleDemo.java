import java.util.Scanner;

public class BicycleDemo {
    public static void main(String[] args) {
        try (// Create Instance Object
        Scanner sc = new Scanner(System.in)) {
            Bicycle Bike = new Bicycle();
            System.out.println("\n========== Speed Awal ==========");
            System.out.print("Gear Awal\t : ");Bike.gear = sc.nextInt();
            System.out.print("Speed Awal\t : ");Bike.speed = sc.nextInt();
            System.out.println("\n========== Change Speed Bicycle ==========");
            // Inisialisasi Method
            Bike.changeGear(2);
            Bike.changeSpeed(10);
            // Hasil Perubahan
            System.out.println("\n========== Speed Akhir ==========");
            System.out.println("Gear Akhir\t : "+Bike.gear);
            System.out.println("Speed Akhir\t : "+Bike.speed);
        }
    }
}
