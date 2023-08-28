class Luar {
    void cetakLuar(){
        System.out.println("Cetak Luar ......");
        // cetakTengah(); --> Error

    }

    class Tengah {
        void cetakTengah(){
            cetakLuar();
            System.out.println("Cetak Tengah ......");
        }

        class Dalam {
            void cetakDalam(){
                cetakLuar();
                cetakTengah();
                System.out.println("Cetak Dalam ......");
            }
        }
    }
}
// Class luar tidak bisa akses dalam/inner
// Class dalam/inner bisa akses kelas di luarnya
