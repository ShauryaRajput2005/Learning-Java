package Patterns;

public class number_pattern_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
        int row =1;
        int num=10;
       
        System.out.println("                   "+0);
        while (row<n) {
        	
            // Spaces
            int space = 1;
            while (space <= 2 * (n - row)-1) {
                System.out.print(" ");
                space++;
            }
            
            int i=num-row;
            int count=1;
            while(count<=row) {
            	System.out.print(i+" ");
            	i++;
            	count++;
            }
            i=num-1;
            count=0;
            while(count<row) {
            	if(count==0){
            	System.out.print(0+" ");
            	}
            	System.out.print(i+" ");
            	i--;
            	count++;
            }
            
            System.out.println();
            row++;
        }

	}

}
