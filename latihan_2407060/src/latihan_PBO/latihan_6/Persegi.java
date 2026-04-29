package latihan_PBO.latihan_6;

public class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi (double sisi){
        super("Persegi");
        this.sisi = sisi;
    }

    @Override
    double hitungLuas(){
        return sisi*sisi;
    } 

    @Override
    double hitungKeliling(){
        return 4 * sisi;
    } 
    
}
