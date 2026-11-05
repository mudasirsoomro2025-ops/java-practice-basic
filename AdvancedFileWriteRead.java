import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AdvancedFileWriteRead {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fileName = "practice_note.txt";

        System.out.print("Enter a message: ");
        String message = input.nextLine();

        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println(message);
        } catch (FileNotFoundException error) {
            System.out.println("Unable to write to the file.");
            input.close();
            return;
        }

        try (Scanner fileReader = new Scanner(new File(fileName))) {
            if (fileReader.hasNextLine()) {
                System.out.println("Saved message: " + fileReader.nextLine());
            }
        } catch (FileNotFoundException error) {
            System.out.println("Unable to read the file.");
        }
        input.close();
    }
}
