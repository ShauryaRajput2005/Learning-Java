package Patterns;

import java.util.*;
public class Inverted_hour_glass{
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
        //Upper Half 
		
		int row=n;
		while(row>=0) {
			
			//Left Numbers
			int i=n;
			while(i>=row) {
				System.out.print(i+" ");
				i--;
			}
			
			//Spaces
			int space=1;
			while(space<=2*row-1) {
				System.out.print("  ");
				space++;
			}
			
			//Right Numbers
			i=row;
			while(i<=n) {
				if(i==0 && row==0) {
					int k=1;
					for(k=1;k<=n;k++)
					System.out.print(k+" ");
					break;
				}
				System.out.print(i+" ");
				i++;
			}
		System.out.println(); 
	    row--; 	
		}
		
		//Lower half 
		
		row=1;
		while(row<=n) {
			//Left Numbers
			int i=n;
			while(i>=row) {
				System.out.print(i+" ");
				i--;
			}
		
			//Space
			int space=1;
			while(space<=2*row-1) {
				System.out.print("  ");
				space++;
			}
			
			// Right Numbers 
			i=row;
			while(i<=n) {
				System.out.print(i+" ");
				i++;
			}
		System.out.println();
		row++;	
		}
	
	
	
	
	
	}
}