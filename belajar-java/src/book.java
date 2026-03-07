public class book {
    String judul;
    String penulis;
    int harga;

    // constructor
    public book(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public book() {
        System.out.println("book berjalan");
        judul = "tidak diketahui";
        penulis = "tidak ada";
        harga = 0;
    }

    // method untuk menampilakn data
    public void TampilkanInfo() {
        System.out.println("judul : " + judul);
        System.out.println("penulis : " + penulis);
        System.out.println("harga : " + harga);
    }

    public void diskon(double x) {
        double persen = x / 100;
        double diskon = harga * persen;
        harga = harga - (int) diskon;
    }
}
