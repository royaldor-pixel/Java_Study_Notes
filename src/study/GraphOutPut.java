package study;

/**
 * Classname:GraphOutPut
 * Package:study
 *
 * @author Spencer Chao
 * @create 2021-08-09 19:10
 **/
import java.util.Scanner;
public class GraphOutPut {
    public static void main(String[] args) {
        for(int i = 1;i <=5;i++){
            for(int j=1;j<=5-i;j++){
        System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
        System.out.print("*");
            }
      System.out.println();
        }
        for(int i = 1;i <=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*(5-i)-1;k++){
                System.out.print("*");
            }
      System.out.println();
        }
    }
}
