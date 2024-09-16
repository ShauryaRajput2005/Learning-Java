/*
 * Example 1:

Input: nums = [2,2,1]
Output: 1

Example 2:

Input: nums = [4,1,2,1,2]
Output: 4

Example 3:

Input: nums = [1]
Output: 1
*/

package Leetcode;
import java.util.*;

public class single_number {

	public static void main(String[] args) {
		int[] nums = {2,2,1};
		int result = 0;
        for (int number : nums) {
            result ^= number; 
        }
        System.out.print(result);; 
        
    }
}