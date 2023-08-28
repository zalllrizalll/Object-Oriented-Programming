import id.ac.dinus.lib.MyLib; // Import langsung tembak ke file class 
import id.ac.dinus.lib.YourLib; // Import langsung tembak ke file class
import id.ac.dinus.test.*;
public class AksesLib2 {
    public static void main(String[] args) {
        MyLib m = new MyLib();
        m.cetak();
        YourLib y = new YourLib();
        y.cetak2();
        HisLib h = new HisLib();
        h.cetak3();
    }
}