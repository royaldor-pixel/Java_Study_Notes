package study;

/**
 * Classname:YangHui
 * Package:study
 *
 * @author Spencer Chao
 * @create 2021-08-14 17:25
 **/
public class YangHui {
    public static void main(String[] args) {
        int [][] yangHui = new int[10][];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i+1];
            yangHui[i][0] = yangHui[i][i]= 1;
            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
            }
        }
        for (int[] ints : yangHui) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
