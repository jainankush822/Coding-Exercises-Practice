package Java.Loops;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Entre the value of n: ");
        int n = scan.nextInt();
        int count = 0;
        int sum = 0; 
       while ( n >  0) {
              sum   = (n % 10) + sum;
             n = n / 10;
             count++;
        }
        // It can be done using for loop
        //  for (int temp = n; temp > 0; temp /= 10) {
        //     sum += temp % 10;
        //     count++;
        // }

        System.out.println("Count of digits of n:" + count);
        scan.close();
    }
}
