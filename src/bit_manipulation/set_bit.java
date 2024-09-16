package bit_manipulation;

public class set_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; //0101
		//setting bit at 2nd pos or at index 1 to convert 5 to 7
		int pos=1;
		int bitmask=1<<pos;
		int num=bitmask|n; //0111=7
		System.out.print(num);
		

	}

}
