import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker");
        System.out.println("Enter single words only");
        System.out.println("Type 'quit' to exit");


        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            }

            String lowerWord = "";
            int i = 0;
            while (i < word.length()) {
                char ch = word.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    lowerWord = lowerWord + (char)(ch + 32);
                } else {
                    lowerWord = lowerWord + ch;
                }
                i++;
            }

            boolean isPalindrome = true;
            int left = 0;
            int right = lowerWord.length() - 1;

            while (left < right) {
                if (lowerWord.charAt(left) != lowerWord.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println( word + " is a palindrome!\n");
            } else {
                System.out.println(word + " is NOT a palindrome.\n");
            }
        }

        scanner.close();
    }
}