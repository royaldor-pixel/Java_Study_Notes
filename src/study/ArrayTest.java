package study;

/**
 * Classname:ArrayTest
 * Package:study
 * @create 2021-08-13 23:40
 **/
public class ArrayTest {
    public static void main(String[] args) {
        String[] stuIds = new String[]{"Hello","  ","World","!"};
        for (String stuId : stuIds) {
            System.out.print(stuId);
        }
    }
}
