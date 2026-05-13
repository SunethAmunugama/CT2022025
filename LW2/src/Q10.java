import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        double Mir;
        double Nop;
        double Mp;
        double Tp;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input loan amount: ");
        double R = scanner.nextDouble();

        System.out.println("Annual interest rate (%): ");
        double I = scanner.nextDouble();

        System.out.println("Loan Period in Years: ");
        double M = scanner.nextDouble();

        Mir = (I / 100.0) / 12;
        Nop = M * 12;
        Mp = (R * Mir) / (1 - Math.pow(1 / (1 + Mir), Nop));
        Tp = Mp * Nop;

        System.out.println("Monthly Interest Rate: " + String.format("%.2f", Mir));
        System.out.println("Number Of Payments: " + String.format("%.0f", Nop));
        System.out.println("Monthly Payment: " + String.format("%.2f", Mp));
        System.out.println("Total Payment: " + String.format("%.2f", Tp));

        scanner.close();
    }
}
