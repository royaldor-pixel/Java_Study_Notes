package study;

/**
 * Classname:PerfectNumber
 * Package:study
 *
 * @author Spencer Chao
 * @create 2021-08-13 18:30
 **/
public class PerfectNumber {
    public static void main(String[] args) {
        int facSum;
        for (int i = 1; i <= 1000; i++) {
            facSum = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i % j==0){
                    facSum += j;
                }
            }
            if (facSum == i){
                System.out.println(i+" is a complete number");
            }
        }
    }
}
