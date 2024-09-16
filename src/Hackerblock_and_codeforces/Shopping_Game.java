package Hackerblock_and_codeforces;
import java.util.*;

public class Shopping_Game {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++) {
			int m=scan.nextInt();
			int n=scan.nextInt();
			
			int a=0;
			int h=0;
			int turn=1;
			while(true) {
				if(turn%2==0) {
					if(a+turn>m) {
						System.out.println("Harshit");
						break;					
					}
					a+=turn;
				}else {
					if(h+turn>n) {
						System.out.println("Aayush");
						break;					
					}
					h+=turn;
				}
				turn++;
			}
		}
	}
}