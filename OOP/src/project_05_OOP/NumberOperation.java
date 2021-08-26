package project_05_OOP;

public class NumberOperation
{
    /*
    强制该类的构造方法为私有，禁止创建此类的对象
    */
    private NumberOperation()
    {

    }

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
