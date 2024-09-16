/*Input Format

The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.
Constraints

x <= 100000000000000000
Output Format

Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.
Sample Input

4545

Sample Output

4444

Explanation

There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than or greater than the original digit. If it is less, then invert it otherwise leave it.
*/
package Hackerblock_and_codeforces;
import java.util.*;

public class Chewbecca_and_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		System.out.print(invert(n));
	}
	public static long invert(long n) {
		long temp=n;
		long num=0;
		int counter=0;
		while(temp>0) {
			long t=temp%10;
			temp/=10;
			if(t>=5 && (temp!=0)) {
				t=9-t;
			}else if(temp==0 && t!=9 && t>=5){
				t=9-t;
				
			}
			num+=t*Math.pow(10, counter);
			counter++;
			
		}
		return  num;
	}

}