public class MountainBike extends Bicycle {
    int seatHeight;

    public void setHeight(int newValue){
        seatHeight += newValue;
        System.out.println("SeatHeight : " + seatHeight);
    }
}