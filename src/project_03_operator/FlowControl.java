package project_03_operator;

public class FlowControl
{
    public static void main(String[] args)
    {
//    判断结构: if
        System.out.println("x 小于100");

//        打印九九乘法表
        print_table(10);
        int j = 10;
        //                break;
        System.out.println("等于" + j);
//                break;
        System.out.println("test");
//                break;

    }

    /*
    打印乘法表
     */
    public static void print_table(int size)
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
