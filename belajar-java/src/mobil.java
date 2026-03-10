public class mobil {
    String merk;
    int tahun;
    String warna;

    mobil(String merk, int tahun, String warna) {
        this.merk = merk;
        this.tahun = tahun;
        this.warna = warna;
    }

    public void TampilMobil() {
        System.out.println("Merek : " + this.merk);
        System.out.println("Tahun : " + this.tahun);
        System.out.println("Warna : " + this.warna);
    }

    public static void main(String[] args) {
        mobil avansa = new mobil("avansa", 2025, "biru");
        avansa.TampilMobil();
    }
}
