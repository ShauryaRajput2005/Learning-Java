package Patterns;

public class hollow_kite_20 {

    public static void main(String[] args) {
        int n = 7; // Height of the kite
        int row = 1;
        int star = 0;
        int space = 0;

        while (n >= row) {
            // Print stars on the left side
            int i = n / 2;
            while (i >= star) {
                if (i == star) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                i--;
            }

            // Print spaces in the middle
            int k = 0;
            while (k <= 2 * space - 2) {
                System.out.print("  ");
                k++;
            }

            // Print stars on the right side
            i = n / 2;
            while (i >= star) {
                if (i == n/2) {
                	if(i==n/2&& space==0) {
                		break;
                	}
                	System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                i--;
            }

            System.out.println();

            // Adjust stars and spaces for next row
            if (row <= n / 2) {
                star++;
                space++;
            } else {
                star--;
                space--;
            }

            row++;
        }
    }
}
