import java.util.Scanner;

public class Q3 {
    static void main() {
        double f;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter value in Celcius:");
        double c= scanner.nextDouble();

        f= (1.8*c)+32;

        System.out.println("Fahrenheit: "+String.format("%.2f",f));
    }
}