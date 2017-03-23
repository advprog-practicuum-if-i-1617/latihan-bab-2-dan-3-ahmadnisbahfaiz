package BAB3;

import java.util.Scanner;

public class Berubah {

    private static String[] angka = new String[]{"nol", "satu", "dua", "tiga", "empat", "lima", "enam",
        "tujuh", "delapan", "sembilan", "sepuluh"}; // menentukan variabel

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        OverloadingMeth a = new OverloadingMeth();
        int pilihan, angka1;
        String teks;
        do {
            System.out.println("========================="); //menu yg akan dipilih
            System.out.println("1.Ubah teks ke bilangan");
            System.out.println("2.Ubah bilangan ke teks");
            System.out.println("0.Keluar");
            System.out.print("Masukkan pilihan : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    Berubah a1 = new Berubah();
                    System.out.print("Masukkan teks : ");
                    in.nextLine();
                    teks = in.nextLine();
                    a.OverloadingMeth(teks);
                    break;
                case 2:
                    Berubah a2 = new Berubah();
                    System.out.print("Masukkan angka : ");
                    angka1 = in.nextInt();
                    a.OverloadingMeth(angka1);
                    break;
                case 0:
                    System.out.println("Terimakasih anda sudah keluar...");
                    break;
                default:
                    System.out.println("Pilihan salah...");
            }
        } while (pilihan != 0);
    }


}
