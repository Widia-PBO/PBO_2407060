package latihan_PBO.tugas_4;

public class BangunDatar {
    private double varA;
    private double varB;

    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0;
    }

    public double getVarA() { return varA; }
    public double getVarB() { return varB; }

    public double hitungLuas() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("================");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("================");
    }
}
