/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

*/

package Leetcode;
import java.util.Arrays;

public class Contains_Duplicate {
	// This code fails for large arrays increasing its time complexity 
	/*
	public static void main(String[] args) {
		int arr[] = {1,2,3,5};
		System.out.print(dup(arr));
	}
	public static boolean dup(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		return false;
	}*/
// trying a diifernt approach of sorting the arrays and checking its consecutive elements for duplicates
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,5};
		System.out.print(duplicates(arr));
	}
	
	public static boolean duplicates(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				return true;
			}
		}
		return false;
	}
}



