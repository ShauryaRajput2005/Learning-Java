package Hackerblock_and_codeforces;
import java.util.*;
public class boston_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n =scan.nextInt(); 
        int check = check_boston(n);
        System.out.print(check);
    }
	public static int check_boston(int n) {
		int[] arr=primes(n);
		int arrsum=arrsum(arr);
		int digisum=digisum(n);
		if(arrsum==digisum) {
			return 1;
		}
	return 0;
	}
	public static int[] primes(int n) {
		int[] factors= new int[15];
		int temp=n;
		int counter=0;
		for(int i=2;i<=Math.sqrt(temp);i++) {
			while(temp%i==0) {
				factors[counter]=i;
				temp/=i;
				counter++;
			}
		}
		if (temp>1) {
			factors[counter]=temp;
			counter++;
		}
		return factors;
	}
	public static int digisum(int n) {
		int temp=n;
		int sum=0;
		while(temp>0) {
			int d=temp%10;
			sum+=d;
			temp/=10;
		}
	return sum;
	}
	public static int arrsum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=9) {
			sum+=arr[i];
		}else {
			sum+=digisum(arr[i]);
		}
		
		}
		return sum;
	}
	
	

}
