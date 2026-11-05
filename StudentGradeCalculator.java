import java.util.Scanner;

public class StudentGradeCalculator {
    private static final int SUBJECT_COUNT = 5;
    private static final int MAX_MARKS = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;

        System.out.println("Enter marks for " + SUBJECT_COUNT + " subjects (0-100):");

        for (int subject = 1; subject <= SUBJECT_COUNT; subject++) {
            int marks;
            do {
                System.out.print("Subject " + subject + ": ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Please enter a whole number: ");
                    scanner.next();
                }
                marks = scanner.nextInt();

                if (marks < 0 || marks > MAX_MARKS) {
                    System.out.println("Marks must be between 0 and 100. Try again.");
                }
            } while (marks < 0 || marks > MAX_MARKS);

            totalMarks += marks;
        }

        double percentage = (double) totalMarks / SUBJECT_COUNT;
        String grade;

        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 70) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nTotal marks: " + totalMarks + " / " + (SUBJECT_COUNT * MAX_MARKS));
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println(percentage >= 40 ? "Result: Pass" : "Result: Fail");

        scanner.close();
    }
}
