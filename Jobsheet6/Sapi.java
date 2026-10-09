package Jobsheet6;

public class Sapi extends Hewan {
    public String idTernak;

    public Sapi(String habitat, String jenisHewan, String jenisMakanan, String idTernak) {
        super(habitat, jenisHewan, jenisMakanan);
        this.idTernak = idTernak;
    }

    public Sapi() {
        System.out.println("Objek dari class Sapi dibuat");
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "ID Ternak       : " + idTernak;
        return info;
    }
}
