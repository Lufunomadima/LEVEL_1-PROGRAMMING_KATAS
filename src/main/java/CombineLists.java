import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombineLists {
    public static void combineTwoLists() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many integers you want to put on both list?: ");
        int number = input.nextInt();
        Integer[] listOne = new Integer[number];
        Integer[] listTwo = new Integer[number];
        System.out.println("Now enter the " + number + " integers for list one:");
        for (int i = 0; i < number; i++) {
            listOne[i] = input.nextInt();
        }
        System.out.println("Now enter the " + number + " integers for list two:");
        for (int i = 0; i < number; i++) {
            listTwo[i] = input.nextInt();
        }
        System.out.println(combine(listOne, listTwo));
    }

    static List<Integer> combine(Integer[] firstList, Integer[] secondList) {
        List<Integer> Group = new ArrayList<>();
        for (int i = 0; i < firstList.length; i++) {
            Group.add(firstList[i]);
            Group.add(secondList[i]);
        }
        return Group;
    }


    }

