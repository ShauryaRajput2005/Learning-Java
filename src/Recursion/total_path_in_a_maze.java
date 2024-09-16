package Recursion;

public class total_path_in_a_maze {
	public static int paths(int i,int j,int n,int m) {
		if(i==n|j==m) {
			return 0;
		}
		if(i==(n-1) || j==(m-1) ) {
			return 1;
			
		}
		//Down
		int downpath=paths(i+1,j,n,m);
		//Right
		int rightpath=paths(i,j+1,n,m);
		
		return rightpath+downpath;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int n=3,m=2;
		int totalpaths=paths(0,0,n,m);
		System.out.print(totalpaths);
	}

}
