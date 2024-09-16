package Arrays;
import java.util.*;
public class array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array is class and hence formed in heap memory of system
		/*
		int[] arr=new int[5];
		System.out.println(arr);
		int[] other=arr;
		System.out.println(other.length);
		arr[0]=5;
		arr[1]=10;
		arr[2]=15;
		arr[3]=20;
		arr[4]=25;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);*/
		
		// user input array

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr1=new int[n];
		
		for(int i=0;i<n;i++) {
			arr1[i]=scan.nextInt();
		}
		
		Display(arr1);
	
	}
	public static void Display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

}
