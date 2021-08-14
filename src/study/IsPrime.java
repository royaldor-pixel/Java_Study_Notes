package study;

import java.util.Scanner;
/**
 * Classname:IsPrime
 * Package:study
 *
 * @author Spencer Chao
 * @create 2021-08-11 13:00
 **/
public class IsPrime {
    public static void main(String[] args) {
        boolean isPrime = true;
        int count = 0;
        long range;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input range");
        range = scan.nextLong();
        if (range <= 2) {
            System.out.println("Error!");
        }
        else{
            long startTime = System.currentTimeMillis();
            for (int i = 2; i <= range; i++) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
                isPrime = true;
            }
            long stopTime = System.currentTimeMillis();
            System.out.println("number of prime from 0 to " + range + " is " + count);
            System.out.println("Run Time is " + ((double) stopTime - (double) startTime) + " ms ");
        }
    }
}
