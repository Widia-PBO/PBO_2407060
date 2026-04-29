package latihan_PBO.latihan_5;

public class Main {
    public static void main(String[] args) {

        Menuitem[] menu = new Menuitem[3];

        menu[0] = new Menuitem("Ketoprak", 12000, 3);
        menu[1] = new Menuitem("Nasi Goreng", 15000, 4);
        menu[2] = new Menuitem("Soda Gembira", 8000, 5);

        int totalSemua = 0;

        for (Menuitem m : menu) {
            m.tampilkanRingkas(); // polymorphism
            totalSemua += m.hitungTotal();
        }

        System.out.println("---------------------------");
        System.out.println("Total = " + totalSemua);
    }
}