package latihan_PBO.tugas_4;

public class Main {
    public static void main(String[] args) {
        
        BangunDatar objek;

        objek = new BangunDatar(3.0, 4.0);
        objek.tampilkan();
        System.out.println(); 

        objek = new Persegi(5.0);
        objek.tampilkan();
        System.out.println();

        objek = new PersegiPanjang(10.0, 5.0);
        objek.tampilkan();
        System.out.println();

        objek = new Segitiga(6.0, 8.0);
        objek.tampilkan();
    }
}