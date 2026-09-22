public class LayananAkademik {
    private String nomorAntrian;
    private String identitasMahasiswa;
    private String jenisLayanan;
    private String status;

    // Constructor berparameter
    public LayananAkademik(String nomorAntrian, String identitasMahasiswa, String jenisLayanan) {
        this.nomorAntrian = nomorAntrian;
        this.identitasMahasiswa = identitasMahasiswa;
        this.jenisLayanan = jenisLayanan;
        this.status = "MENUNGGU";
    }

    // Getter & Setter 
    public String getNomorAntrian(){
        return nomorAntrian;
    }

    public String getIdentitasMahasiswa() {
        return identitasMahasiswa;
    }

    public void setIdentitasMahasiswa(String identitasMahasiswa) {
        this.identitasMahasiswa = identitasMahasiswa;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    public String getStatus() {
        return status;
    }

    // Method
    public void layani() {
        if (status.equals("MENUNGGU")) {
            status = "DILAYANI";
            System.out.println("Antrian " +nomorAntrian + " dilayani.");
        } else {
            System.out.println("Error: Antrian " + nomorAntrian + "tidak bisa dilayani");
        }
    }

    public void selesai() {
        if (status.equals("DILAYANI")) {
            status = "SELESAI";
            System.out.println("Antrian " + nomorAntrian + " telah dilayani.");
        } else {
        System.out.println("Error: Layanan tidak dapat diselesaikan, nomor antrian" + nomorAntrian + "belum dilayani.");
        }
    }

    public void batalkan() {
        if (status.equals("MENUNGGU")) {
            status = "BATAL";
            System.out.println("Antrian " + nomorAntrian + " berhasil dibatalkan.");
        } else {
            System.out.println("Error: Tidak dapat dibatalkan, sedang dilayani (" + status + ").");
        }
    }

    public void cetakInfo() {
        System.out.println("Nomor antrian:" + nomorAntrian);
        System.out.println("Identitas mahasiswa: " + identitasMahasiswa);
        System.out.println("Jenis layanan: " + jenisLayanan);
    }
}

