/*
 * Arrays-Target Sum Pairs
 * Write a function which prints all pairs of numbers which sum to target.
Input Format

The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.
Constraints

Length of the arrays should be between 1 and 1000.
Output Format

Print all the pairs of numbers which sum to target. Print each pair in increasing order.
Sample Input

5
1
3
4
2
5
5

Sample Output

1 and 4
2 and 3

Explanation

Find any pair of elements in the array which has sum equal to target element and print them.

 */



package Hackerblock_and_codeforces;
import java.util.*;

public class array_target_sum_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int target=scan.nextInt();
		target_sum(arr,target);

	}
	
	public static void target_sum(int[] arr,int target) {
		Arrays.sort(arr);
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+" and "+arr[j]);
				}
			}
		}
	}

}
