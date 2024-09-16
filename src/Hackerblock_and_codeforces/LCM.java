package Hackerblock_and_codeforces;
import java.util.*;
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.print(lcm(a,b));

	}
	public static int lcm(int a,int b) {
		
		int gcd=gcd(a,b);
		int lcm=(a*b)/gcd;
		return lcm;
	}
	public static int gcd(int a,int b) {
		while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
