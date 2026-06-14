package q6;
import java.util.Scanner;

class Pets {
    private String name;
    private char type;

    public void settype(char pettype) { type = pettype; }
    public char gettype() { return type; }

    public void setname(String petname) { name = petname; }
    public String getname() { return name; }
}

class Dogs extends Pets {
    private double weight;

    public void setWeight(double w) { weight = w; }
    public double getWeight() { return weight; }
}

class Cats extends Pets {
    private String coatcolor;

    public void setCoatcolor(String c) { coatcolor = c; }
    public String getCoatcolor() { return coatcolor; }
}

public class Q5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pets[] pets = new Pets[100];
        Dogs[] dogs = new Dogs[100];
        Cats[] cats = new Cats[100];

        int petCount = 0;
        int dogCount = 0;
        int catCount = 0;

        while (true) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 0) {
                break;
            }

            switch (choice) {

                case 1: {
                    Cats cat = new Cats();

                    System.out.print("Enter name: ");
                    String name = input.nextLine();

                    System.out.print("Enter coat color: ");
                    String color = input.nextLine();

                    cat.setname(name);
                    cat.settype('C');
                    cat.setCoatcolor(color);

                    cats[catCount++] = cat;
                    pets[petCount++] = cat;

                    break;
                }

                case 2: {
                    Dogs dog = new Dogs();

                    System.out.print("Enter name: ");
                    String name = input.nextLine();

                    System.out.print("Enter weight: ");
                    double weight = input.nextDouble();
                    input.nextLine();

                    dog.setname(name);
                    dog.settype('D');
                    dog.setWeight(weight);

                    dogs[dogCount++] = dog;
                    pets[petCount++] = dog;

                    break;
                }

                case 3: {
                    System.out.print("Enter cat name to remove: ");
                    String name = input.nextLine();

                    for (int i = 0; i < catCount; i++) {
                        if (cats[i].getname().equals(name)) {
                            cats[i] = cats[catCount - 1];
                            cats[catCount - 1] = null;
                            catCount--;
                            break;
                        }
                    }
                    break;
                }

                case 4: {
                    System.out.print("Enter dog name to remove: ");
                    String name = input.nextLine();

                    for (int i = 0; i < dogCount; i++) {
                        if (dogs[i].getname().equals(name)) {
                            dogs[i] = dogs[dogCount - 1];
                            dogs[dogCount - 1] = null;
                            dogCount--;
                            break;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println("\n----- CATS -----");
        for (int i = 0; i < catCount; i++) {
            System.out.println("Name: " + cats[i].getname()
                    + " | Color: " + cats[i].getCoatcolor());
        }

        System.out.println("\n----- DOGS -----");
        for (int i = 0; i < dogCount; i++) {
            System.out.println("Name: " + dogs[i].getname()
                    + " | Weight: " + dogs[i].getWeight());
        }
    }
}