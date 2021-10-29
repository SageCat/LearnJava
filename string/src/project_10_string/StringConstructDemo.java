package project_10_string;

public class StringConstructDemo
{
    public static void main(String[] args)
    {
        learnStringConstructDemo();
        learnGeneralStringFunctions();
    }

    private static void learnGeneralStringFunctions()
    {
        /**
         * 1. 获取字符串相关信息
         *  1.1 获取字符串的长度  int length()
         *  1.2 根据位置获取字符  char charAt(int position)
         *  1.3 根据字符获取其在字符串中第一次出现的位置  int indexOf(int char)
         */

    }

    private static void learnStringConstructDemo()
    {
        /**
         * s1 创建对象的方式等效于 s2 创建对象的方式
         */
        String s1 = new String();
        String s2 = "";
        System.out.println(s1 == s2); // false 比较地址
        System.out.println(s1.equals(s2));  // true  比较字符串的值

        byte[] arr = {65, 66, 67, 68, 69};
        String s3 = new String(arr);
        System.out.println(s3);

    }
}
