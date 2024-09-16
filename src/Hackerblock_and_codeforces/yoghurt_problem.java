package Hackerblock_and_codeforces;

import java.util.*;
public class yoghurt_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++) {
			int n=scan.nextInt(); // number of burles to buy
			int a=scan.nextInt();  // price of one
			int b=scan.nextInt(); //promotion price
			if(n%2==0) {
				int cost=(n/2)*Math.min(b,2*a);
				System.out.println(cost);
			}else {
				int r=n%2;
				int cost=((n/2)*Math.min(b,2*a))+r*a;
				System.out.println(cost);
			}
		}

	}

}
/*The price of one yogurt at the "Vosmiorochka" store is a burles, but there is a promotion where you can buy two yogurts for b
burles.
Maxim needs to buy exactly n
yogurts. When buying two yogurts, he can choose to buy them at the regular price or at the promotion price.
What is the minimum amount of burles Maxim should spend to buy n
yogurts?
Input

The first line contains a single integer t
(1≤t≤104

) — the number of test cases.

The first and only line of each test case contains three integers
 n, a, and b (1≤n≤100, 1≤a,b≤30

) — the number of yogurts Maxim wants to buy, the price for one yogurt, and the price for two yogurts on promotion.
Output

For each test case, print in a separate line the minimum cost of buying n

yogurts at "Vosmiorochka".
Example
Input
Copy

4
2 5 9
3 5 9
3 5 11
4 5 11

Output
Copy

9
14
15
20
*/