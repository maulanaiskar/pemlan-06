public class Nonmember extends Induk {

    public Nonmember(String nama, String ktp, String telp, String alamat) {
        super(nama, ktp, telp, alamat);
    }

    @Override
    public void rincianKamar() {
        int i = 0, no = 1;
        String hr = (getHari() == HariKerja) ? "Hari Kerja" : "Weekend";
        while (i < getSingle()) {
            System.out.println(no + ". Single " + hr + " :" + biayaKamar[getHari()][0]);
            i++;
            no++;
        }
        i = 0;
        while (i < getDouble()) {
            System.out.println(no + ". Double " + hr + " :" + biayaKamar[getHari()][1]);
            i++;
            no++;
        }
        i = 0;
        while (i < getSuite()) {
            System.out.println(no + ". Suite " + hr + " :" + biayaKamar[getHari()][2]);
            i++;
            no++;
        }
    }

    @Override
    public double getBiayaKamar() {
        double totalBiayaKamar = 0;

        totalBiayaKamar += (getSingle() * biayaKamar[getHari()][0]);
        totalBiayaKamar += (getDouble()* biayaKamar[getHari()][1]);
        totalBiayaKamar += (getSuite()* biayaKamar[getHari()][2]);

        return totalBiayaKamar;
    }

    @Override
    public void tambahanFasilitas() {
        int no = 1;
        if (getKolamRenang() > 0) {
            System.out.println(no + ". Kolam Renang " + getKolamRenang() + " x 25000 =" + (getKolamRenang() * 25000));
            no++;
        }
        if (getSauna() > 0) {
            System.out.println(no + ". Sauna " + getSauna() + " x 150000 =" + (getSauna() * 150000));
            no++;
        }
        if (getSpa() > 0) {
            System.out.println(no + ". Spa " + getSpa() + " x 150000 =" + (getSpa() * 150000));
            no++;
        }
    }

    @Override
    public double getDiskon() {
        return 0;

    }

    @Override
    public void rincianFasilitas() {
        int jmlOrang = getSingle() + (getDouble() * 2) + (getSuite() * 6);
        System.out.println("1. Kolam Renang: " + jmlOrang + " orang");
        System.out.println("2. Sauna: " + jmlOrang + " orang");
        System.out.println("3. Spa: " + jmlOrang + " orang");

    }

    @Override
    public double getBiayaFasilitas() {
        double totalBiayaFasilitas = 0;
        totalBiayaFasilitas += (getKolamRenang() * 25000);
        totalBiayaFasilitas += (getSauna() * 150000);
        totalBiayaFasilitas += (getSpa() * 150000);
        return totalBiayaFasilitas;
    }

    @Override
    public void rincianMakan() {
        int jmlOrang = getSingle() + (getDouble() * 2) + (getSuite() * 6);
        System.out.println("1. Breakfast: " + jmlOrang + " (Free)");
    }

    @Override
    public void tambahanMakanan() {
        int no = 1;
        if (getBreakfast() > 0) {
            System.out.println(no + ". Breakfast " + getBreakfast() + " x 25000 =" + (getBreakfast() * 25000));
            no++;
        }
        if (getLunch() > 0) {
            System.out.println(no + ". Lunch " + getLunch() + " x 25000 =" + (getLunch() * 25000));
            no++;
        }
        if (getDinner() > 0) {
            System.out.println(no + ". Dinner " + getDinner() + " x 30000 =" + (getDinner() * 30000));
            no++;
        }
    }

    @Override
    public double getBiayaMakan() {
        double totalBiayaMakan = 0;
        totalBiayaMakan += (getBreakfast() * 25000);
        totalBiayaMakan += (getLunch() * 25000);
        totalBiayaMakan += (getDinner() * 30000);
        return totalBiayaMakan;
    }

    @Override
    public double getTotalBayar() {
        return (getKamarDiskon() + getBiayaMakan() + getBiayaFasilitas());
    }

    @Override
    public void printInfo() {
        System.out.println("Nama\t: " + getNama());
        System.out.println("No. KTP\t: " + getKTP());
        System.out.println("Telepon\t: " + getTelp());
        System.out.println("Alamat\t: " + getAlamat());
        System.out.println("Jenis Anggota\t: Non Member");
        System.out.println("Jumlah pesan kamar (maks 3):" + getJumlahKamar());
        rincianKamar();
        System.out.println("Total:" + getBiayaKamar());
        System.out.println("Diskon Member:" + getDiskon());
        System.out.println("Biaya Kamar:" + getKamarDiskon());
        System.out.println("Fasilitas Diperoleh: - ");
        System.out.println("Tambahan Pesan Fasilitas: Kolam 12 dan Sauna 12");
        tambahanFasilitas();
        System.out.println("Voucher Makan Diperoleh:");
        rincianMakan();
        System.out.println("Tambahan Pesan Makanan:");
        tambahanMakanan();
        System.out.println("Total yang harus dibayarkan: Rp " + getTotalBayar());
    }

}
