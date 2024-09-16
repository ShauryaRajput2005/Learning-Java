package Hackerblock_and_codeforces;
import java.util.*;

public class replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long temp=n;
		long  num=0; 
		int count=0;
        if(n==0){
            System.out.print(5);
        }else{
                
            while(temp>0) {
                long a=temp%10;
                if(a==0) {
                    num+=5*Math.pow(10, count);
                }
                else {
                    num+=a*Math.pow(10, count);
                }
                count++;
                temp=(long) temp/10;
            
            }
            System.out.print(num);
        }
	}

}
