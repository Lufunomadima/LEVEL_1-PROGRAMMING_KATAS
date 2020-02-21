import java.util.ArrayList;
import java.util.Scanner;

public class LongestString {
    public static String getLongestString() {

        System.out.println("Enter input:");

        ArrayList<String> listNames = new ArrayList<String>();
        //The input provided by user is stored in n
        Scanner sca = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter any word");
            String name = sca.nextLine();
            listNames.add(name);
        }
        int maxLength = 0;
        String longestString = null;
        for (String s : listNames) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }
}
