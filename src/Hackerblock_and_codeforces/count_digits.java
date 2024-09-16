/*

Take the following as input.
A number
A digit
Write a function that returns the number of times digit is found in the number. Print the value returned.
Input Format

Integer (A number) Integer (A digit)
Constraints

0 <= N <= 1000000000 0 <= Digit <= 9
Output Format

Integer (count of times digit occurs in the number)
Sample Input

5433231 
3

Sample Output

3

*/


package Hackerblock_and_codeforces;
import java.util.*;

public class count_digits {
	public static void main(String [] args){
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int n=scan.nextInt();
	int counter=0;
	while(num>0) {
		int a=num%10;
		if(a==n) {
			counter+=1;
			}
		num/=10;
		}
	System.out.print(counter);
	}

}
