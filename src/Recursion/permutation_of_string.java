package Recursion;

public class permutation_of_string {
	public static void permutation(String str, String permutation) {
		if(str.length()==0) {
			System.out.println(permutation);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char curchar=str.charAt(i);
			String newstr=str.substring(0,i)+str.substring(i+1);
			permutation(newstr,permutation+curchar);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		permutation(str,"");

	}

}
