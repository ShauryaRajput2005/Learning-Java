package Arrays;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,1,7,9,8};
		int item=4;
		System.out.print(search(arr,item));
		
	}
	public static int search(int[] arr ,int item) {
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==item) {
				return i;
			}
		}
		return -1;
	}
}
