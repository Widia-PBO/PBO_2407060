package latihan_PBO.latihan_4;

public class belahketupat extends BangunDatar {

    public double hitungLuasBelahKetupat(){
        return 0.5 * (getDiagonal1() * getDiagonal2());
    }

    public double hitungKelilingBelahKetupat(){
        return 4 * (getSisi());
    }
    
}
