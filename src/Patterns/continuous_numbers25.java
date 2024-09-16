package Patterns;

public class continuous_numbers25 {
	

	public static void main(String [] args) {
		int n=5;
		int row=1;
		int num=row;
		while(row<=n) {
			//Spaces
			int space=1;
			while(space<=n-row) {
				System.out.print("   ");
				space++;
			}
			//Numbers
			int i=1;
			while(i<=2*row-1) {
				if(num<=9) {
					System.out.print(" "+num+" ");
				}else {
					System.out.print(num+" ");
				}
				
				num++;
				i++;
			}
		
			row++;
			System.out.println();
		}
	}

}
/*
			1
	     2  3  4
      5  6  7  8  9
   10 11 12 13 14 15 16
17 18 19 20 21 22 23 24 25*/