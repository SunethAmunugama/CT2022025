import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        double feet;
        double inch;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Value in cm: ");
        double cm= scanner.nextDouble();

        double Inch = cm/2.54;

        feet = Inch/12;
        inch= Inch % 12;

        System.out.println("Feet: "+String.format("%.2f",feet) + " Inches: "+String.format("%.2f",inch));


    }
}