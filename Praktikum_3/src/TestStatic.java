public class TestStatic {
    int a = 10;
    static int b = 20;
    protected int c = 30;
    public int d = 40;
    private int e = 50;
    // Method non-static
    void satu(){
        // Panggil Method dua()
        dua();
        System.out.println("Satu ..........");
        System.out.println("Satu ..........a : "+a);
        System.out.println("Satu ..........b : "+b);
        System.out.println("Satu ..........c : "+c);
        System.out.println("Satu ..........d : "+d);
        System.out.println("Satu ..........e : "+e);
    }
    // Method static
    static void dua(){
        // satu(); => sebuah method non-static yang cara pemanggilannya sangat bergantung kepada sebuah object
        /* Misal saya membuat sebuah object TestStatic test = new TestStatic();
         * Untuk memanggil sebuah method yang sifatnya non-static => dengan cara membuat sebuah object terlebih dahulu, kemudian panggil method non-static tersebut ke dalam method static
         * Untuk memanggil method non-static tersebut seperti berikut :
         *  static void dua(){
         *      test.satu();
         * }
         *  NB : Hal tersebut juga berlaku bagi sebuah atribut yang sifatnya non-static
         */
        System.out.println("Dua .........."+b);
        // System.out.println("Dua ..........a : "+a);
    }
    public static void main(String[] args) {
        // satu();
        dua();
    }
    // Setter and Getter
    void setValueE(int e){
        this.e = e;
    }
    int getValueE() {
        return e;
    }
}
