import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Input Nama");
        JLabel label = new JLabel("Masukan Nama Anda");
        label.setBounds(50, 25, 200, 30);

        JTextField text = new JTextField();
        text.setBounds(50, 50, 200, 30);

        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(50, 100, 100, 30);

        JLabel tampil = new JLabel();
        tampil.setBounds(50, 125, 200, 30);

        JButton tombol1 = new JButton("1");
        tombol1.setBounds(50, 150, 50, 30);

        JButton tombol2 = new JButton("2");
        tombol2.setBounds(100, 150, 50, 30);

        buttonSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tampil.setText("halo " + text.getText());
                int a = 1 + 1;
            }
        });

        frame.add(label);
        frame.add(text);
        frame.add(buttonSubmit);
        frame.add(tampil);
        frame.add(tombol1);
        frame.add(tombol2);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
