package Hackerblock_and_codeforces;

import java.util.*;
public class three_brothers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a+b==3) {
			System.out.print(3);
		}else if (a+b==5) {
			System.out.print(1);
		}
		else {
			System.out.print(2);
		}
	}

}
/*Three brothers agreed to meet. Let's number the brothers as follows: the oldest brother is number 1, the middle brother is number 2, and the youngest brother is number 3.

When it was time for the meeting, one of the brothers was late. Given the numbers of the two brothers who arrived on time, you need to determine the number of the brother who was late.
Input

The first line of input contains two different integers a and b (1 ≤ a, b ≤ 3, a ≠ b) — the numbers of the brothers who arrived on time. The numbers are given in arbitrary order.
Output

Output a single integer — the number of the brother who was late to the meeting.
Example
Input
Copy

3 1

Output
Copy

2*/