package q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter year ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0)|| ( year % 400 == 0)){
            System.out.println("Leap Year");
        }
        else {
            System.out.println(" Not a leap year.");
        }


    }
}
