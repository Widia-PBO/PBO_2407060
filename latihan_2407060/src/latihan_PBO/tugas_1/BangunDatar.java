package latihan_PBO.tugas_1;

public class BangunDatar {

    // ========== ATRIBUT (Private -) ==========
    // Variabel hanya bisa diakses di dalam class ini saja
    private double sisi;
    private double panjang;
    private double lebar;
    private double alas;
    private double tinggi;
    private double diagonal1;
    private double diagonal2;

    // ========== SETTER (Public +) ==========
    // Method untuk mengisi nilai ke variabel private dari luar class
    public void setSisi(double sisi) { this.sisi = sisi; }
    public void setPanjang(double panjang) { this.panjang = panjang; }
    public void setLebar(double lebar) { this.lebar = lebar; }
    public void setAlas(double alas) { this.alas = alas; }
    public void setTinggi(double tinggi) { this.tinggi = tinggi; }
    public void setDiagonal1(double d1) { this.diagonal1 = d1; }
    public void setDiagonal2(double d2) { this.diagonal2 = d2; }

    // ========== METHOD PERHITUNGAN (Public +) ==========
    
    // Luas Persegi: sisi x sisi
    public double hitungPersegi() {
        return sisi * sisi;
    }

    // Luas Persegi Panjang: panjang x lebar
    public double hitungPersegiPanjang() {
        return panjang * lebar;
    }

    // Luas Segitiga: 1/2 x alas x tinggi
    public double hitungSegitiga() {
        return 0.5 * alas * tinggi;
    }

    // Luas Belah Ketupat: 1/2 x diagonal1 x diagonal2
    public double hitungBelahKetupat() {
        return 0.5 * diagonal1 * diagonal2;
    }
}