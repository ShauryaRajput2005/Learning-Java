package Recursion;

public class is_array_sorted {
	public static boolean isSorted(int arr[],int indx) {
		if(indx==arr.length-1) {
			return true;			
		}
		if(arr[indx]>=arr[indx+1]) {
			return false;
		}
		return isSorted(arr,indx+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		System.out.print(isSorted(arr,0));

	}

}
// time complexity =O(n)   n-array length