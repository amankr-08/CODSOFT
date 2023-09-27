import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text or provide a file to count the words: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        int wordCount = 0;

        for (String word : words) {
            wordCount++;
        }

        System.out.println("Total count of words: " + wordCount + ".");
}
}