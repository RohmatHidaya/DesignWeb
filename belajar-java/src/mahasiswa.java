public class mahasiswa {
    public String nama;
    private String nim;
    protected String jurusan;
    String alamat;

    public mahasiswa() {

    }

    public mahasiswa(String nama) {
        this.nama = nama;
    }

    public mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
        System.out.println("nim berhasil di set");
    }

    public void tampilData() {
        System.out.println("nama : " + this.nama);
        System.out.println("nim : " + this.nim);
        System.out.println("Jurusan : " + this.jurusan);
        System.out.println("alamat : " + this.alamat);
    }

    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("rohmat hidayat", "24311138", "Sistem Informasi", "jl. melati");

        // mahasiswa1 =
        mhs.jurusan = "informatika";
        mhs.alamat = "lampung";
        mhs.setNim("2222");
        mhs.tampilData();
        System.out.println(mhs.getNim());

        mahasiswa mhs2 = new mahasiswa();
        mhs2.tampilData();

    }
}
