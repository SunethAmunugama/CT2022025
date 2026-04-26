import java.util.Scanner;

public class Q3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name ");
        String firstName = scanner.next();

        System.out.println("Enter Middle Name ");
        String middleName = scanner.next();

        System.out.println("Enter Last Name ");
        String lastName = scanner.next();

        System.out.println(firstName + " " + middleName.substring(0,1) + "."+ " " + lastName);



    }
}
