public class DemoLayanan {
    public static void main(String[] args) {
        LayananAkademik mhs1 = new LayananAkademik("A01", "Herman", "KRS");
        mhs1.layani();
        mhs1.selesai();
        mhs1.cetakInfo();
        System.out.println("Status akhir antrian " + mhs1.getNomorAntrian() + ": " + mhs1.getStatus());
        System.out.println("======================================" );

        LayananAkademik mhs2 = new LayananAkademik("A02", "Adit", "Cuti");
        mhs2.batalkan();
        mhs2.selesai();
        mhs2.cetakInfo();
        System.out.println("Status akhir antrian " + mhs2.getNomorAntrian() + ": " + mhs2.getStatus());
        System.out.println("======================================" );

        LayananAkademik mhs3 = new LayananAkademik("A03", "Tejo", "Transkrip");
        mhs3.selesai();
        mhs3.cetakInfo();
        System.out.println("Status akhir antrian " + mhs3.getNomorAntrian() + ": " + mhs3.getStatus());
        System.out.println("======================================" );

        LayananAkademik mhs4 = new LayananAkademik("A04", "Abdul", "KRS");
        mhs4.layani();
        mhs4.selesai();
        mhs4.batalkan();
        mhs4.cetakInfo();
        System.out.println("Status akhir antrian " + mhs4.getNomorAntrian() + ": " + mhs4.getStatus());
        System.out.println("======================================" );
    }
}
