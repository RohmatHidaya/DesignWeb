import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

public class AplikasiBank {
    public static void main(String[] args) {
        AkunBank akun1 = new AkunBank();

        JFrame frame = new JFrame("Aplikasi Bank");
        JLabel Header = new JLabel("Masukan Nama Anda");
        JTextField nama = new JTextField();
        JButton namaSubmit = new JButton("Submit");
        JLabel TampilSaldo = new JLabel();
        JLabel TambahSaldo = new JLabel("Tambah Saldo");
        JTextField saldo = new JTextField();
        JButton SubmitTambahSaldo = new JButton("Submit");
        JLabel TarikSaldo = new JLabel("Tarik Saldo");
        JTextField InputTarikSaldo = new JTextField();
        JButton SubmitTarikSaldo = new JButton("Submit");

        frame.setLayout(null);

        frame.add(Header);
        frame.add(nama);
        frame.add(namaSubmit);
        frame.add(TampilSaldo);
        frame.add(TambahSaldo);
        frame.add(saldo);
        frame.add(SubmitTambahSaldo);
        frame.add(TarikSaldo);
        frame.add(InputTarikSaldo);
        frame.add(SubmitTarikSaldo);

        Header.setBounds(50, 25, 200, 30);
        nama.setBounds(50, 50, 200, 30);
        namaSubmit.setBounds(253, 50, 100, 30);
        TampilSaldo.setText("Saldo Ando : Rp." + akun1.getSaldo() + ",00");
        TampilSaldo.setBounds(150, 200, 200, 30);
        TambahSaldo.setBounds(50, 225, 200, 30);
        saldo.setBounds(50, 250, 200, 30);
        SubmitTambahSaldo.setBounds(253, 250, 100, 30);
        TarikSaldo.setBounds(50, 275, 200, 30);
        InputTarikSaldo.setBounds(50, 300, 200, 30);
        SubmitTarikSaldo.setBounds(253, 300, 100, 30);

        namaSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                akun1.NamaPemilik = nama.getText();

                Header.setText("Hallo " + akun1.NamaPemilik + "!!");

            }
        });

        SubmitTambahSaldo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int jumlah = Integer.parseInt(saldo.getText());
                TampilSaldo.setText("Saldo Anda : Rp." + jumlah + ",00");
                akun1.setorUang(jumlah);
            }
        });

        SubmitTarikSaldo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int jumlah = Integer.parseInt(InputTarikSaldo.getText());
                akun1.tarikUang(jumlah);
                TampilSaldo.setText("Saldo Anda : Rp." + akun1.getSaldo() + ",00");

            }
        });

        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
