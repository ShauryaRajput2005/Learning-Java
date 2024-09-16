package Patterns;

public class Patterns {
	// 1  2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 18 21

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		/*
			int row = 1;
			int n = 5;
			
			while (row <= n) {
			    int j = 1;
			    while (j <= n) {
			        System.out.print("* ");
			        j++;
			    }
			    System.out.println();
			    row++;
			}

	

	// 2.
		
		int row=1;
		int n=5;
		while(row<=n) {
			int j=1;
			while(j<=row) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			row++;
		}
		

	// 3.
		int n=5;
		int row=1;
		
		while(row<=5) {
			int j=5;
			while(j>=row) {
				System.out.print("* ");
				j--;
			}
			System.out.println();
			row++;
		}
	
	
	// 4.
	 
		int n=5;
		int row=1;
		
		while(row<=n) {
			int j=1;
			
			while(j<=n-row) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=row) {
				System.out.print("* ");

				k++;
			}
		System.out.println();
		row++;
		}	
	
	
	// 5.
		
		int row=1;
		int n=5;
		
		while (row<=n) {
			int k=1;
			while(k<row){
				System.out.print("  ");
				k++;
			}					
			
			int j=1;
			while(j<=n-row+1) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			row++;
		}
	
	// 6 .
		
		int i=1;
		int n=5;
		
		while (i<=n) {
			int k=1;
			while(k<i){
				System.out.print("  ");
				k++;
			}					
			
			int j=1;
			while(j<=n-i+1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	// 7.
		
		int n=5;
		int i=1;
		
		while(i<=n) {
			int j=1;
			
			while(j<=n) {
				if(i==1 || i==n || j==1 || j==n ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
	/*
	// 8.
		
		int n = 5;

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (i == j || (n - i) == (n - j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
		}
		
	// 9.
		int row=1;
		int n=5;
		
		while(row<=n) {
			int j=1;
			
			while(j<n-row+1) {
				System.out.print("  ");
				j++;
			}
			
			int k = 1;
			
			while(k<=2*row-1) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			row++;
		}
		
	
	// 10 .
		int row=1;
		int n=5;
		
		while(row<=n) {
			int j=1;
			
			while(j<row) {
				System.out.print(" ");
				j++;
			}
			
			int k = 1;
			
			while(k<=2*(n-row)+1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			row++;
		}
		
		
	// 11.
		
		int row=1;
		int n=5;
		
		while(row<=n) {
			int j=1;
			
			while(j<n-row+1) {
				System.out.print("  ");
				j++;
			}
			
			int k = 1;
			
			while(k<=row) {
				System.out.print(" * ");
				k++;
			}
			System.out.println();
			row++;
		}
	
	// 12.
		
		int row=1;
		int n=5;
		
		while(row<=n) {
			int j=1;
			
			while(j<n-row+1) {
				System.out.print("  ");
				j++;
			}
			
			int k = 1;
			
			while(k<=2*row-1) {
				if (k%2==0) {
					System.out.print("! ");
				}
				else {
					System.out.print("* ");
				}
				k++;
			}
			System.out.println();
			row++;
		}
		
		
	
		
	//13.
		int n = 5;
		
		int r=1;
		while (r<=n){
			int c=1;
			while(c<=r) {
				System.out.print("* ");
				c++;
			}
			System.out.println();
			r++;
		}
		
		r=n-1;
		while (r>=1){
			int c=1;
			while(c<=r) {
				System.out.print("* ");
				c++;
			}
			System.out.println();
			r--;
		
		}

		// 13. Optimised code  
		
		int n=5;
		int star=1;
		int row=1;
		
		while (row<=2*n-1) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//mirror
			if (row<n) {
				star++;
			}
			else {
				star--;
			}
			
			//next row
			System.out.println();
			row++;
			
		}
		
		
	// 14.
		
		int n=5;
		int row=1;
		
		while(row<=n) {
			int space=1;
			
			while(space<=n-row) {
				System.out.print(" ");
				space++;
			}
			
			int col=1;
			
			while(col<=row) {
				System.out.print("*");
				col++;
			}
		System.out.println();	
		row++;
		}
		
		row=n-1;
		
		while (row>=1) {
			int space=1;
			
			while(space<=n-row) {
				System.out.print(" ");
				space++;
			}
			
			int col=1;
			while(col<=row) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row--;
		}
		
		// 14. Optimised code  
		
		int n=5;
		int star=1;
		int row=1;
		int space=1;
		
		while (row<=2*n-1) {
			//space
			int j=1;
				if (j<n) {
					while(j<n-row+1) {
						System.out.print("  ");
						j++;
				}
				else {
					while(j>1)
					j--;
				}
			}
			//star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//mirror
			if (row<n) {
				star++;
			}
			else {
				star--;
			}
			
			//next row
			System.out.println();
			row++;
		
		
	// 15.
		
		int n=5;
		int row=1;
		
		while(n>=row) {
			int space=1;
			while (space<row) {
				System.out.print("  ");
				
				space++;
			}
			
			int col=1;
			while (col<=n-row+1) {
				System.out.print("*");
				col++;	
			}
			System.out.println();
			row++;
		}
		
		int r=2;
		while (n>=r) {
			int space=1;
			
			while(space<=n-r) {
				System.out.print("  ");
				space++;
			}
			
			int col=1;
			while(col<=r) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			r++;
		}
		
	// 16.
		int n=5;
		int row=1;
		
		while(n>=row) {
			int space=1;
			
			while(space<=n-row) {
				System.out.print(" ");
				space++;
			}
			 int col=1;
			 
			 while(col<=n-row+1) {
				 System.out.print("*");
				 col++;
			 }
		System.out.println();
		row++;
		}
		
		int r=2;
		while (n>=r) {
			int space=1;
			
			while(space<r) {
				System.out.print(" ");
				space++;
			}
			
			int col=1;
			while(col<=r) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			r++;
		}
		
	// 18.
		
		int n=5;
		int row=1;
	
		while(row<=n) {
			int space=1;
		
			while(space<n-row+1) {
				System.out.print(" ");
				space++;
			}
		
			int col=1;
			while (col<=row ) {
				System.out.print("* ");
				col++;
			}
			System.out.println();
			row++;

		}
		
		int row1=1;
		
		while(row1<=n) {
			int space=1;
		
			while(space<row1+1) {
				System.out.print(" ");
				space++;
			}
		
			int col=1;
			while (col<=n- row1 ) {
				System.out.print("* ");
				col++;
			}
			System.out.println();
			row1++;
			}
			*/
		// 19.
		 
		int n=5;
		int row=1;
	
		while(row<=n) {
			//Star
			int star=5;
			while (star>=row) {
				System.out.print("* ");
				star--;
			}
			// Space
			
			int space=1;
			while(space<=2*row-2) {
				System.out.print("  ");
				space++;
			}
			
			//Star
			int str=5;
			while (str>=row) {
				System.out.print("* ");
				str--;
			}
		System.out.println();
		row++;
		}
		
		n = 5; 
        row = 1;

        while (row <= n) {
            // Print stars on the left side
            int i = 1;
            while (i <= row) {
                System.out.print("* ");
                i++;
            }

            // Print spaces in the middle
            int j = 1;
            while (j <= 2 * (n - row)-1) {
                System.out.print("  "); // Two spaces for indentation
                j++;
            }

            // Print stars on the right side (skip if it's the last row)
            int k = 1;
            while (k <= row) {
                if (row == n && k == row) {
                    // Skip printing the last star on the last row
                    break;
                }
                System.out.print("* ");
                k++;
            }

            System.out.println();
            row++;
        }
		
		
		/*
		//21.
		
		int n = 5; 
        int row = 1;

        while (row <= n) {
            // Print stars on the left side
            int i = 1;
            while (i <= row) {
                System.out.print("* ");
                i++;
            }

            // Print spaces in the middle
            int j = 1;
            while (j <= 2 * (n - row)-1) {
                System.out.print("  "); // Two spaces for indentation
                j++;
            }

            // Print stars on the right side (skip if it's the last row)
            int k = 1;
            while (k <= row) {
                if (row == n && k == row) {
                    // Skip printing the last star on the last row
                    break;
                }
                System.out.print("* ");
                k++;
            }

            System.out.println();
            row++;
        }
		
	// 22.
	
		int n=5;
		int row=1;
	
		while(row<=n) {
			//Star
			int star=5;
			while (star>=row) {
				System.out.print("* ");
				star--;
			}
			// Space
			
			int space=1;
			while(space<=2*row-2) {
				System.out.print("  ");
				space++;
			}
			
			//Star
			int str=5;
			while (str>=row) {
				System.out.print(" *");
				str--;
			}
		System.out.println();
		row++;
		}
		
		
		// 23
		
		int n=5;
		int row=1;
		
		while(row<=n) {
			// Space
			int j=1;
			while(j<=n-row) {
				System.out.print("  ");
				j++;
			}
			
			
			
			// Star
			int i=1;
			while(i<=2*row-1) {
				System.out.print("1 ");
				i++;
			}
			System.out.println();
			row++;
		}
		
		
		//24
		
		int n=5;
		int row=1;
		while(row<=n) {
			int space=1;
			while (space<=n-row) {
				System.out.print("  ");
				space++;
			}
			
			int i=1;
			while(i<=2*row-1) {
				System.out.print(row);
				System.out.print(" ");
				i++;
				
			}
		System.out.println();
		row++;
		}
		
		
		//25.
		int n=5;
		int row=1;
		int num=row;
		
		while(row<=n) {
			//Space
			int j=1;			
			
			while(j<n-row+1) {
				System.out.print("        ");
				j++;
			}
			
			//Star
			int i=1;
			
			while(i<=2*row-1) {
				System.out.print(num);
				System.out.print("	");
				num++;
				i++;
			}
		System.out.println();
		row++;
		}
				
		//26.
		int n=5;
		int row=1;
		
		while(row<=n) {
			
			//SPACES
			int k=1;
			while(k<=n-row) {
				System.out.print("  ");
				k++;
			}

			//NUMBERS
			int j=1;
			while(j<=2*row-1) {
				System.out.print(j+" ");
				j++;
			}
		System.out.println();
		row++;
		}
		
		//27.
		int n = 5;
        int row = 1;

        while (row <= n) {
            // SPACES
            int space = 1;
            while (space <= n - row) {
                System.out.print("  ");
                space++;
            }

            // NUMBERS (Left)
            int j = 1;
            while (j <= row) {
                System.out.print(j + " ");
                j++;
            }

            // NUMBERS (Right)
            j = row - 1;
            while (j >= 1) {
                System.out.print(j + " ");
                j--;
            }

            System.out.println();
            row++;
        } 
	//27 Alternate code
	
		int n = 3; // Number of rows
        int row = 1;

		while (row <= n) {
			// Print spaces
			int k = 0;
			while (k < n - row) {
				System.out.print("  ");
		        k++;
			}
			// Print numbers
			int j = 0, val = 1; 
			while (j < 2 * row - 1) {
				System.out.print(val + " ");
		        val += (j < row - 1) ? 2 : -2; 
                j++;
                }
		     System.out.println(); 
		     row++; 
		}


	
	/*
	//28.
		int n = 5;
        int row = 1;
        
        while (row <= n) {
		// Spaces
        	int space = 1;
        	while (space <= n - row) {
        		System.out.print("  ");
		        space++;
		      }
        	// Left side numbers
        	int num = row;
        	int count = 1;
        	while (count <= row) {
        		System.out.print(num + " ");
		        num++;
		        count++;
        		}
        	
        // Right side numbers 
        	num -= 2;
        	count = 1;
        	while (count <= row - 1) {
        		System.out.print(num + " ");
        		num--;
        		count++;
		         }

	    System.out.println();
	    row++;
        }
		
	//29.
		int n=5;
		int row=1;
		while(row<=n) {
			int space=1;
			while (space<=n-row) {
				System.out.print("  ");
				space++;
			}
			
			int i=1;
			while(i<=2*row-1) {
				if(i==2*row-1 || i==1) {
				System.out.print(row+" ");
				}
				else {
					System.out.print("0 ");
				}
				i++;		
			}
		System.out.println();
		row++;
		}
		
		//30.
		
		 
		int n=5;
		int row=1;
		
		while(row<=n) {
			int i=5;
			while(i>=1) {
				System.out.print(i+" ");
				i--;
			}
		System.out.println();
		row++;
		}
		
		//31.
		int n=5;
		int row=1;
		
		while(row<=n) {
			int i=n;
			while(i>=1) {
				if (i==row) {
					System.out.print("* ");
				}
				else {
					System.out.print(i+" ");
				}
				i--;
			}
			System.out.println();
			row++;
		}
		
		//32.
		
		int n=5;
		int row=1;
		
		// Upper half
		while(row<=n) {
			int i=1;
			while(i<=2*row-1) {
				if(i%2==0) {
					System.out.print("* ");
				}
				else {
				System.out.print(row+" ");
				}
				i++;
			}
		System.out.println();
		row++;
		}
		
		//Lower half 
		row=n-1;
		while(row>=1) {
			int i=1;
			while(i<=2*row-1) {
				if(i%2==0) {
					System.out.print("* ");
				}
				else {
					System.out.print(row+" ");
				}
				i++;
			}
			System.out.println();
			row--;
		}
		
		// 33.
		int n = 10;
        int row = 1;

        while (row <= n) {
            // Spaces
            int space = 1;
            while (space <= 2 * (n - row)) {
                System.out.print(" ");
                space++;
            }

            // Numbers (increasing order)
            int num = row - 1;
            int count = 1;
            while (count <= row) {
                System.out.print(num + " ");
                num = (num + 1) % 10;
                count++;
            }

            // Numbers (decreasing order)
            num = (num - 2 + 10) % 10;
            count = 1;
            while (count <= row - 1) {
                System.out.print(num + " ");
                num = (num - 1 + 10) % 10;
                count++;
            }

            System.out.println();
            row++;
        }*/
		
	}
}




























































