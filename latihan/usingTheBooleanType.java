package latihan;

public class usingTheBooleanType {
    public static void main(String args []){
        System.out.println("True or False?");
        System.out.println("You can fit all ten of the");
        System.out.println("Brickenchicker dectuplets");
        System.out.println("on the elevator:");
        System.out.println(); // memberitahu program untuk menampilkan baris kosong

        int weightOfAPerson = 150;
        int elevatorWeightLimit = 1400;
        int numberOfPeople = elevatorWeightLimit / weightOfAPerson;

        System.out.println(numberOfPeople);

        boolean allTenOkey = numberOfPeople >= 10;

        System.out.println(allTenOkey);
    }
}
