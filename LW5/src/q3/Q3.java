package q3;

import java.util.Scanner;

class Petss{

    private String name;
    private char type;

    public void settype(char pettype){
        type = pettype;
    }
    public char gettype(){
        return type;
    }
    public void setname(String petname){
        name = petname;
    }
    public String getname(){
        return name;
    }

}

class Dogss extends Petss{

}
class Catss extends Petss{

}

public class Q3 {

    static void main() {
        Scanner input  = new Scanner(System.in);
        Petss[] petsarray = new Petss[100];
        int count = 0;


        while (true){
            System.out.println("Enter the name(enter STOP if want to finish): ");
            String name = input.nextLine();

            if (name.equals("STOP")){
                break;
            }
            System.out.println("Enter the TYPE of pet(c for cat and d for dog): ");
            char type = input.nextLine().charAt(0);

            Petss animal;
            if (type == 'D' || type == 'd'){
                animal = new Dogss();
            }
            else{
                animal = new Catss();
            }

            animal.setname(name);
            animal.settype(type);
            petsarray[count] = animal;
            count++;
        }

        System.out.println("---------Pets list-----------\t");
        System.out.println("---------Cats list-----------");
        for(int i = 0; i < count; i++ ){
            Petss animal  = petsarray[i];

            if (animal.gettype() == 'C' || animal.gettype() == 'c'){
                System.out.println("Cat Name : " + animal.getname() + "   Type :" + animal.gettype());
            }

        }
        System.out.println("\t\t---------Dogs list-----------");
        for(int i = 0; i < count; i++ ){
            Petss animal  = petsarray[i];

            if (animal.gettype() == 'D' || animal.gettype() == 'd'){
                System.out.println("Dog Name : " + animal.getname() + "   Type :" + animal.gettype());
            }

        }
    }
}