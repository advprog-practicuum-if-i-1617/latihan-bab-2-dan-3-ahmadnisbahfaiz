package BAB3;
public class OverloadingMeth {
    private static String[] angka = new String[]{"nol", "satu", "dua", "tiga", "empat", "lima", "enam",
        "tujuh", "delapan", "sembilan", "sepuluh"}; // menentukan variabel

    public void OverloadingMeth(int a) { //menyatakan angka dalam teks
        String[] ratus = {"", "seratus", "dua ratus", "tiga ratus", "empat ratus", "lima ratus", "enam ratus", "tujuh ratus", "delapan ratus", "sembilan ratus"};
        String[] puluh = {"", "belas", "dua puluh", "tiga puluh", "empat puluh", "lima puluh", "enam puluh", "tujuh puluh", "delapan puluh", "sembilan puluh"};
        String[] satuan = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh"};
        if (a < 1000 && a > 0) {
            int rhatus = (a % 1000) / 100;
            int phuluh = (a % 100) / 10;
            int shatuan = a % 10;

            if (phuluh == 1) {
                if (shatuan == 1) {
                    System.out.println(ratus[rhatus] + " se" + puluh[phuluh]);
                } else {
                    System.out.println(ratus[rhatus] + " " + satuan[shatuan] + " " + puluh[phuluh]);
                }
            } else {
                System.out.println(ratus[rhatus] + " " + puluh[phuluh] + " " + satuan[shatuan]);
            }
        } else if (a == 1000) {
            System.out.println("Seribu");
        }
    }

    public static void OverloadingMeth(String a) { // menyatakan teks k angka
        for (int i = 0; i < angka.length; i++) {
            if ((angka[i].equalsIgnoreCase(a))) {
                System.out.println(i);
            } else if ((angka[i] + " belas").equalsIgnoreCase(a)) { //untuk mencantumkan belasan
                System.out.println(i + 10);
            } else if ((angka[i] + " puluh").equalsIgnoreCase(a)) {//untuk mencantumkan puluhan
                System.out.println(i * 10);
            } else if (("seratus " + angka[i]).equalsIgnoreCase(a)) {
                System.out.println(100 + i);
            } else if (("seratus " + angka[i] + " belas").equalsIgnoreCase(a)) { //untuk mencantumkan ratusan belas
                System.out.println(110 + i);
            } else if (("seratus " + angka[i] + " puluh").equalsIgnoreCase(a)) { //mencantumkan ratusan puluhan
                System.out.println(100 + (10 * i));
            } else if ((angka[i] + " ratus ").equalsIgnoreCase(a)) {
                System.out.println((i * 100) + (10 * i) + i);
            } else if ((angka[i] + " ratus").equalsIgnoreCase(a)) {
                System.out.println(i * 100);
            }
            for (int j = 0; j < angka.length; j++) {
                if (a.equals(angka[i] + " puluh " + angka[j])) {
                    System.out.println((i * 10) + j);;
                } else if ((angka[i] + " ratus " + angka[j] + " belas").equalsIgnoreCase(a)) { //untuk ratusan belas
                    System.out.println(i * 100 + (10 + j));
                }
            }
            for (int j = 0; j < angka.length; j++) {
                if (("seratus " + angka[i] + " puluh " + angka[j]).equalsIgnoreCase(a)) { //untuk ratusan puluh
                    System.out.println(100 + (10 * i) + j);
                }
                for (int k = 0; k < angka.length; k++) { //untuk (teks) ratusan
                    if ((angka[i] + " ratus " + angka[j] + " puluh " + angka[k]).equalsIgnoreCase(a)) {
                        System.out.println(i * 100 + (10 * j) + k);
                    }

                }

                if ("seratus".equalsIgnoreCase(a)) { //mencantumkan angka jika seratus
                    System.out.println(100);;
                }
                if (("seratus sebelas").equalsIgnoreCase(a)) { ////mencantumkan angka jika seratus sebelas
                    System.out.println(111);
                    break;
                }
                if (("sebelas").equalsIgnoreCase(a)) { //mencantumkan angka jika sebelas
                    System.out.println(11);
                    break;
                }
                if (("seribu").equalsIgnoreCase(a)) { //mencantumkan angka jika sebelas
                    System.out.println(1000);
                    break;
                }
            }
        }
    }
}
