import java.util.Scanner;
public class test{
    public static String checkAge(int age){
        String result = age >= 18 ? "Can Enter" : "Cannot Enter";

        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Your Age : ");
        String isWorthy = checkAge(input.nextInt());
        System.out.println("You " + isWorthy);

        input.close();
    }
}