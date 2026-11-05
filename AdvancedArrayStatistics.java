import java.util.Scanner;

public class AdvancedArrayStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) largest = numbers[i];
            if (numbers[i] < smallest) smallest = numbers[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / numbers.length);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        input.close();
    }
}
