import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // masukan nama
        String name = input.nextLine();
        System.out.println("Panjang : " + name.length());
        System.out.println("upper case : " + name.toUpperCase());
        System.out.println("lower case : " + name.toLowerCase());

        int HurufVokal = 0;
        for (int i = 0; i < name.length(); i++) {
            name.toLowerCase();
            char kata = name.charAt(i);
            if (kata == 'a' || kata == 'i' || kata == 'u' || kata == 'e' || kata == 'o') {
                HurufVokal += 1;
            }
        }

        System.out.println("huruf vokal : " + HurufVokal);

        System.out.print("Kata Terbalik : ");
        for (int i = name.length(); i > 0; i--) {
            char kata = name.charAt(i - 1);
            System.out.print(kata);
        }
        input.close();
    }
}
