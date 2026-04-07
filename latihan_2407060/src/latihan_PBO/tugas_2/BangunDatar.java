package latihan_PBO.tugas_2;

/**
 * Class BangunDatar
 * Menerapkan konsep Encapsulation dalam OOP
 */
public class BangunDatar {

    // ATRIBUT (Private)
    private double sisi;
    private double panjang;
    private double lebar;
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;
    private double diagonal1;
    private double diagonal2;

    // CONSTRUCTOR
    public BangunDatar() {

    }

    // SETTER
    public void setSisi(double sisi) { this.sisi = sisi; }
    public void setPanjang(double panjang) { this.panjang = panjang; }
    public void setLebar(double lebar) { this.lebar = lebar; }
    public void setAlas(double alas) { this.alas = alas; }
    public void setTinggi(double tinggi) { this.tinggi = tinggi; }
    public void setSisiA(double sisiA) { this.sisiA = sisiA; }
    public void setSisiB(double sisiB) { this.sisiB = sisiB; }
    public void setSisiC(double sisiC) { this.sisiC = sisiC; }
    public void setDiagonal1(double diagonal1) { this.diagonal1 = diagonal1; }
    public void setDiagonal2(double diagonal2) { this.diagonal2 = diagonal2; }

    // GETTER
    public double getSisi() { return sisi; }
    public double getPanjang() { return panjang; }
    public double getLebar() { return lebar; }
    public double getAlas() { return alas; }
    public double getTinggi() { return tinggi; }
    public double getSisiA() { return sisiA; }
    public double getSisiB() { return sisiB; }
    public double getSisiC() { return sisiC; }
    public double getDiagonal1() { return diagonal1; }
    public double getDiagonal2() { return diagonal2; }

    // METHOD LUAS 

    // Persegi
    public double hitungLuasPersegi() {
        return sisi * sisi;
    }

    // Persegi Panjang
    public double hitungLuasPersegiPanjang() {
        return panjang * lebar;
    }

    // Segitiga
    public double hitungLuasSegitiga() {
        return 0.5 * alas * tinggi;
    }

    // Belah Ketupat
    public double hitungLuasBelahKetupat() {
        return 0.5 * diagonal1 * diagonal2;
    }

    // METHOD KELILING

    // Keliling Persegi
    public double hitungKelilingPersegi() {
        return 4 * sisi;
    }

    // Keliling Persegi Panjang
    public double hitungKelilingPersegiPanjang() {
        return 2 * (panjang + lebar);
    }

    // Keliling Segitiga
    public double hitungKelilingSegitiga() {
    return sisiA + sisiB + sisiC;
}

    // Keliling Belah Ketupat
    public double hitungKelilingBelahKetupat() {
        return 4 * sisi;
    }
}