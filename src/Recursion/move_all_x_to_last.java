package Recursion;

public class move_all_x_to_last {
	public static void moveAllx(String str,int idx, int count,String newstr) {
		if(idx==str.length()) {
			for(int i=0;i<count;i++) {
				newstr+="x";
			}
			System.out.print(newstr);
			return;
		}
		char curchar=str.charAt(idx);
		if(curchar=='x') {
			count++;
			moveAllx(str,idx+1,count,newstr);
		}else {
			newstr+=curchar;
			moveAllx(str,idx+1,count,newstr);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="axbcxxd";
		moveAllx(str,0,0,"");
	}

}
// time complexity=O(n)