package id.ac.dinus.Transportasi;

public class Bicycle {
    // Atribut Class
    int gear = 0;
    int speed = 0;

    // Method Class 
    public void changeGear(int upGear){
        gear += upGear;
        System.out.println("Gear\t : " + gear);
    }

    public void changeSpeed(int upSpeed){
        speed += upSpeed;
        System.out.println("Speed\t : " + speed);
    }
}