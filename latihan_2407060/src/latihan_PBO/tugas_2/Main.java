package latihan_PBO.tugas_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BangunDatar bd = new BangunDatar();

        System.out.println("=== KALKULATOR BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Belah Ketupat");
        System.out.print("Pilih Bangun (1-4): ");
        int bangun = input.nextInt();

        System.out.println("\n1. Hitung Luas");
        System.out.println("2. Hitung Keliling");
        System.out.print("Pilih Perhitungan (1-2): ");
        int pilihan = input.nextInt();

        System.out.println();

        switch (bangun) {

            case 1: // PERSEGI
                System.out.print("Masukkan Sisi: ");
                bd.setSisi(input.nextDouble());

                if (pilihan == 1)
                    System.out.println("Luas Persegi = " + bd.hitungLuasPersegi());
                else
                    System.out.println("Keliling Persegi = " + bd.hitungKelilingPersegi());
                break;

            case 2: // PERSEGI PANJANG
                System.out.print("Masukkan Panjang: ");
                bd.setPanjang(input.nextDouble());
                System.out.print("Masukkan Lebar: ");
                bd.setLebar(input.nextDouble());

                if (pilihan == 1)
                    System.out.println("Luas Persegi Panjang = " + bd.hitungLuasPersegiPanjang());
                else
                    System.out.println("Keliling Persegi Panjang = " + bd.hitungKelilingPersegiPanjang());
                break;

            case 3: // SEGITIGA
                if (pilihan == 1) {
                    // LUAS
                    System.out.print("Masukkan Alas: ");
                    bd.setAlas(input.nextDouble());
                    System.out.print("Masukkan Tinggi: ");
                    bd.setTinggi(input.nextDouble());
                    System.out.println("Luas Segitiga = " + bd.hitungLuasSegitiga());
                } else {
                    // KELILING
                    System.out.print("Masukkan Sisi 1: ");
                    double s1 = input.nextDouble();
                    System.out.print("Masukkan Sisi 2: ");
                    double s2 = input.nextDouble();
                    System.out.print("Masukkan Sisi 3: ");
                    double s3 = input.nextDouble();

                    bd.setSisiA(s1);
                    bd.setSisiB(s2);
                    bd.setSisiC(s3);
                    System.out.println("Keliling Segitiga = " + bd.hitungKelilingSegitiga());
                }
                break;

            case 4: // BELAH KETUPAT
                if (pilihan == 1) {
                    // LUAS
                    System.out.print("Masukkan Diagonal 1: ");
                    bd.setDiagonal1(input.nextDouble());
                    System.out.print("Masukkan Diagonal 2: ");
                    bd.setDiagonal2(input.nextDouble());
                    System.out.println("Luas Belah Ketupat = " + bd.hitungLuasBelahKetupat());
                } else {
                    // KELILING
                    System.out.print("Masukkan Sisi: ");
                    bd.setSisi(input.nextDouble());
                    System.out.println("Keliling Belah Ketupat = " + bd.hitungKelilingBelahKetupat());
                }
                break;

            default:
                System.out.println("Input tidak valid!");
        }

        input.close();
    }
}