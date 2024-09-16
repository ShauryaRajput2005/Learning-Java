package Patterns;

public class q2_and_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2.
		/*
		int n=5;
		int row=1;
		
		while(n>=row) {
			int i=1;
			while(i<=row) {
				System.out.print("* ");
				i++;
			}
		System.out.println();
		row++;
		
		}
		*/
		// Mirror
		//3.
		
		int n=5;
		int row=1;
		while(row<=n) {
			int j=5;
			while(j>=row) {
				System.out.print("* ");
				j--;
			}
			System.out.println();
			row++;
			
		}

	}

}
