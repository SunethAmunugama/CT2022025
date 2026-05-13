import java.util.Scanner;

public class Q6 {
    static void main() {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your born Year: ");
        int year= scanner.nextInt();

        int currentYear = java.time.Year.now().getValue();

        int age = currentYear - year;

        System.out.println("You are " + age + " years old.");

    }
}