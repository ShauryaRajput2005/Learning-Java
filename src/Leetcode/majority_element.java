/*
 Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 
 */

package Leetcode;
import java.util.*;

// this uses moorey voting algorithm
public class majority_element {


	    public static void main(String[] args) {
	        // Test array
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scan.nextInt();
	        }
	        System.out.print(moorey_voting(arr));
	    }

	    public static int moorey_voting(int[] arr) {
	        int e = arr[0];  
	        int v = 1;  
	        for (int i = 1; i < arr.length; i++) { 
	            if (arr[i] == e) {
	                v++;
	            } else {
	                v--;
	                if (v == 0) {
	                    e = arr[i]; 
	                    v = 1;
	                }
	            }
	        }

	        return e;
	    }
	}
