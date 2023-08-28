public class MobilBMW extends Mobil{
    public void nontonTV(int pilih){
        switch(pilih){
            case 1 -> System.out.println("TV Dihidupkan...");
            case 2 -> System.out.println("TV Mencari Channel...");
            case 3 -> System.out.println("TV Menampilkan Gambar...");
        }
    }
}