import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int program;


        System.out.println(
                "1 for Hello.\n" +
                "2 for Odd or Even.\n" +
                "3 for Square.\n" +
                "4 for Triangle.\n" +
                "5 for Isosceles.\n" +
                "6 for Longest String.\n" +
                "7 for Multiple Strings.\n" +
                "8 for Array Combination.\n" +
                "9 for Framed Text.\n" +
                        "      \n" +
                        "Choose a method to execute: ");

        //The input provided by user is stored in n
        Scanner sc = new Scanner(System.in);
        program = sc.nextInt();


        switch (program) {
            case 1:
                Hello hi = new Hello();
                hi.hello();
                break;
            case 2:
                EvenOdd even = new EvenOdd();
                even.evenOrOdd();
                break;
            case 3:
                SquareClass squ = new SquareClass();
                int num;
                System.out.println("Enter a number:");

                //The input provided by user is stored in n
                Scanner input = new Scanner(System.in);
                num = input.nextInt();
                squ.square(num);
                break;
            case 4:
                Triangle tri = new Triangle();
                int n;
                System.out.println("Enter a number : ");
                Scanner in = new Scanner(System.in);
                n = in.nextInt();


                tri.triangle(n);
                break;
            case 5:
                IsoscelesClass iso = new IsoscelesClass();
                System.out.println("Enter a number:");
                int N;
                //The input provided by user is stored in n
                Scanner sr = new Scanner(System.in);
                N = sr.nextInt();
                iso.isoscelesTriangle(N);
                break;
            case 6:
                LongestString longS = new LongestString();
                System.out.println("Longest string = "+ longS.getLongestString());
                break;
            case 7:
                MultipleStringC.MultipleStrings();
                break;
            case 8:
                CombineLists.combineTwoLists();
                break;
            case 9:
                Scanner sca = new Scanner(System.in);
                int size = 0;
                System.out.println("How many words you want to enter?: ");
                size = Integer.parseInt(sca.nextLine());
                String[] inputs = new String[size];
                System.out.println("Now enter "+ size +" Words");
                for (int i = 0; i < size; i++) {
                    inputs[i] = sca.nextLine();
                }
                System.out.print("*");
                FrameText.frame(inputs);
                sca.close();
                break;
            default:
                System.out.println("Select a method from 1 -9");
        }
    }
}