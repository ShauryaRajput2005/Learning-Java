package Hackerblock_and_codeforces;

import java.util.*;
public class pin_code_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
			String pin=scan.next();
			int time=0;
			int cur_pos=1;
			int len=pin.length();
			for(int j=0;j<len;j++) {
				 int new_pos = pin.charAt(j) - '0';
				 if((cur_pos==0 && new_pos!=0)|| (new_pos==0 && cur_pos!=0) ) {
					 time+=1+(10-Math.abs(cur_pos-new_pos));
				 }else {
					 time+=1+Math.abs(new_pos-cur_pos);
					
				}
				 cur_pos=new_pos;
			}
		System.out.println(time);
		}	
	}
}

/*

You are given a four-digit pin code consisting of digits from 0 to 9 that needs to be entered. Initially, the cursor points to the digit 1

. In one second, you can perform exactly one of the following two actions:

    Press the cursor to display the current digit,
    Move the cursor to any adjacent digit.

The image above shows the device you are using to enter the pin code. For example, for the digit 5
, the adjacent digits are 4 and 6, and for the digit 0, there is only one adjacent digit, 9

.

Determine the minimum number of seconds required to enter the given four-digit pin code.
Input

Each test consists of multiple test cases. The first line contains a single integer t
(1≤t≤104

) - the number of the test cases. This is followed by their description.

The single line of each test case describes the pin code as a string of length 4
, consisting of digits from 0 to 9

.
Output

For each test case, output the minimum number of seconds required to enter the given pin code.
Example
Input
10
1111
1236
1010
1920
9273
0000
7492
8543
0294
8361


Output
4
9
31
27
28
13
25
16
33
24

*/