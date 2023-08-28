public class MobilBMWDemo {
    public static void main(String[] args) {
        MobilBMW car = new MobilBMW();
        car.hidupkanMobil("BMW F30");
        for(int i = 1; i <= 3; i++) {
            car.nontonTV(i);
        }
        car.ubahGigi("BMW F30");
        car.matikanMobil("BMW F30");
    }
}