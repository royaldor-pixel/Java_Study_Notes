package study;

/**
 * Classname:DogAge Package:study
 *
 * @author Spencer Chao
 * @create 2021-08-08 23:54
 */
import java.util.Scanner;

public class DogAge {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("请输入狗的年龄");
    int dogAge = scan.nextInt();
    if (dogAge < 0) {
      System.out.println("Error Input!");
    } else if (dogAge <= 2) {
      System.out.println("狗的年龄" + dogAge + "岁相当于人的" + 10.5 * dogAge + "岁");
    } else {
      System.out.println("狗的年龄" + dogAge + "岁相当于人的" + (21 + 4 * (dogAge - 2)) + "岁");
    }
  }
}
