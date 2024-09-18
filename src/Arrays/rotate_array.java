/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/


// this is a perodic functions so repeats itself after 7,14,21,28,35 etc..
// to tackle this we take mod form array length
/*
package Arrays;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int k=3;
		rotate(arr,k);
		
	}
	
	public static void rotate(int[] arr,int k) {
		int n=arr.length;
		k=k%n;
		int item=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=item;
		k--;
	}
	

}

//This method has very high time complexity first it runs for k times and  inn each run for k it runs n times 
 // which adds up to
 // time complexity : O(k*n)

*/
//To manage the time complexity we use reversing approach to tackle the question
 // this is called reversal algorithm 

package Arrays;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int k=3;
		Rotate(arr,k);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			}
		}
	
	public static void Rotate(int[] arr ,int k) {
		int n=arr.length;
		k=k%n;
		/*
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);*/
		
		// starting n-k 
		reverse(arr,0,n-k-1);
		//last k elements
		reverse(arr,n-k,n-1);
		//all elements reverse
		reverse(arr,0,n-1);
		
	}
	
	
	public static void reverse(int[] arr,int start,int end) {
		int i=0;
		
		while(start<end) {
			int temp=arr[start];
			arr[start]= arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
