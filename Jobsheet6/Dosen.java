package Jobsheet6;

public class Dosen extends Pegawai {
    public String nidn;
    
    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
    }

    public Dosen() {
        System.out.println(gaji);
        System.out.println("Objek dari class Dosen dibuat");
    }

    public String getInfo() {
        return "NIDN    : " + nidn + "\n";
    }
    public String getAllInfo() {
        String info= super.getInfo();
        info += "NIDN   : " + nidn;
        return info;
    }

}
