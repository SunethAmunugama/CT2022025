import java.util.Scanner;

public class Q9 {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        int count=input.length();

        char first= input.charAt(0);
        char last=input.charAt(input.length()-1);

        System.out.println(count);
        System.out.println(first);
        System.out.println(last);

    }
}