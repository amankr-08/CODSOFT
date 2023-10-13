import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text or provide a file to count the words: ");
        String input = scanner.nextLine();
        int wordCount = countWords(input);
        System.out.println("Total count of words: " + wordCount + ".");
    }

    public static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}
