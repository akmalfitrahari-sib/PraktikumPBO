package Jobsheet6;

public class Hewan {
    public String habitat;
    public String jenisHewan;
    public String jenisMakanan;
    
    public Hewan(String habitat, String jenisHewan, String jenisMakanan) {
        this.habitat = habitat;
        this.jenisHewan = jenisHewan;
        this.jenisMakanan = jenisMakanan;
    }

    public Hewan() {
        System.out.println("Objek dari class Hewan dibuat");
    }

    public String getInfo() {
        String info = "";
        info += "Habitat Hewan   : " + habitat + "\n";
        info += "Jenis Hewan     : " + jenisHewan + "\n";
        info += "Jenis Makanan   : " + jenisMakanan + "\n";
        return info;
    }
}
