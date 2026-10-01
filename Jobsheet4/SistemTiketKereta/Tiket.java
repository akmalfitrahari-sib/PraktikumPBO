package Jobsheet4.SistemTiketKereta;

public class Tiket {
    private String idTiket;
    private String nomorKursi;
    private String kelas;
    private double harga;
    private String statusTiket;
    private Kereta kereta;

    public Tiket(String idTiket, String nomorKursi, String kelas, double harga, String statusTiket, Kereta kereta) {
        this.idTiket = idTiket;
        this.nomorKursi = nomorKursi;
        this.kelas = kelas;
        this.harga = harga;
        this.statusTiket = statusTiket;
        this.kereta = kereta;
    }

    public void cetakTiket() {
         System.out.println("======= TIKET KERETA =======");
         System.out.println("ID Tiket       : " + idTiket);
         System.out.println("Nomor Kursi    : " + nomorKursi);
         System.out.println("Kelas          : " + kelas);
         System.out.println("Harga          : " + harga);
         System.out.println("Status         : " + statusTiket);
        System.out.println("========================");
    }

    public void ubahStatus(String status) {
        this.statusTiket = status;
    }

    public double getHarga() {
        return harga;
    }

    public String getInfoTiket() {
        return "ID Tiket: " + idTiket +
           "\nNomor Kursi: " + nomorKursi +
           "\nKelas: " + kelas +
           "\nHarga: " + harga +
           "\nStatus: " + statusTiket;
    }
}
