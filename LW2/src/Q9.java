import java.util.Scanner;

public class Q9 {
    static void main() {

        double I;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your invest money: ");
        double P= scanner.nextDouble();
        System.out.println("Enter your interest: ");
        double R = scanner.nextDouble();
        System.out.println("Enter Number of years: ");
        double N = scanner.nextDouble();

        I = P * (1 + Math.pow((R/100),N));

        System.out.println("Money earned : " + String.format("%.2f",I));
    }
}