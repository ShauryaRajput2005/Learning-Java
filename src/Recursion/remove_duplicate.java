package Recursion;

public class remove_duplicate {
	
	public static boolean[] map=new boolean[26];
	
	public static void remduplicate(String str,int idx,String newstr) {
		if(idx==str.length()) {
			System.out.print(newstr);
			return ;
		}
		char curchar=str.charAt(idx);
		if(map[curchar-'a']) {
			remduplicate(str,idx+1,newstr);
		}else {
			newstr+=curchar;
			map[curchar-'a']=true;
			remduplicate(str,idx+1,newstr);
		}
		
		
	}
	public static void main(String[] args) {
		String str ="abbccda";
		remduplicate(str,0,"");
	}

}
// time complexity=O(n)