package project_03_operator;

/**
 * @author g84196891
 */
public class FlowControl
{
    public static void main(String[] args)
    {
//    判断结构: if
        System.out.println("x 小于100");

        /**
         * 打印九九 乘法表
         */
        printTable(10);
        int j = 10;

        System.out.println("等于" + j);
        System.out.println("test");
        System.gc();

    }

    /**
     * Print multiplication table
     */
    public static void printTable(int size)
    {
        for (int i = 1; i < size; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + "*" + i + "=" + i * j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
