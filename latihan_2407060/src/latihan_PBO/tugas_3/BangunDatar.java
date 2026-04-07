package latihan_PBO.tugas_3;

public class BangunDatar {
    // 1a & 1b. Atribut private panjang dan lebar (Enkapsulasi) 
    private double panjang;
    private double lebar;

    // 1c. Constructor untuk mengisi nilai 
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // SETTER (Sesuai gaya kodemu sebelumnya)
    public void setPanjang(double panjang) { this.panjang = panjang; }
    public void setLebar(double lebar) { this.lebar = lebar; }

    // GETTER (Sesuai gaya kodemu sebelumnya)
    public double getPanjang() { return panjang; }
    public double getLebar() { return lebar; }

    // 1d. Method hitungLuas 
    public double hitungLuas() {
        return panjang * lebar;
    }
}