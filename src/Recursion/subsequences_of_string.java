package Recursion;

public class subsequences_of_string {
	public static void subsequences(String str,int idx,String newstr) {
		if(idx==str.length()) {
			System.out.println(newstr);
			return;
		}
		char curchar=str.charAt(idx);
		// to be
		subsequences(str,idx+1,newstr+curchar);
		// not to be
		subsequences(str,idx+1,newstr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		subsequences(str,0,"");
	}

}
//time complexity = O(2^(n+1)-1)