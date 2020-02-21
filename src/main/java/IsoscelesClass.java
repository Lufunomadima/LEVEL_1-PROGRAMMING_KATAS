public class IsoscelesClass {
    public void isoscelesTriangle(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++)
                System.out.print(" ");
            for (int j = 0; j < (2 * i - 1); j++)
                System.out.print("#");
            System.out.println();

        }

    }
}
