package bit_manipulation;

public class clear_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; //0101
		// converting 5 to 1 by clearing the 3rd bit 
		int i=2;
		int bitmask=1<<i;
		int bit=~bitmask;
		int num=bit&n;
		System.out.print(num);

	}

}
