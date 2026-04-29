package latihan_PBO.latihan_5;

public class Menu {
    private String nama;
    private int harga;

    public Menu(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter (Encapsulation)
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    // Method default (Polymorphism)
    public int hitungTotal() {
        return 0;
    }

    public void tampilkanRingkas() {
        System.out.println(nama + " " + harga);
    }
}