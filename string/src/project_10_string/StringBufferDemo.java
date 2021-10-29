package project_10_string;

public class StringBufferDemo
{
    public static void main(String[] args)
    {
        /**
         * StringBuffer: 字符串缓冲区，是用于存储数据的容器
         * 特点：
         *  1. 长度可变
         *  2. 可存储不同的数据类型
         *  3. append 添加的所有数据 最终要转成字符串使用
         *  4. 可以对字符串进行修改
         *
         *  具备的功能：
         *      增: append  insert
         *      删: delete  deleteChartAt
         *      改: replace  setChartAt
         *      查: chartAt  indexOf  lastIndexOf
         */

        /**
         * 创建字符串缓冲区，默认长度为 16
         */
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer append = stringBuffer.append(100);
        /**
         * stringBuffer 和 append 是同一个对象，见 面盆理论：添加了内容之后，容器本身不变
         */
        System.out.println(stringBuffer == append);
        System.out.println(stringBuffer);

        stringBuffer.append("aihfiankajhkjahkfsaa");
        System.out.println();

        /**
         * StringBuilder 是非线程安全的，单线程时用StringBuilder，多线程时用StringBuffer
         */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(123);


    }


}
