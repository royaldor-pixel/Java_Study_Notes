package study;

/**
 * Classname:RandNumberArray
 * Package:study
 *
 * @author Spencer Chao
 * @create 2021-08-14 17:49
 **/
public class RandNumberArray {
    public static void main(String[] args) {
        int [] randArray = new int[6];
        int randNum,count;
        boolean flag=false;
        randNum=(int) (29*Math.random()) + 1;
        randArray[0] = randNum;
        for (int i = 1; i < randArray.length; i++)
        {
            while (!flag)
            {
                randNum=(int) (29*Math.random()) + 1;
                for (count = 0; count < i; count++)
                {
                    if(randArray[count]==randNum)
                        break;
                }
                if(count == i)
                    flag = true;
            }
            flag=false;
            randArray[i] = randNum;
        }
        for (int Num : randArray){
            System.out.print(Num+ "\t");
        }
    }
}
