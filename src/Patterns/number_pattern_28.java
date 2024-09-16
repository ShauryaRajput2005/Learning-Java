package Patterns;

public class number_pattern_28 {

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
					System.out.print(val + " ");
			        val += (j < row - 1) ? 1 : -1; 
	                j++;
	                }
			     System.out.println(); 
			     row++; 
			}
	}

}
