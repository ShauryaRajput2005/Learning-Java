package Patterns;

public class number_pattern_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int row=1;
		int num=1;
		
		// Upper half
		while(row<=2*n-1) {
			int i=1;
			while(i<=2*num-1) {
				if(i%2==0) {
					System.out.print("* ");
				}
				else {
				System.out.print(row+" ");
				}
				i++;
			}
		System.out.println();
		row++;
		if(row<=n) {
			num++;
		}else {
			num--;
		}
		}

	}

}
