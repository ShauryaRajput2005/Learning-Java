package bit_manipulation;
import java.util.*;

public class update_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// update bit is combination of clear bit and set bit 
		int operation=sc.nextInt();
		int pos=sc.nextInt();
		int bitmask=1<<pos;
		int num=0;
		if(operation==1) {
			num=bitmask|n;
			
		}else {
			bitmask=~bitmask;
			num=bitmask&n;
			
		}
		System.out.print(num);
	}

}
