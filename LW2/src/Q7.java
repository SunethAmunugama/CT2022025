import java.util.Scanner;

public class Q7 {
    static void main() {

        double BMI;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Weight in Kilograms: ");
        int W = scanner.nextInt();
        System.out.println("Enter Your Height in Cm: ");
        int H = scanner.nextInt();

        BMI = W / Math.pow((H/100.0),2);


        System.out.println("BMI is "+ String.format("%.2f",BMI));
    }
}
