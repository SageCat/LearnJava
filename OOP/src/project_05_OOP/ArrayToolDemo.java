package project_05_OOP;

/**
 * @author g84196891
 */
public class ArrayToolDemo
{
    public static void main(String[] args)
    {
        int[] arr = {1,5,2,4,9,10,2,5,2};
        System.out.println("最大值是 " + NumberOperation.getMax(arr));
//        System.out.println("max of arr is " + getMax(arr));
    }


    /*
    构造工具函数获取int数组最大值
    */

    public static int getMax(int[] arr)
    {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > arr[maxIndex])
            {
                maxIndex = i;
            }
        }

        return arr[maxIndex];
    }
}
