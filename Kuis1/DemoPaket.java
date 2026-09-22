public class DemoPaket {
    public static void main(String[] args) {
        // Uji coba valid
        PaketInternet p1 = new PaketInternet("P01", 5000, 50000);
        // contoh output dengan getter
        System.out.println("Persiapan pakai paket " + p1.getKodePaket() + " (Kuota: " + p1.getKuota() + " MB)");
        p1.aktifkan();
        p1.gunakanKuota(1000); 
        p1.cetakInfo();

        // Uji coba saat status belum aktif (Awalnya nonaktif)
        PaketInternet p2 = new PaketInternet("P02", 2000, 20000);
        p2.gunakanKuota(500); 
        p2.cetakInfo();

        // Uji coba saat paket melebihi sisa kuota
        PaketInternet p3 = new PaketInternet("P03", 1000, 10000);
        p3.aktifkan();
        p3.gunakanKuota(1500); 
        p3.cetakInfo();
    }
}

