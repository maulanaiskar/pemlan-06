public abstract class Induk {

    private String nama;
    private String ktp;
    private String telp;
    private String alamat;
    private int jmlSingle, jmlDouble, jmlSuite;
    private int kolam, sauna, spa;
    private int breakfast, lunch, dinner;
    private int hari;
    public final int HariKerja = 0;
    public final int Weekend = 1;

    protected double biayaKamar[][] = {{200000, 375000, 750000}, {250000, 450000, 800000}};

    public Induk(String nama, String ktp, String telp, String alamat) {
        this.nama = nama;
        this.ktp = ktp;
        this.telp = telp;
        this.alamat = alamat;
    }

    public void setKamar(int hari, int jmlSingle, int jmlDouble, int jmlSuite) {
        this.jmlDouble = jmlDouble;
        this.jmlSingle = jmlSingle;
        this.jmlSuite = jmlSuite;
        this.hari = hari;
    }

    public void setFasilitas(int kolam, int sauna, int spa) {
        this.kolam = kolam;
        this.sauna = sauna;
        this.spa = spa;
    }

    public String getNama() {
        return nama;
    }

    public String getKTP() {
        return ktp;
    }

    public String getTelp() {
        return telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getSingle() {
        return jmlSingle;
    }

    public int getDouble() {
        return jmlDouble;
    }

    public int getSuite() {
        return jmlSuite;
    }

    public int getHari() {
        return hari;
    }

    public int getBreakfast() {
        return breakfast;
    }

    public int getLunch() {
        return lunch;
    }

    public int getDinner() {
        return dinner;
    }

    public int getKolamRenang() {
        return kolam;
    }

    public int getSauna() {
        return sauna;
    }

    public int getSpa() {
        return spa;
    }

    public int getJumlahKamar() {
        return (jmlDouble + jmlSingle + jmlSuite);
    }

    public void setMakan(int breakfast, int lunch, int dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public double getKamarDiskon() {
        return getBiayaKamar() - getDiskon();
    }

    public abstract void rincianKamar();

    public abstract void rincianFasilitas();

    public abstract void rincianMakan();

    public abstract void tambahanMakanan();

    public abstract double getBiayaKamar();

    public abstract void tambahanFasilitas();

    public abstract double getBiayaFasilitas();

    public abstract double getBiayaMakan();

    public abstract double getDiskon();

    public abstract double getTotalBayar();

    public abstract void printInfo();

}
