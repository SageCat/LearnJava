package project_03_operator;

/**
 * @author g84196891
 */
public class operator
{
    public static void main(String[] args)
    {
        /*
        逻辑运算符：
        &: 与 两边为真才为真
        |： 或 一遍为真就为真
        ^: 亦或  两边结果若相同则为 false 否则为 true
        &&: 与与 若左边为假，则不判断右边，结果为假； 若左边为真，则继续判断右边，若右边也为真。则结果为真，若右边为假。则结果为假
        ||: 或或 若左边为真，则不判断右边，结果为真； 若左边为假，则继续判断右边，若右边也为假。则结果为假，若右边为真。则结果为真
         */
        System.out.println(true);
        System.out.println(false ^ true);
        System.out.println(true ^ true);

        System.out.println("-------------");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("-------------");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        /*
        位运算符(数字之间采用二进制运行运算)：
        &：与
        |：或
        ^: 亦或
        ~: 非
        <<: 左移几位，相当于乘以2的几次幂
        >>: 右移几位，相当于除以2的几次幂
        >>>: 无符号右移
         */
        System.out.println(6 & 3);
        System.out.println(6 | 2);
        System.out.println(6 ^ 2);
//        一个数亦或同一个数，结果还是这个数本身
        System.out.println(6 ^ 2 ^ 2);
        System.out.println(~6);
        System.out.println(3 << 2);
        System.out.println(3 >> 2);
        System.out.println(3 >>> 2);
        System.out.println(2 << 29);

        System.out.println(">>>>>>>>>>>>>>>>>");
//        交换 a 和 b 的值
        int a = 3;
        int b = 5;
        System.out.println("a = " + a +", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a +", b = " + b);
    }
}
