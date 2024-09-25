package Hackerblock_and_codeforces;
import java.util.*;

public class roses_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int k = 0; k < t; k++) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int money = scan.nextInt();
            target_sum(arr, money);
            if (k != t - 1) {
                System.out.println();
            }
        }
        scan.close();
    }

    public static void target_sum(int[] arr, int money) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int minDiff = Integer.MAX_VALUE;
        int[] bestPair = new int[2];

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == money) {
                int diff = Math.abs(arr[left] - arr[right]);
                if (diff < minDiff) {
                    minDiff = diff;
                    bestPair[0] = arr[left];
                    bestPair[1] = arr[right];
                }
                left++;
                right--;
            } else if (sum < money) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Deepak should buy roses whose prices are " + bestPair[0] + " and " + bestPair[1] + ".");
    }
}
