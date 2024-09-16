package bit_manipulation;

public class get_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//Assuming we want  3rd bit from here
		int i=2;
		int bitmask=1<<i;
		if((bitmask & n)==0) {
			System.out.print("0");
		}
		else {
			System.out.print("1");
		}
	}

}
