package q5;
import java.util.Scanner;

public class Q5 {


    static String[] itemNames = {
            "Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet",
            "Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice",
            "Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"
    };

    static double[] itemPrices = {
            3.49, 4.59, 3.99, 2.99,
            0.79, 0.69, 1.09, 0.59,
            1.99, 1.90, 2.49, 0.99
    };

    static int[] quantities = new int[12];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            displayMainMenu();

            System.out.print("Choose a category: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayEntreeMenu();
                    orderItem(input, 0, 3);
                    break;

                case 2:
                    displaySideDishMenu();
                    orderItem(input, 4, 7);
                    break;

                case 3:
                    displayDrinkMenu();
                    orderItem(input, 8, 11);
                    break;

                case 4:
                    printBill();
                    System.out.println("Thank you for visiting MyJava Burgers!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        input.close();
    }


    public static void displayMainMenu() {
        System.out.println("\n====== MyJava Burgers ======");
        System.out.println("1. Entree");
        System.out.println("2. Side Dish");
        System.out.println("3. Drink");
        System.out.println("4. Exit and Print Bill");
    }


    public static void displayEntreeMenu() {
        System.out.println("\n--- Entree Menu ---");
        for (int i = 0; i <= 3; i++) {
            System.out.println(i + " - " + itemNames[i] + " : $" + itemPrices[i]);
        }
    }

    public static void displaySideDishMenu() {
        System.out.println("\n--- Side Dish Menu ---");
        for (int i = 4; i <= 7; i++) {
            System.out.println(i + " - " + itemNames[i] + " : $" + itemPrices[i]);
        }
    }


    public static void displayDrinkMenu() {
        System.out.println("\n--- Drink Menu ---");
        for (int i = 8; i <= 11; i++) {
            System.out.println(i + " - " + itemNames[i] + " : $" + itemPrices[i]);
        }
    }


    public static void orderItem(Scanner input, int start, int end) {

        int id, qty;

        System.out.print("Enter item ID: ");
        id = input.nextInt();

        if (id >= start && id <= end) {

            System.out.print("Enter quantity: ");
            qty = input.nextInt();

            quantities[id] += qty;

            System.out.println("Item added successfully!");

        } else {
            System.out.println("Invalid Item ID!");
        }
    }


    public static void printBill() {

        double subtotal;
        double total = 0;

        System.out.println("\n======= Order Summary =======");
        System.out.printf("%-20s %-10s %-10s %-10s\n",
                "Item", "Price", "Qty", "Subtotal");

        for (int i = 0; i < itemNames.length; i++) {

            if (quantities[i] > 0) {

                subtotal = itemPrices[i] * quantities[i];
                total += subtotal;

                System.out.printf("%-20s $%-9.2f %-10d $%-10.2f\n",
                        itemNames[i],
                        itemPrices[i],
                        quantities[i],
                        subtotal);
            }
        }

        System.out.println("--------------------------------------------");
        System.out.printf("Total Amount: $%.2f\n", total);
    }
}