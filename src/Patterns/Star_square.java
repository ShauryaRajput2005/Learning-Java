package Patterns;

public class Star_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int row=1;
		
		while(n>=row) {
			int i=1;
			while(i<=n) {
				System.out.print("* ");
				i++;
			}
		System.out.println();
		row++;
		}
	}

}
