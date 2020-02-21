public class SquareClass {
    // method to print the required pattern
    static void square(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                System.out.print("#");
            }

            System.out.println();
        }

    }
}
