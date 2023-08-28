public class TestStatic1 {
    public static void main(String[] args) {
        // Create Instance of Object
        TestStatic test = new TestStatic();
        // Inisialisasi Methods
        // Method non-static sangat bergantung kepada object
        test.satu();
        // Sedangkan method static dia bersifat mandiri => cukup panggil class.nama method() tanpa perlu kita membuat sebuah object terlebih dahulu
        TestStatic.dua();
        System.out.println("\n========== Output Atribute ==========");
        /*
         * Ciri-ciri sebuah atribute atau method non-static :
         * 1. int a = 10 => hanya mendeklarasikan tipe data dan diikuti dengan variable
         * 2. public int a = 10 => diikuti dengan access modifier yaitu public access modifier
         * 3. protected int a = 10 => diikuti dengan access modifier yaitu protected access modifier
         * 4. private int a = 10 => diikuti dengan access modifier yaitu private access modifier, cuman untuk private kita harus membuat sebuah getter terlebih dahulu untuk memanggilnya
         */
        System.out.println("Atrribute A\t : "+test.a);
        System.out.println("Atrribute B\t : "+TestStatic.b);
        System.out.println("Atrribute C\t : "+test.c);
        System.out.println("Atrribute D\t : "+test.d);
        System.out.println("Atrribute E\t : "+test.getValueE());
    }
}
