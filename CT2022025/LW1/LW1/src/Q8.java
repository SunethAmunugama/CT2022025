import java.util.Scanner;

public class Q8 {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Words With Exclamation mark: ");
        String word = scanner.nextLine();

        int index= word.indexOf('!');

        if (index == -1){
            System.out.println("No Exclamation mark.");
        }else{
            String before= word.substring(0,index).trim();
            String after= word.substring(index+1).trim();

            System.out.println(before);
            System.out.println(after);
        }
    }
}