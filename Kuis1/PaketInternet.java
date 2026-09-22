public class PaketInternet {
    private String kodePaket;
    private int kuota; 
    private double harga;
    private boolean aktif;

    public PaketInternet(String kodePaket, int kuota, double harga) {
        this.kodePaket = kodePaket;
        
        if (kuota > 0) {
            this.kuota = kuota;
        } else {
            System.out.println("Error: Kuota harus > 0. Diset ke default 1 MB.");
            this.kuota = 1;
        }
        
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Error: Harga tidak bisa negatif. Diset ke 0.");
            this.harga = 0;
        }
        
        this.aktif = false; 
    }

    // Getter & Setter 
    public String getKodePaket() {
        return kodePaket;
    }

    public int getKuota() {
        return kuota;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        }
    }

    public boolean isAktif() {
        return aktif;
    }

    // Method
    public void aktifkan() {
        aktif = true;
        System.out.println("Paket " + kodePaket + " diaktifkan.");
    }

    public void nonaktifkan() {
        aktif = false;
        System.out.println("Paket " + kodePaket + " dinonaktifkan.");
    }

    public void gunakanKuota(int jumlah) {
        if (!aktif) {
            System.out.println("Error: Gagal pakai kuota. Paket " + kodePaket + " masih nonaktif.");
            return;
        }
        if (jumlah <= 0) {
            System.out.println("Error: Jumlah penggunaan harus positif.");
            return;
        }
        if (jumlah > kuota) {
            System.out.println("Error: Kuota tidak cukup. Sisa " + kuota + " MB, mau pakai " + jumlah + " MB.");
            return;
        }
        kuota -= jumlah;
        System.out.println("Berhasil pakai " + jumlah + " MB. Sisa kuota: " + kuota + " MB.");
    }

    public void cetakInfo() {
        String status = aktif ? "Aktif" : "Nonaktif";
        System.out.println("Kode paket:" + kodePaket);
        System.out.println("Sisa kuota: " + kuota + " MB");
        System.out.println("Harga: " + harga);
        System.out.println("Status: " + status);
        System.out.println("------------------------------");
    }
}

