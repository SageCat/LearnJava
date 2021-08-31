package project_08_expection;

public class SelfDefineException
{
    public static void main(String[] args)
    {
        int[] array = new int[2];

        GetArrValue getArrValue = new GetArrValue();
        getArrValue.getValue(array, -1);

    }
}

/**
 * java中没有数组负数角标异常，可以自定义异常.
 * <p>
 * 自定义异常时，必须继承 Exception 父类 或 RuntimeException 父类，只有这样，才可以使得自定义的异常类具有可抛性，才可以被throw和throws这两个关键字操作
 */

class MinusIndexException extends RuntimeException
{
    public MinusIndexException()
    {

    }

    public MinusIndexException(String message)
    {
        super(message);
    }


}

/**
 * 自定义异常和系统默认异常区别：
 *
 */

class GetArrValue
{
    public int getValue(int[] arr, int index)
    {
        if (index < 0)
        {
            throw new MinusIndexException("数组角标不能是负数");
        }
        return arr[index];
    }
}