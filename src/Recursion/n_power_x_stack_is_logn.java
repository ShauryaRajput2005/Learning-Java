package Recursion;

public class n_power_x_stack_is_logn {
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		if(n%2==0) {
			return power(x,n/2)*power(x,n/2);
		}else {
			return power(x,n/2)*power(x,n/2)*2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int x=2,n=5;
		int ans=power(x,n);
		System.out.print(ans);

	}

}
