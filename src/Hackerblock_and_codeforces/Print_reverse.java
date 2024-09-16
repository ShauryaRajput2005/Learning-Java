package Hackerblock_and_codeforces;
import java.util.*;

public class Print_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		System.out.print(reverse(n));
		
	}
	public static long reverse(long a) {
		int len=counter(a)-1;
		long num=0;
		long temp=a;
		while(temp>0) {
			long d=temp%10;
			num+=d*Math.pow(10, len);
			len--;
			temp/=10;
		}
		return num;
	}
	public static int counter(long a) {
		long temp=a;
		int counter=0;
		while(temp>0) {
			temp/=10;
			counter++;
		}
		return counter;
	}

}
