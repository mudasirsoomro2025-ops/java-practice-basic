import java.util.Scanner;

public class AgeCheckForVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote: " + age);
        } else {
            System.out.println("You are not eligible to vote: " + age);
        }

        scanner.close();
    }
}
