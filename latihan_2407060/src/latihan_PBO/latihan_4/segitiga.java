package latihan_PBO.latihan_4;

public class segitiga extends BangunDatar {

    public double hitungLuasSegitiga(){
        return 0.5 * (getAlas() * getTinggi());
    }

    public double hitungKelilingSegitiga(){
        return (getSisiA() + getSisiB() + getSisiC());
    }
    
}
