/*
 rite a function which prints all triplets of numbers which sum to target.
Input Format

First line contains input N.
Next line contains N space separated integers denoting the elements of the array.
The third line contains a single integer T denoting the target element.
Constraints

Length of Array should be between 1 and 1000.
Output Format

Print all the triplet present in the array in a new line each. The triplets must be printed as A, B and C where A,B and C are the elements of the triplet ( A<=B<=C) and all triplets must be printed in sorted order. Print only unique triplets.
Sample Input

9
5 7 9 1 2 4 6 8 3
10

Sample Output

1, 2 and 7
1, 3 and 6
1, 4 and 5
2, 3 and 5

Explanation

Array = {5, 7, 9, 1, 2, 4, 6 ,8 ,3}. Target number = 10. Find any three number in the given array which sum to target number.

 */


package Hackerblock_and_codeforces;

import java.util.*;

public class Array_target_sum_triplets {

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
	public static void target_sum(int[] arr,int target){
		int n=arr.length;
		Arrays.sort(arr);
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=n-1;k>j;k--) {
					if(arr[i]+arr[j]+arr[k]==target) {
						System.out.println(arr[i]+", "+arr[j]+" and "+ arr[k]);
					}
				}
			}
		}
	}
}
