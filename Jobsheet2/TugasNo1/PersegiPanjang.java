package Jobsheet2.TugasNo1;

public class PersegiPanjang {
    public int panjang;
    public int lebar;
 
    public void displayInfo() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
    }

    public void getLuas() {
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }

    public void getKeliling() {
        int keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}
