import java.util.Scanner;

public class AdvancedBubbleSort {
    static void bubbleSort(int[] numbers) {
        for (int pass = 0; pass < numbers.length - 1; pass++) {
            for (int i = 0; i < numbers.length - pass - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temporary = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temporary;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];

        System.out.print("Enter 6 numbers: ");
        for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextInt();

        bubbleSort(numbers);

        System.out.print("Sorted numbers: ");
        for (int number : numbers) System.out.print(number + " ");
        System.out.println();
        input.close();
    }
}
