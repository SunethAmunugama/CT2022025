class Pet {
    private String name;
    public String getName( ) {
        return name;
    }

    public void setName (String petName){
        name = petName;
    }

    public String speak () {
        return "I'm your cuddly little pet.";
    }
}

class Dog extends Pet{

    @Override
    public String speak(){
        return "";
    }

}
class Cat extends Pet{

    @Override
    public String speak(){
        return "";
    }
}

public class Q1 {
}