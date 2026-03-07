public class array {
    public static double calculateAverage(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }

        int arrSize = arr.length;

        Double average = ((double)sum / (double)arrSize);

        return average;
    }

    public static void main (String[] args){

        int[] arr = {1, 2, 4 , 9, 6, 7};
        double average = calculateAverage(arr);

        System.out.print("Average of ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("is : " + average);
    }
}
