import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter wide in pixels:");
        int W = scanner.nextInt();
        System.out.println("Enter high in pixels:");
        int H= scanner.nextInt();

        System.out.println("Enter Name for Title: ");
        String Title= scanner.next();

        JFrame mywindow= new JFrame();

        mywindow.setSize(W,H);
        mywindow.setTitle(""+Title);
        mywindow.setVisible(true);


    }
}