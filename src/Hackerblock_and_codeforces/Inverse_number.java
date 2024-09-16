package Hackerblock_and_codeforces;
import java.util.Scanner;
import java.lang.Math;

public class Inverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		
		int row=1;
		int val=1;
		int num=0;
		while(n>0) {
			int a=n%10;
			num+=val*(Math.pow(10,a-1));
			n=n/10;
			val++;			
		}
		System.out.print(num);

	}

}
