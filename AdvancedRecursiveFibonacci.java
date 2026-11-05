import java.util.Scanner;

public class AdvancedRecursiveFibonacci {
    static long fibonacci(int position) {
        if (position <= 1) return position;
        return fibonacci(position - 1) + fibonacci(position - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = input.nextInt();

        if (terms < 1 || terms > 40) {
            System.out.println("Enter a number between 1 and 40.");
        } else {
            for (int i = 0; i < terms; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
