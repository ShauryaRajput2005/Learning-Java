package Hackerblock_and_codeforces;
/*
 * 

Sort just 0 and 1
Input Format

A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space
Constraints

N will not exceed 10^7
Output Format

Sorted Sequence
Sample Input

7
1 0 0 1 1 0 1

Sample Output

0 0 0 1 1 1 1


 */


import java.util.*;
public class Sort_zeros_ones {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int c = 0;
	        
	        for (int i = 0; i < n; i++) {
	            int x = scan.nextInt();
	            if (x == 0) {
	                c++;
	            }
	        }
	        
	        SortZeroOnes(n, c);
	        scan.close();
	    }

	    public static void SortZeroOnes(int n, int c) {
	        for (int i = 0; i < c; i++) {
	            System.out.print(0 + " ");
	        }
	        for (int i = 0; i < n - c; i++) {
	            System.out.print(1 + " ");
	        }
	    }
	}
