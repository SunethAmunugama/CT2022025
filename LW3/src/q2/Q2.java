package q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String [] args){
        System.out.println("0.Magenta");
        System.out.println("1.Cyan");
        System.out.println("2.Red");
        System.out.println("3.Blue");
        System.out.println("4.Green");
        System.out.println("Select one color from the above list:");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        switch (selection){
            case 0:
                System.out.println("Magenta");
                break;
                case 1:
                    System.out.println("Cyan");
                    break;
                    case 2:
                        System.out.println("Red");
                        break;
                        case 3:
                            System.out.println("Blue");
                            break;
                            case 4:
                                System.out.println("Green");
                                break;
                                default:
                                    System.out.println("Invalid selection");

        }


    }
}
