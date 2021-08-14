package study;

/**
 * Classname:RandNumberArray_2
 * Package:study
 *
 * @author Spencer Chao
 * @create 2021-08-14 22:39
 **/
public class RandNumberArray_2 {
    public static void main(String[] args) {
        int [] randArray = new int[6];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i]=(int) (29*Math.random()) + 1;
            for (int j = 0; j < i; j++) {
                if(randArray[i] == randArray[j]){
                    i--;
                    break;
                }
            }
        }
        for (int j : randArray) {
            System.out.print(j + '\t');
        }
    }
}
