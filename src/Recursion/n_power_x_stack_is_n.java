package Recursion;
// here stack height in memory is n

public class n_power_x_stack_is_n {
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		int num=power(x,n-1);
		int a=num*x;
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2, n=5;
		int ans=power(x,n);
		System.out.println(ans);
	}

}
