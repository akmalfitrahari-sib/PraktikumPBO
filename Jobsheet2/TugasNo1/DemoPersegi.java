package Jobsheet2.TugasNo1;

public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 10;
        pp.lebar = 5;
        
        pp.displayInfo();
        pp.getLuas();       
        pp.getKeliling();
    }
}
