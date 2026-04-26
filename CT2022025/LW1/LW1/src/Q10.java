import java.util.Scanner;

public class Q10 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Word:");
        String Word= scanner.nextLine();

        int count= Word.length();

        if (count %2 == 0){
            System.out.println("This is Even number word");
        } else {
            int middle = count/2;
            char middlechar = Word.charAt(middle);

            System.out.println("Middle Letter is "+middlechar);

        }
    }
}
