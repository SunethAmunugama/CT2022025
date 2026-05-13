package q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int X,Y,Z,Min;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Integer");
        X = scanner.nextInt();
        System.out.println("Enter Second Integer");
        Y = scanner.nextInt();
        System.out.println("Enter Third Integer");
        Z = scanner.nextInt();
         if (X<Y && X<Z){
             Min = X;
         }
         else if (Y<Z && Y<X){
             Min = Y;
         }
            else {
             Min = Z;
         }
        System.out.println("Minimum number is "+Min);
    }
}
