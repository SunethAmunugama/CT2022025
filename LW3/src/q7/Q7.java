package q7;

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        int Number;
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter a number: ");
            Number = sc.nextInt();

            if (Number < 0) {
                System.out.println("Program ended.");
                break;
            }

            if (Number < 10) {
                System.out.println("Word = 1");

            } else if (Number < 100) {
                System.out.println("Word = 2");

            } else if (Number < 1000) {
                System.out.println("Word = 3");

            } else if (Number < 10000) {
                System.out.println("Word = 4");

            } else if (Number < 100000) {
                System.out.println("Word = 5");

            } else if (Number < 1000000) {
                System.out.println("Word = 6");

            } else if (Number < 10000000) {
                System.out.println("Word = 7");

            } else if (Number < 100000000) {
                System.out.println("Word = 8");

            } else {
                System.out.println("Word = 9");
            }
        }

        sc.close();
    }
}