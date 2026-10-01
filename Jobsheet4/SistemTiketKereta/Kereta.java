package Jobsheet4.SistemTiketKereta;
import java.time.LocalTime;

public class Kereta {
    private String kodeKereta;
    private String namaKereta;
    private String stasiunAsal;
    private String stasiunTujuan;
    private LocalTime jamKeberangkatan;
    private int jumlahKursi;

    public Kereta(String kodeKereta, String namaKereta, String stasiunAsal, String stasiunTujuan, LocalTime jamKeberangkatan, int jumlahKursi) {
        this.kodeKereta = kodeKereta;
        this.namaKereta = namaKereta;
        this.stasiunAsal = stasiunAsal;
        this.stasiunTujuan = stasiunTujuan;
        this.jamKeberangkatan = jamKeberangkatan;
        this.jumlahKursi = jumlahKursi;
    }

    public boolean cekKetersediaanKursi() {
        return jumlahKursi > 0;
    }

    public void kurangiKursi() {
        if (jumlahKursi > 0) {
            jumlahKursi--;
        }
    }

    public void tambahKursi() {
        jumlahKursi++;
    }

    public String getInfoKereta() {
        String info = "";
        info += "Kode Kereta: " + kodeKereta + "\n";
        info += "Nama Kereta: " + namaKereta + "\n";
        info += "Stasiun Asal: " + stasiunAsal + "\n";
        info += "Stasiun Tujuan: " + stasiunTujuan + "\n";
        info += "Jam Keberangkatan: " + jamKeberangkatan + "\n";
        info += "Jumlah Kursi Tersedia: " + jumlahKursi + "\n";

        info += "\n";

        return info;
    }
}
