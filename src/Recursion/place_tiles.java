package Recursion;

public class place_tiles {
	
	public static int tiles(int n,int m) {
		if(n==m) {
			return 2;
		}
		if(n<m) {
			return 1;
		}
		// Vertically Placed
		int vertical=tiles(n-m,m);
		//Horizontally
		int  horizontal=tiles(n-1,m);
		return vertical+horizontal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4, m=2;
		System.out.print(tiles(n,m));

	}

}
