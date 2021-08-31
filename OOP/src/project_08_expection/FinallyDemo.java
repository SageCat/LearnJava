package project_08_expection;

/**
 * finally{} 包含的是一定会执行的代码
 */

public class FinallyDemo
{
    public static void main(String[] args)
    {
        FinalDemo1 finalDemo1 = new FinalDemo1();
        try
        {
            int show = finalDemo1.show(-3);
            System.out.println("the number is " + show);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();

            /**
             * 在处理完异常后，若直接返回，则后面的代码中，finally包含的代码一定会运行，但是后面的over.....代码不会再运行
             */
            return;

            /**
             * 若运行下述代码，则程序退出虚拟机，finally中的代码不再运行
             */
//            System.exit(0);
        }
        finally // 通常用来释放或关闭资源
        {
            System.out.println("finally");
        }

        System.out.println("over....");
    }

}


class FinalDemo1
{
    public int show(int index) throws ArrayIndexOutOfBoundsException
    {
        if(index < 0)
        {
            throw new ArrayIndexOutOfBoundsException("数组角标越界了！");
        }
        int[] array = new int[3];
        return array[index];
    }
}


