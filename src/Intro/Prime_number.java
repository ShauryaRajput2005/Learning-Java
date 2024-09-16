package Intro;

public class Prime_number {

    public static void main(String[] args) {
        int n = 9;
        boolean isPrime = true; 

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false; 
                break; 
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        System.out.println(-5%3);
    }
}
