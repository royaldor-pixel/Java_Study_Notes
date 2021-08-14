package study;

/**
 * Classname:MultTable
 * Package:study
 *
 * @author Spencer Chao
 * @create 2021-08-11 12:55
 **/
public class MultTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" * "+ i +" = "+ i*j+'\t');
            }
            System.out.println();
        }
    }
}
