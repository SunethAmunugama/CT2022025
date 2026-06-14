package q4;

import java.util.Scanner;

class Pets{

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

class Dogs extends Pets{
    private double weight;

    public void setWeight(double dog_weight){
        this.weight = dog_weight;
    }
    public double getWeight(){
        return weight;
    }
}
class Cats extends Pets{
    private String coatcolor;
    public void setCoatcolor(String color){
        this.coatcolor = color;
    }
    public String getCoatcolor(){
        return coatcolor;
    }
}

public class Q4 {

    static void main() {
        Scanner input  = new Scanner(System.in);
        Pets[] petsarray = new Pets[100];
        int count = 0;


        while (true){
            System.out.println("Enter the name(enter STOP if want to finish): ");
            String name = input.nextLine();

            if (name.equals("STOP")){
                break;
            }
            System.out.println("Enter the TYPE of pet(c for cat and d for dog): ");
            char type = input.nextLine().charAt(0);

            Pets animal;

            if (type == 'c' || type == 'C'){
                Cats cat = new Cats();

                System.out.println("Enter the coat color: ");
                String coatcolor = input.nextLine();

                cat.setCoatcolor(coatcolor);
                animal = cat;
            }
            if (type == 'd' || type == 'D'){
                Dogs dog = new Dogs();

                System.out.println("Enter the coat weight: ");
                double weight = input.nextDouble();

                dog.setWeight(weight);
                animal = dog;
            }

            animal.setname(name);
            animal.settype(type);
            petsarray[count] = animal;
            count++;
        }

        System.out.println("---------Pets list-----------");
        for(int i = 0; i < count; i++ ){
            Cats cat  = (Cats) petsarray[i];

            if (petsarray[i] instanceof Cats){
                System.out.println("Dog Name : " + cat.getname() + "   Type :" + cat.gettype()  +  "   Coatcolor :" + cat.getCoatcolor());
            }


        }
        for(int i = 0; i < count; i++ ){
            Dogs dog  = (Dogs) petsarray[i];

            if (petsarray[i] instanceof Dogs){
                System.out.println("Dog Name : " + dog.getname() + "   Type :" + dog.gettype()  +  "   Wight :" + dog.getWeight());
            }


        }
    }
}