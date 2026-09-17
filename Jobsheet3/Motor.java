package Jobsheet3;

public class Motor {
    public String platNomor;
    public boolean isMesinon;
    public int kecepatan;

    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesinon) {
            System.out.println("Mesin On");
        }
        else {
            System.out.println("Mesin Off");
        }

        System.out.println("kecepatan: " + this.kecepatan);
        System.out.println("======================");
    }
}
