// import java.util.Scanner;
public class forLoop {

    public static int calculateNaturalInt (int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // System.out.print("Input The Number Between 1 - 1000 :");
        // int value = input.nextInt();
        // int n = 1000;

        // for (int i = 0; i < n; i++) {
        //     if (i == value) {
        //         System.out.println("nilai : " + value);
        //         break;
        //     }
        // }

        // input.close();

        int NaturalInt = calculateNaturalInt(5);
        System.out.println(NaturalInt);
    }
    
}
