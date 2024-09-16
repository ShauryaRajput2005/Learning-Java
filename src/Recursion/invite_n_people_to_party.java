package Recursion;

public class invite_n_people_to_party {
	public static int call_guest(int n) {
		if(n<=1) {
			return 1;
		}
		//Single
		int way1=call_guest(n-1);
		//Pairs
		int way2=call_guest(n-1)*call_guest(n-2);
		return way1+way2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.print(call_guest(n));
	}

}
