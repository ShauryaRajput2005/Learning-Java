package Intermediate_Codes;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		int mul=1;
	
		while(n>0) {
			int num=n%10;
			sum=sum+num*mul;
			n=n/10;         //  destination base is used for division
			mul=mul*2;      // source base is used to multiply
		}
		System.out.println(sum);
	}
}
 