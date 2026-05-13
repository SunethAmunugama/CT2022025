import java.util.Scanner;

public class Q4 {
    static void main() {
        double c;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your Body Weight:");
        double bw= scanner.nextDouble();

        c= bw*19;

        System.out.println("Calories: "+String.format("%.2f",c));
    }
}
