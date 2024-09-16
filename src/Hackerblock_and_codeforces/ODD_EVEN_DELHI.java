package Hackerblock_and_codeforces;
import java.util.*;

public class ODD_EVEN_DELHI {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            long carNumber = scanner.nextLong();
            String carNumberStr = String.valueOf(carNumber);
            
            int sumEven = 0;
            int sumOdd = 0;
            
            for (char digit : carNumberStr.toCharArray()) {
                int num = Character.getNumericValue(digit);
                if (num % 2 == 0) {
                    sumEven += num;
                } else {
                    sumOdd += num;
                }
            }
            
            if (sumEven % 4 == 0 || sumOdd % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        scanner.close();
    }
}
