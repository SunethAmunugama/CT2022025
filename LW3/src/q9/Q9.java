package q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows you want to enter");
        int rows  = scanner.nextInt();

        for ( int i = 1 ; i <= rows ; i++ ) {

            for (int k = 1 ; k <= rows - i; k++ ) {
                System.out.print(" ");
            }

            for (int j = 1; j <=(2 * i - 1); j++ ) {
                System.out.print("*");
            }
            System.out.println( );


        }


    }
}
