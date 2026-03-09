public class AkunBank {
    public String NamaPemilik;
    private int saldo;

    public void setorUang(int jumlah) {
        this.saldo += jumlah;
    }

    public void tarikUang(int jumlah) {
        if (this.saldo >= jumlah) {
            this.saldo -= jumlah;
        } else {
            System.out.println("Saldo anda kurang!");
        }
    }

    public int getSaldo() {
        return this.saldo;
    }

    public static void main(String[] args) {
        AkunBank rohmat = new AkunBank();
        rohmat.setorUang(10000);
        rohmat.tarikUang(10000);
        System.out.println(rohmat.getSaldo());
    }
}
