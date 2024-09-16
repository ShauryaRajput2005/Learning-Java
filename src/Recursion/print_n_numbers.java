package Recursion;

public class print_n_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		prints(n);
		
	}
	public static void prints(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		prints(n-1);
	}

}
