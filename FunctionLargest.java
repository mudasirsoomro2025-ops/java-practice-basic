import java.util.Scanner;

public class FunctionLargest {
    static int findLargest(int first, int second, int third) {
        int largest = first;

        if (second > largest) {
            largest = second;
        }
        if (third > largest) {
            largest = third;
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        System.out.println("Largest number: " + findLargest(first, second, third));
        input.close();
    }
}
