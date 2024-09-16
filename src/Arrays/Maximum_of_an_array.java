package Arrays;

public class Maximum_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,1,7,9,8,11};
		System.out.print(maximum(arr));
		
	}
	/*public static int maximum(int[] arr ) {
		int max=arr[0];
		for (int i=0;i<arr.length;i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		
		}
		return max;
	}*/
	public static int maximum(int[] arr ) {
	int max=arr[0];
	for (int i=0;i<arr.length;i++) {
		max=Math.max(max, arr[i]);
	}
	return max;
	}
}