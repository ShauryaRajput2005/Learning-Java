package Hackerblock_and_codeforces;

import java.util.Scanner;

public class data_type_convertor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int sb = scan.nextInt(); 
        int db = scan.nextInt(); 
        String n = scan.next(); 
        int decimalValue = convertToDecimal(n, sb);
        

        String result = convertFromDecimal(decimalValue, db);
        System.out.println(result);
    }

    public static int convertToDecimal(String n, int base) {
        int decimalValue = 0;
        int power = 1;

        for (int i = n.length() - 1; i >= 0; i--) {
            char digit = n.charAt(i);

            int digitValue;
            if (Character.isDigit(digit)) {
                digitValue = digit - '0'; 
            } else {
                digitValue = Character.toUpperCase(digit) - 'A' + 10; 
            }

            decimalValue += digitValue * power;
            power *= base; 
        }

        return decimalValue;
    }

    public static String convertFromDecimal(int decimalValue, int base) {
        if (decimalValue == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (decimalValue > 0) {
            int remainder = decimalValue % base;
            if (remainder < 10) {
                result.append(remainder); 
            } else {
                result.append((char) ('A' + (remainder - 10))); 
            }
            decimalValue /= base;
        }
        return result.reverse().toString();
    }
}
