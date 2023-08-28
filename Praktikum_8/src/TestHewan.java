import java.util.Scanner;

public class TestHewan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lanjut;
        System.out.println("===== Menu Hewan =====");
        System.out.println("1. Singa");
        System.out.println("2. Elang");
        System.out.println("3. Lebah");
        System.out.println("4. Paus");
        System.out.println("5. Keluar");
        do{
            int pilih;
            System.out.print("Masukkan pilihan[1 - 5] : "); pilih = input.nextInt();
            System.out.println();
            switch(pilih){
                case 1 -> {
                    Singa singa= new Singa();
                    singa.cetak("Singa", singa.jenis, singa.ciri, singa.suara(1), singa.berjalan(1), singa.bernafas(1));
                    break;
                }
                case 2 -> {
                    Elang elang = new Elang();
                    elang.cetak("Elang", elang.jenis, elang.ciri, elang.suara(2), elang.berjalan(2), elang.bernafas(1));
                    break;
                }
                case 3 -> {
                    Lebah lebah = new Lebah();
                    lebah.cetak("Lebah", lebah.jenis, lebah.ciri, lebah.suara(3), lebah.berjalan(2), lebah.bernafas(3));
                    break;
                }
                case 4 -> {
                    Paus paus = new Paus();
                    paus.cetak("Paus", paus.jenis, paus.ciri, paus.suara(4), paus.berjalan(4), paus.bernafas(1));
                    break;
                }
                case 5 -> {
                    System.exit(0);
                    break;
                }
                default -> {
                    break;
                }
            }
            System.out.print("Apakah ingin input lagi [Y/T] : "); lanjut = input.next();
        } while (lanjut.equalsIgnoreCase("Y"));
        input.close();
    }
}