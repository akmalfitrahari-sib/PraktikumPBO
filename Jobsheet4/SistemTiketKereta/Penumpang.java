package Jobsheet4.SistemTiketKereta;
import java.util.ArrayList;

public class Penumpang {
    private String idPenumpang;
    private String nama;
    private String email;
    private String noTelepon;
    private ArrayList<Pemesanan> daftarPemesanan;

    public Penumpang(String idPenumpang, String nama, String email, String noTelepon) {
        this.idPenumpang = idPenumpang;
        this.nama = nama;
        this.email = email;
        this.noTelepon = noTelepon;
        this.daftarPemesanan = new ArrayList<Pemesanan>();
    }

    public void pesanTiket(Pemesanan pemesanan) {
        daftarPemesanan.add(pemesanan);
    }

    public void lihatPemesanan() {
        if (daftarPemesanan.isEmpty()) {
            System.out.println("Belum ada pemesanan");
        }
        else {
            for (Pemesanan pemesanan : daftarPemesanan) {
                pemesanan.lihatDetailPemesanan();
            }
        }
    }

    public String getInfoPenumpang() {
        String info = "";
        info += "ID Penumpang   : " + this.idPenumpang + "\n";
        info += "Nama           : " + this.nama + "\n";
        info += "Email          : " + this.email + "\n";
        info += "No Telepon     : " + this.noTelepon + "\n";
        info += "Jumlah Pesanan : " + this.daftarPemesanan.size() + "\n";
        info += "\n";

        return info;
    }
}
