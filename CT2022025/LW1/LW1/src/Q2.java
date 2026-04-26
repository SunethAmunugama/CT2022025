import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name ");
        String firstName = scanner.next();

        System.out.println("Enter Last Name ");
        String lastName = scanner.next();

        String fullname = firstName + " " + lastName;
        System.out.println(fullname);

        JFrame myWindow = new JFrame();
        myWindow.setSize(800, 600);
        myWindow.setTitle(fullname);
        myWindow.setVisible(true);

    }
}
