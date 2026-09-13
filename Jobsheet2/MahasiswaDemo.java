package Jobsheet2;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa();

        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        m2.nim = "023433";
        m2.nama = "Dika";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2B";

        m3.nim = "023434";
        m3.nama = "Anwar";
        m3.alamat = "Jakarta, Jawa Barat";
        m3.kelas = "2C";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}
