package latihan_PBO.latihan_4;

public class Main {
    public static void main(String[] args) {

        // Membuat objek dari class persegi
        persegi p = new persegi();

        // Mengisi nilai sisi (karena diwarisi dari BangunDatar)
        p.setSisi(8);

        // Menampilkan hasil
        System.out.println("Luas Persegi = " + p.LuasPersegi());
        System.out.println("Keliling Persegi = " + p.KelilingPersegi());
    }
}

// package latihan_PBO.latihan_4;

// public class Main {
//     public static void main(String[] args) {

//         // Membuat objek dari class persegipanjang
//         persegipanjang pp = new persegipanjang();

//         // Mengisi nilai (warisan dari BangunDatar)
//         pp.setPanjang(10);
//         pp.setLebar(5);

//         // Menampilkan hasil
//         System.out.println("Luas Persegi Panjang = " + pp.LuasPersegiPanjang());
//         System.out.println("Keliling Persegi Panjang = " + pp.hitungKelilingPersegiPanjang());
//     }
// }

// 

// package latihan_PBO.latihan_4;

// public class MainBelahKetupat {
//     public static void main(String[] args) {

//         belahketupat bk = new belahketupat();
//         bk.setDiagonal1(8);
//         bk.setDiagonal2(6);
//         bk.setSisi(5);

//         System.out.println("=== BELAH KETUPAT ===");
//         System.out.println("Luas = " + bk.hitungLuasBelahKetupat());
//         System.out.println("Keliling = " + bk.hitungKelilingBelahKetupat());
//     }
// }