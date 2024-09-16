/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1 */

package Hackerblock_and_codeforces;

import java.util.*;

public class pascal_triangle {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        /*
        int row = 1;
        while (row <= n) { 
            int val = 1;
            int col = 1;
            
            while (col <= row) {
                if (col == 1 || col == row) {
                    System.out.print(1 + " ");
                } else {
                    val = (row - col + 1) * val / (col -1);
                    System.out.print(val + " ");
                }
                col++;
            }    
            
            System.out.println();
            row++;
        }*/
        
        // Alternate Solution
        int row = 0;
        while (row < n) {
            int i = 0;
            int ncr = 1;
            while (i <= row) {
                System.out.print(ncr + " ");
                ncr = (ncr * (row - i)) / (i + 1);
                i++;
            }
            System.out.println();
            row++;
        }
        
    }
}