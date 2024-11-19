import java.io.*;

public class App {
    public static void main(String[] args) {
        // Starter book
        Book input = new Book();

        // Read from BookText.txt
        try {
            input.readFromFile("BookText.txt", "Sample Book");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Translate to Pig Latin
        Book output = PigLatinTranslator.translate(input);

        // Print translated lines
        output.printlines(0, output.getLineCount());

        // Write translated book to a file
        try {
            output.writeToFile("TranslatedBook.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
