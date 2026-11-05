import java.util.Scanner;

public class FunctionFactorial {
    static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            System.out.println("Factorial: " + calculateFactorial(number));
        }

        input.close();
    }
}
