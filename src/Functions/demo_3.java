
package Functions;

public class demo_3 {

    public static void main(String[] args) {
        System.out.println("Hello! World");
        int a = 8;
        int b = 7;
        System.out.println(add(a, b));
        System.out.println("Bye");
    }

    public static int add(int a, int b) {
        int c = a + b;
        sub(c, a);
        return c;
    }

    public static void sub(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }
}
