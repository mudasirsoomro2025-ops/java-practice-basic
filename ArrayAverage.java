import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];
        double total = 0;

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            total += numbers[i];
        }

        double average = total / numbers.length;
        System.out.printf("Average: %.2f%n", average);
        scanner.close();
    }
}
