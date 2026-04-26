import java.util.Scanner;

public class Q11 {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Your First Name: ");
        String Fname = scanner.nextLine();
        System.out.println("Enter Your Middle Name: ");
        String Mname = scanner.nextLine();
        System.out.println("Enter Your Last Name: ");
        String Lname = scanner.nextLine();

        System.out.println(Fname + "," + Lname + " " +  Mname.charAt(0));
    }
}