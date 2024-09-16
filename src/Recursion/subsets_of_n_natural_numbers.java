package Recursion;
import java.util.*;

public class subsets_of_n_natural_numbers {
	public static void printsub(ArrayList<Integer> subset) {
		for(int i = 0; i < subset.size(); i++) {
			System.out.print(subset.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void subsets(int n, ArrayList<Integer> subset) {
		if (n == 0) {
			printsub(subset);
			return;
		}
		
		// element joins
		subset.add(n);
		subsets(n - 1, subset);
		
		// element not joins
		subset.remove(subset.size() - 1);
		subsets(n - 1, subset);
	}
	
	public static void main(String[] args) {
		int n = 3;
		ArrayList<Integer> subset = new ArrayList<>();
		subsets(n, subset);
	}
}
 