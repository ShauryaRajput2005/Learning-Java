package Hackerblock_and_codeforces;
import java.util.*;
public class print_armstrong_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		print_armstrong(n,m);
	}
	public static void print_armstrong(int a,int b) {
		boolean flag=true;
		for(int i=a;i<b;i++) {
			if(armstrong_check(i)) {
				System.out.println(i);
				flag=true;
			}
			
		}
		if(!flag){
			System.out.print(0);
		}
	}
	public static boolean armstrong_check(int n) {
		int count=counter(n);
		int temp=n;
		int num=0;
		while(temp>0) {
			int a=temp%10;
			num+=Math.pow(a, count);
			temp/=10;
		}
		if(num==n) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int counter(int n) {
		int temp=n;
		int count=0;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		return count;
	}

}
