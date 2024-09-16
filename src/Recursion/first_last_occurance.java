package Recursion;

public class first_last_occurance {
	public static int first=-1;
	public static int last=-1;
	
	public static void findOccur(String str,int indx,char element) {
		if(indx==str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char curchar=str.charAt(indx);
		if(curchar==element) {
			if(first==-1) {
				first=indx;
			}else {
				last=indx;
			}
		}
		findOccur(str,indx+1,element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abaacdefaah";
		findOccur(str,0,'a');
	}

}
