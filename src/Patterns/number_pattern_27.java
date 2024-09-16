package Patterns;

public class number_pattern_27 {

	public static void main(String [] args) {
		int n = 5;
        int row = 1;

        while (row <= n) {
            // SPACES
            int space = 1;
            while (space <= n - row) {
                System.out.print("  ");
                space++;
            }

            // NUMBERS (Left)
            int j = 1;
            while (j <= row) {
                System.out.print(j + " ");
                j++;
            }

            // NUMBERS (Right)
            j = row - 1;
            while (j >= 1) {
                System.out.print(j + " ");
                j--;
            }

            System.out.println();
            row++;
        } 
/*int n = 5; // Number of rows
	        int row = 1;

			while (row <= n) {
				// Print spaces
				int k = 0;
				while (k < n - row) {
					System.out.print("  ");
			        k++;
				}
				// Print numbers
				int j = 0, val = 1; 
				while (j < 2 * row - 1) {
					System.out.print(val + " ");
			        val += (j < row - 1) ? 1 : -1; 
	                j++;
	                }
			     System.out.println(); 
			     row++; 
			}*/
	}

}