package Recursion;
import java.util.*;

public class permutations_of_list {
	 public static void permutations(int[] nums, List<Integer> current, List<List<Integer>> result) {
	        if (nums.length == 0) {
	            result.add(new ArrayList<>(current));
	            return;
	        }

	        for (int i = 0; i < nums.length; i++) {
	            int cur = nums[i];
	            int[] arr = new int[nums.length - 1];
	            int k = 0;
	            for (int j = 0; j < nums.length; j++) {
	                if (j != i) {
	                    arr[k++] = nums[j];
	                }
	            }
	            current.add(cur);
	            permutations(arr, current, result);
	            current.remove(current.size() - 1);
	        }
	    }

	    public static List<List<Integer>> generatePerm(int[] nums) {
	        List<List<Integer>> result = new ArrayList<>();
	        permutations(nums, new ArrayList<>(), result);
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3};
	        List<List<Integer>> result = generatePerm(nums);

	        for (List<Integer> perm : result) {
	            System.out.println(perm);
	        }
	    }
	}