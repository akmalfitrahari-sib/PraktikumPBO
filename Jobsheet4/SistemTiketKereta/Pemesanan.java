package Jobsheet4.SistemTiketKereta;
import java.time.LocalDate;
import java.util.ArrayList;

public class Pemesanan {
    private String idPemesanan;
    private LocalDate tanggalPemesanan;
    private double totalHarga;
    private String statusPemesanan;
    private ArrayList<Tiket> daftarTiket;

    public Pemesanan(String idPemesanan, LocalDate tanggalPemesanan, double totalHarga, String statusPemesanan) {
        this.idPemesanan = idPemesanan;
        this.tanggalPemesanan = tanggalPemesanan;
        this.totalHarga = totalHarga;
        this.statusPemesanan = statusPemesanan;
        this.daftarTiket = new ArrayList<Tiket>();
    }

    public void tambahTiket(Tiket tiket) {
        daftarTiket.add(tiket);
    }

    public double hitungTotalHarga() {
        double total = 0;
        for (Tiket tiket : daftarTiket) {
            total += tiket.getHarga();
        }
        return total;
    }

    public void ubahStatus(String status) {
        this.statusPemesanan = status;
    }

    public void lihatDetailPemesanan() {
        System.out.println("\n===== DETAIL PEMESANAN =====");
        System.out.println("ID Pemesanan     : " + idPemesanan);
        System.out.println("Tanggal Pemesanan: " + tanggalPemesanan);
        System.out.println("Status Pemesanan : " + statusPemesanan);

        System.out.println("\n===== DAFTAR TIKET =====");

        for (Tiket tiket : daftarTiket) {
            System.out.println(tiket.getInfoTiket());
        }

        System.out.println("============================");
        System.out.println("Total Harga      : Rp" + hitungTotalHarga());
    }
}

