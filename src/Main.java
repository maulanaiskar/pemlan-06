public class Main {

    public static void main(String[] args) {

        Premium p1 = new Premium("Dono", "001", "01234", "Probolinggo");
        p1.setKamar(p1.HariKerja, 2, 3, 1);
        p1.setMakan(5, 0, 5);
        p1.printInfo();

        Member m1 = new Member("Kasino", "002", "56789", "Malang");
        m1.setKamar(m1.HariKerja, 1, 2, 1);
        m1.setMakan(1, 1, 6);
        m1.setFasilitas(0, 6, 0);
        m1.printInfo();

        Nonmember n1 = new Nonmember("Indro", "003", "09876", "Surabaya");
        n1.setKamar(n1.Weekend, 0, 0, 2);
        n1.setMakan(0, 12, 12);
        n1.setFasilitas(12, 0, 12);
        n1.printInfo();
    }

}
