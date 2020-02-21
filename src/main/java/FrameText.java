public class FrameText {
    static void frame(String[] words) {

        int maxsize = 0;
        for (String word : words) {
            if (word.length() > maxsize) {
                maxsize = word.length();
            }
        }
        for (int i = 0; i <= maxsize + 1; i++) {
            System.out.print("*");
        }
        System.out.print("*");
        System.out.println();
        for (int j = 0; j < words.length; j++) {
            System.out.print("* " + words[j]);
            for (int i = words[j].length(); i <= maxsize; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.print("*");
        for (int i = 0; i <= maxsize + 1; i++) {
            System.out.print("*");
        }
        System.out.print("*");
        System.out.println();

    }
}
