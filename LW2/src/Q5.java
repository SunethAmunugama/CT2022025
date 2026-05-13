import java.util.Scanner;

public class Q5 {
    static void main() {
        double c;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter value if Fahrenheit: ");
        double f= scanner.nextDouble();

        c=(5/9)*(f-32);

        System.out.println("Celcius: "+String.format("%.2f",c));
    }
}