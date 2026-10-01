package Jobsheet4.SistemTiketKereta;
import java.time.LocalTime;
import java.time.LocalDate;

public class PemesananTiketDemo {
    public static void main(String[] args) {
        Penumpang penumpang1 = new Penumpang("P001", "Doni Sanzu", "doni.sanzu@example.com", "081234567890");
        Penumpang penumpang2 = new Penumpang("P002", "Rina Anggraini", "rina.anggraini@example.com", "081234567891");

        Kereta kereta1 = new Kereta("K001", "Argo Bromo", "Surabaya", "Jakarta", LocalTime.of(8, 0), 100);
        Kereta kereta2 = new Kereta("K002", "Gajayana",  "Malang", "Jakarta", LocalTime.of(9, 0), 80);

        Tiket tiket1 = new Tiket("T001", "A1", "Eksekutif", 500000, "Tersedia", kereta1);
        Tiket tiket2 = new Tiket("T002", "B1", "Eksekutif", 450000, "Tersedia", kereta2);

        Pemesanan pemesanan1 = new Pemesanan("PM001", LocalDate.parse("2024-06-24"), 500000, "Belum Dibayar");
        pemesanan1.tambahTiket(tiket1);
        penumpang1.pesanTiket(pemesanan1);
        pemesanan1.lihatDetailPemesanan();

        Pemesanan pemesanan2 = new Pemesanan("PM002", LocalDate.parse("2024-06-25"), 450000, "Dibayar");
        pemesanan2.tambahTiket(tiket2);
        penumpang2.pesanTiket(pemesanan2);
        pemesanan2.lihatDetailPemesanan();
    }
}
