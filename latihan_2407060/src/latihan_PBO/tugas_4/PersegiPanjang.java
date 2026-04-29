package latihan_PBO.tugas_4;

public class PersegiPanjang extends BangunDatar {

    public PersegiPanjang(double varA, double varB) {
        super(varA, varB);
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarB();
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("================");
        System.out.println("Panjang: " + getVarA());
        System.out.println("Lebar: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("================");
    }
}