import id.ac.dinus.Transportasi.Bicycle;
public class BicycleDemo {
    public static void main(String[] args) {
        // Class Bicycle
        System.out.println("========== Bicycle Java ==========");
        Bicycle bike = new Bicycle();
        bike.changeGear(3);
        bike.changeSpeed(40);
        System.out.println("==================================");
    }
}
