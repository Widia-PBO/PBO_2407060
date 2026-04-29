package latihan_PBO.latihan_5;

public class Menuitem extends Menu {
    private int jumlah;

    public Menuitem(String nama, int harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    // OVERRIDE (Polymorphism)
    @Override
    public int hitungTotal() {
        return getHarga() * jumlah;
    }

    @Override
    public void tampilkanRingkas() {
        System.out.println(getNama() + " " + getHarga() + "x" + jumlah + " = " + hitungTotal()
        );
    }
}