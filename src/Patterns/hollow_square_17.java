package Patterns;

public class hollow_square_17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int row=1;
		int star=0;
		int space=1;
		while(n>=row) {
			//Star
			int i=n/2;
			while(i>star) {
				System.out.print("* ");
				i--;
			}
			
			// space
			int k=1;
			while(k<=2*space-2) {
				System.out.print("  ");
				k++;
			}
			//Right Side
			i=n/2;
			while(i>star) {
				System.out.print("* ");
				i--;
			}
			
			System.out.println();
			
			if(row<=n/2) {
				star++;
				space++;
			}else {
				star--;
				space--;
			}
			row++;
		}
		
	}

}
/*
* * *  * * *
* *	     * *
* 		   *

* 		   *
* *	     * *
* * *  * * *

*/