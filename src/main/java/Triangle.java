
public class Triangle {

public void triangle(int n) {
    int i, j;


    for (i = 1; i <= n; i++) {
        for (j = 1; j <= i; j++)
            System.out.print("#");
        System.out.println("");
    }
}
}