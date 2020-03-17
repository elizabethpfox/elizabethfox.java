import java.util.Scanner; // hi world 

public class Hello {
    public static void main(String args[]) {
        System.out.print("Hello. What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("It's nice to meet you, " + name + ". How old are you?");
        String name1 = scan.next();
        System.out.println("I see that you are still quite young at only " + name1 + ".");
        System.out.println("Where do you live?");
        String name2 = scan.next();
        System.out.println("Wow! I've always wanted to go to " + name2 + ". Thanks for chatting with me. Bye!");
        //cannot call each string the same name
    }
}
