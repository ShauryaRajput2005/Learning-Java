package Recursion;

public class keypad_combination {
	public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static void printcomb(String str,int idx,String combination) {
		if(idx==str.length()) {
			System.out.println(combination);
			return;
		}
		char curchar=str.charAt(idx);
		String mapping=keypad[curchar-'0'];
		for(int i=0;i<mapping.length();i++) {
			printcomb(str,idx+1,combination+mapping.charAt(i));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="23123";
		printcomb(str,0,"");
	}

}
