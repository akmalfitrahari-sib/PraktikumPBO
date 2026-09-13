package Jobsheet2.TugasNo2;

public class DemoRadio {
    public static void main(String[] args) {
        Radio radio1 = new Radio();
        Radio radio2 = new Radio();

        radio1.merk = "Sony";
        radio1.frekuensi = 101.2;
        radio1.gelombang = "FM";
        radio1.volume = 5;

        radio2.merk = "Panasonic";
        radio2.frekuensi = 90.5;
        radio2.gelombang = "AM";
        radio2.volume = 7;

        System.out.println("=== Informasi Radio 1 ===");
        System.out.println("Merk Radio 1: " + radio1.merk);
        System.out.println("Frekuensi: " + radio1.frekuensi + " MHz");
        System.out.println("Gelombang: " + radio1.gelombang);
        System.out.println("Volume: " + radio1.volume);
        System.out.println();

        radio1.cariFrekuensi(112.4);
        radio1.ubahGelombang("AM");
        radio1.tambahVolume(8);
        
        System.out.println("=== Update Informasi Radio 1 ===");
        System.out.println("Frekuensi baru: " + radio1.frekuensi + " MHz");
        System.out.println("Gelombang baru: " + radio1.gelombang);
        System.out.println("Volume baru: " + radio1.volume);
        System.out.println();

        System.out.println("\n=== Informasi Radio 2 ===");
        System.out.println("Merk Radio 2: " + radio2.merk);
        System.out.println("Frekuensi: " + radio2.frekuensi + " MHz");
        System.out.println("Gelombang: " + radio2.gelombang);
        System.out.println("Volume: " + radio2.volume);
        System.out.println();

        radio2.cariFrekuensi(95.7);
        radio2.ubahGelombang("FM");
        radio2.tambahVolume(10);
        System.out.println();

        System.out.println("=== Update Informasi Radio 2 ===");
        System.out.println("Frekuensi baru: " + radio2.frekuensi + " MHz");
        System.out.println("Gelombang baru: " + radio2.gelombang);
        System.out.println("Volume baru: " + radio2.volume);
    }
}
