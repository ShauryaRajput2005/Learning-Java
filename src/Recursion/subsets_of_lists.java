package Recursion;
import java.util.*;

import java.util.List;

public class subsets_of_lists {
	public static void subs(int[] nums, int index,List<Integer> current, List<List<Integer>> result,HashSet<List<Integer>> set) {
		if(nums.length==index) {
			if (!set.contains(current) ) {
                result.add(new ArrayList<>(current));
                set.add(new ArrayList<>(current));
            }
            return;
		}
			// Element joins
			current.add(nums[index]);
			subs(nums,index+1,current,result,set);
			
			//Element not joins
			current.remove(current.size()-1);
			subs(nums,index+1,current,result,set);
		
	}
	
	public static List<List<Integer>> initialiser(int [] nums){
		List<List<Integer>> result=new ArrayList<>();
		HashSet<List<Integer>> set=new HashSet<>();
		subs(nums,0,new ArrayList<>(),result,set);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		List<List<Integer>> result =initialiser(nums);
		
		for (List<Integer> subset : result) {
            System.out.println(subset);
		
	}

}
}
/*
public List<List<Integer>> subsets(int[] nums) {

}
}*/