import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            String reversedWord = sb.reverse().toString();

            if (word.equalsIgnoreCase(reversedWord)) {
                System.out.println("Palindrome word: " + word);
            } else {
                System.out.println("Given sentence doesn't contain any palindrome words");
            }
        }
    }
}
