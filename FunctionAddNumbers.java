import java.util.Scanner;

public class FunctionAddNumbers {
    static int addNumbers(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();

        System.out.println("Sum: " + addNumbers(first, second));
        input.close();
    }
}
