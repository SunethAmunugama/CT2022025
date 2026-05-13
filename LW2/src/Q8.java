import java.util.Scanner;

public class Q8 {
    static void main() {
        final double pi = 3.14;

        double V;

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the radius of sphere:");
        double r = scanner.nextInt();

        V= (4.0/3)* (pi * Math.pow(r,3));

        System.out.println("Volume is " + String.format("%.2f", V));
    }
}