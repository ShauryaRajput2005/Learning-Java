package Recursion;

public class tower_of_hanoi {
	public static void towerofhanoi(int n,String src,String helper,String dest) {
		if(n==1) {
			System.out.println("Disk"+n+"transferred");
			return;
			}
		towerofhanoi(n-1,src,dest,helper);
		System.out.println("Disk"+n+"transferred");
		towerofhanoi(n-1,helper,src,dest);
	}
	public static void main(String args[] ){
		int n=3;
		towerofhanoi(n,"S","H","D");
	}

}
// Time Complexity : O(2^n-1)