/*

Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
Input Format

Constraints

0 < N <= 1000000000
Output Format

Sample Input

2635

Sample Output

11
5

*/

package Hackerblock_and_codeforces;
import java.util.*;
public class sum_even_odd_placed_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp=n;
		int odd=0;
		int even=0;
		int counter=0;
		while(temp>0) {
			int a=temp%10;
			counter+=1;
			if (counter%2==0) {
				even+=a;
			}else {
				odd+=a;
			}
			temp/=10;
		}
		System.out.println(odd);
		System.out.print(even);
	}

}
