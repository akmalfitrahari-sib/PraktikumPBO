package Jobsheet2.TugasNo2;

public class Radio {
    public String merk;
    public int volume;
    public double frekuensi;
    public String gelombang;

    public void cariFrekuensi(double frekuensiBaru) {
        this.frekuensi = frekuensiBaru;
        System.out.println("Mencari frekuensi radio: " + frekuensi + " MHz");
    }

    public void tambahVolume(int volumeBaru) {
        this.volume = volumeBaru;
        System.out.println("Volume radio telah ditambah ke: " + volume);
    }

    public void ubahGelombang(String gelombangBaru) {
        this.gelombang = gelombangBaru;
        System.out.println("Gelombang radio telah diubah ke: " + gelombang);
    }

}
