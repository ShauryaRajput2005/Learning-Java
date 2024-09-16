package Hackerblock_and_codeforces;
import java.util.*;

public class Armstrong_number {
	
	 public static void main(String args[]) {
	        Scanner scan=new Scanner(System.in);
	        int n=scan.nextInt();
	        System.out.println(armstrong(n));
	    }
	 
	 public static int count(int n) {
	 		int count=0;
	 		int temp=n;
	 		while(temp>0) {
	 			temp=temp/10;
	 			count++;	 					
	 		}
	 		return count;
	 	}
	 
	    public static boolean armstrong(int n){
	    	int c=count(n);
	        int temp=n;
	        int sum=0;
	        while(temp>0){
	            int a=temp%10;
	            sum+=Math.pow(a,c);
	            temp=temp/10; 
	        }
	        if(sum==n) {
	        	return true;
	        }
	        else {
	        	return false;
	       }
	  }
}