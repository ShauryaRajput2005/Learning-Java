package Arrays;

public class reverse_array_ranged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,1,7,8,6,9,11,15,17,18,16,23,27};
		reverse(arr);
		for(int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

/*public static void reverse(int[] arr) {
	int i = 0;
	int j = arr.length - 1;
	while(i < j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++;
		j--; 
	}
}*/

public static void reverse(int[] arr) {
	int i = 0;
	
	while(i < arr.length/2) {
		int j = arr.length -i- 1;
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++;
		
		}
	}
}
