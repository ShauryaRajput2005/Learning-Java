package Intro;

public class Loops {

    public static void main(String[] args) {
        int n = 5;
        int i = 1;

        while (i <= n) {
            System.out.println(i);
            i++;
        }

        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }

        int a = 9;
        int x = a++ - ++a - 7 + --a + a--;
        System.out.println("\nResult: " + x);
    }
}
