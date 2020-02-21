import java.lang.*;
import java.util.Scanner;

public class Hello {
    public static void hello() {
        String name;
        System.out.println("Enter name:");

        //The input provided by user is stored in name
        Scanner input = new Scanner(System.in);
        name = input.next();
        System.out.println("Hello " + name);

    }

}





