package sorting_techniques;

public class selection_sort {
	
	public static void printarr(int[] arr){
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {7,3,8,1,2};
		
		//Selection Sort
		for(int i=0;i<arr.length-1;i++) {
			int smallest=i;
			for (int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		printarr(arr);
	}

}
