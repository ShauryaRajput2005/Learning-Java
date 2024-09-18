package Leetcode;
// this code has high time complexity use of sliding window technique is required
import java.util.*;;

public class permutations_string_checker {
	public static void permutations(String str,String perm,List<String> result) {
		if(str.length()==0) {
			result.add(perm);
		}
		for(int i=0;i<str.length();i++) {
			char curchar=str.charAt(i);
			String newstr=str.substring(0,i)+str.substring(i+1);
			permutations(newstr,perm+curchar,result);
		}
			
	}
	
	public static List<String> gen(String str) {
		List<String> result= new ArrayList<>();
		permutations(str,"",result);
		return result;
	}
	
	public static boolean checker(String s1,String s2,List<String> result) {
		for(int i=0;i<=s2.length()-s1.length();i++) {
			String substring=s2.substring(i,i+s1.length());
			
			for (String check : result) {
				if(check.equals(substring)) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ab", s2 = "eidbaooo";
		 List<String> result = gen(s1);
		
		 boolean flag=checker(s1,s2,result);
		 System.out.print(flag);
		

	}

}
