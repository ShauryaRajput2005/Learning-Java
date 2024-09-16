package Patterns;

public class number_pattern_29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int n = 5; // Number of rows
	        int row = 1;

			while (row <= n) {
				// Print spaces
				int k = 0;
				while (k < n - row) {
					System.out.print("  ");
			        k++;
				}
				// Print numbers
				int j = 0, val = row; 
				while (j < 2 * row - 1) {
					if(j==0 || j==2*row-2) {
						System.out.print(val + " ");
					}else {
						System.out.print(0+" ");
					}
			        val += (j < row - 1) ? 1 : -1; 
	                j++;
	                }
			     System.out.println(); 
			     row++; 
			}
	}

}



