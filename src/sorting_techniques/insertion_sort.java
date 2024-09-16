package sorting_techniques;

public class insertion_sort {
	
	public static void printarr(int[] arr){
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {7,3,8,1,2};
		
		for(int i=1;i<arr.length;i++) {
			int cur=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>cur) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=cur;
		}
		printarr(arr);
	}

}
