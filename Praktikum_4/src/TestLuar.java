public class TestLuar {
    public static void main(String[] args) {
        Luar luar = new Luar();
        Luar.Tengah tengah = luar.new Tengah();
        Luar.Tengah.Dalam dalam = tengah.new Dalam();
        luar.cetakLuar();
        tengah.cetakTengah();
        dalam.cetakDalam();
    }
}
