package Hackerblock_and_codeforces;
import java.util.*;

public class Hollow_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int row=1;
		
		while(n>=row) {
			//space
			int space = 1;
			while(space<=n-row) {
				System.out.print(" ");
				space++;
			}
			
			
			//star
			int i=1;
			while(i<=n) {
				if(i==n || row==n || row==1 || i==1 ) {
					System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			i++;
			}	
		System.out.println();
		row++;
		}
	}

}