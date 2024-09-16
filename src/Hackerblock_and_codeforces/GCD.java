package Hackerblock_and_codeforces;
import java.util.*;


public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		
		int small=Math.min(n1, n2);
		int i=small/2;
		
		while(n1%i!=0 && n2%i!=0) {
			i--;
		}
		System.out.print(i);
	}

}
 