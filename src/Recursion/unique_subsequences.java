package Recursion;
import java.util.*;

public class unique_subsequences {
	   public static void subsequences_unique(String str, int idx, String newstr, HashSet<String> set) {
	        if (idx == str.length()) {
	            if (set.contains(newstr)) {
	                return;
	            } else {
	                System.out.println(newstr);
	                set.add(newstr);
	                return;
	            }
	        }

	        char curChar = str.charAt(idx);
	        // to include the current character
	        subsequences_unique(str, idx + 1, newstr + curChar, set);
	        // to exclude the current character
	        subsequences_unique(str, idx + 1, newstr, set);
	    }

	    public static void main(String[] args) {
	        String str = "aaa";
	        HashSet<String> set = new HashSet<>();
	        subsequences_unique(str, 0, "", set);
	    }
	}