package Recursion;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int ans=factorial(n);
		System.out.print(ans);
	}
	public static int factorial(int n) {
		if(n==1||n==0) {
			return 1;
		}
		int a=factorial(n-1);
		int num=n*a;
		return num;
	}

}
