package Recursion;

public class sum_n_numbers {

	public static void printsum(int i,int n,int sum) {
		if(i==n) {
			sum+=n;
			System.out.print(sum);
			return; 
		}
		sum+=i;
		printsum(i+1,n,sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printsum(1,5,0);

	}

}
