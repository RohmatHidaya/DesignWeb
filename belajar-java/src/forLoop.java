import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input The Number Between 1 - 1000 :");
        int value = input.nextInt();
        int n = 1000;

        for (int i = 0; i < n; i++) {
            if (i == value) {
                System.out.println("nilai : " + value);
                break;
            }
        }

        input.close();
    }
}
