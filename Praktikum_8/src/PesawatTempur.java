public class PesawatTempur extends Pesawat {
    public PesawatTempur(){
        System.out.println("Object Pesawat Tempur dibuat ...");
    }

    public void manuver(){
        System.out.println("Manuver ...");
    }
    public void terbang(){
        super.terbang();
        System.out.println("Terbang ala tempur ...");
    }
}