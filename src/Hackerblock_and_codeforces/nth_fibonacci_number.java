package Hackerblock_and_codeforces;
import java.util.*;

public class nth_fibonacci_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int a=0;
		int b=1;
		int c=0;
		while(n-1>0) {
			c=a+b;
			a=b;
			b=c;
			n--;
		}
		System.out.print(c);
	}

}
