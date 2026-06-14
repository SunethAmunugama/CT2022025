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

}
class Cats extends Pets{

}

public class Q2 {

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
            if (type == 'D' || type == 'd'){
                animal = new Dogs();
            }
            else{
                animal = new Cats();
            }

            animal.setname(name);
            animal.settype(type);
            petsarray[count] = animal;
            count++;
        }

        System.out.println("---------Pets list-----------");
        for(int i = 0; i < count; i++ ){
            Pets animal  = petsarray[i];

            if (animal.gettype() == 'D' || animal.gettype() == 'd'){
                System.out.println("Dog Name : " + animal.getname() + "   Type :" + animal.gettype());
            }
            else{
                System.out.println("Cat Name : " + animal.getname() + "   Type :" + animal.gettype());
            }
        }
    }
}