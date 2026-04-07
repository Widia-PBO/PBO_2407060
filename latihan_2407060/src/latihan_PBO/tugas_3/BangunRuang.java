package latihan_PBO.tugas_3;

// 2. Turunan dari BangunDatar 
public class BangunRuang extends BangunDatar {
    private double tinggi; // Atribut tambahan 

    // Constructor BangunRuang 
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); // Mengisi atribut panjang & lebar di parent class 
        this.tinggi = tinggi;
    }

    public void setTinggi(double tinggi) { this.tinggi = tinggi; }
    public double getTinggi() { return tinggi; }

    // 2. Method hitungVolume (luas * tinggi) 
    public double hitungVolume() {
        // 5a & 5b. Menggunakan kembali method hitungLuas tanpa tulis ulang rumusnya 
        return hitungLuas() * tinggi;
    }
}