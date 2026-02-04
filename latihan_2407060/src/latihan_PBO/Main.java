package latihan_PBO;


class Cafe{
    String nama;
    String alamat;


    // constructor
    Cafe(String nama, String alamat){
         this.nama = nama;
         this.alamat = alamat;
          System.out.println(nama);
          System.out.println(alamat);
    }
}

public class Main{
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe("Kopi Kenangan", "Indramayu");
        Cafe cafe2 = new Cafe("Janji Jiwa",  "Indramayu");
    }
}






    //Cafe cafe1 = new Cafe();
    //cafe1.nama = "Kopi Kenangan";
    //cafe1.alamat = "Indramayu";

    //Cafe cafe2 = new Cafe();
    //cafe2.nama = "Janji Jiwa";
    //cafe2.alamat = "Indramayu";

    //System.out.println("Nama Cafenya adalah : " + cafe1.nama);
    //System.out.println("Alamatnya ada di : " + cafe1.alamat);

    //System.out.println("Nama Cafenya adalah : " + cafe2.nama);
    //System.out.println("Alamatnya ada di : " + cafe2.alamat);

   
