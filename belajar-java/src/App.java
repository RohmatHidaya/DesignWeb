public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // book buku1 = new book("pemrograman dasar", "rohmat", 50000);
        // book buku2 = new book();

        // buku1.TampilkanInfo();
        // test
        // buku1.diskon(50);

        // buku1.TampilkanInfo();

        // buku2.harga = 10000;
        // buku2.TampilkanInfo();

        // System.out.println(math.sum(1, 1));

        mahasiswa mhs = new mahasiswa("rohmat", "243", "si", "lampung");
        mhs.nama = "rohmat hidayat";
        mhs.jurusan = "if";
        mhs.tampilData();

        mahasiswa mhs2 = new mahasiswa();
        mhs2.setNim("2431");

        mhs2.tampilData();

    }
}
