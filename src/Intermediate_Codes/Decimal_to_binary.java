package Intermediate_Codes;
import java.util.*;

public class Decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		int mul=1;
		while(n>0) {
			int r=n%2;
			sum=sum+r*mul;
			n=n/2;
			mul= mul*10;
		}
		System.out.println(sum);
	}

}
