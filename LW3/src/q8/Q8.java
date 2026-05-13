package Q8;

import java.util.Scanner;

public class Q8 {
    static void main() {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n= scanner.nextInt();
        int multi;
        int r=1;

        while(r<=10){
            multi=r*n;
            System.out.println(n+" mulitiply with "+r+" is "+multi);
            r++;
        }
    }
}