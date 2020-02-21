import java.util.ArrayList;
import java.util.Scanner;

public class MultipleStringC {
    public static void MultipleStrings() {

        System.out.println("Enter input:");

        ArrayList<String> listNames = new ArrayList<String>();
        //The input provided by user is stored in n
        Scanner sca = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter any word");
            String name = sca.nextLine();
            listNames.add(name);
        }
        String LongestWord = listNames.get(0);

        for (int i = 0; i < listNames.size(); i++) {

            if (LongestWord.length() < listNames.get(i).length()) {
                LongestWord = listNames.get(i);
            }
        }

        for (int i = 0; i < listNames.size(); i++) {

            if (LongestWord.length() == listNames.get(i).length()) {
                System.out.println(listNames.get(i));
            }
        }


    }

}
