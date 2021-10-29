public class WrapperDemo
{
    public static void main(String[] args)
    {
        /**
         * 基本数据类型的包装类
         * 为了方便操作基本数据类型的值，将其封装成了对象，在对象中定义了属性和行为丰富了该数据的操作
         * 用于描述该对象的类就称为基本数据类型对象包装类
         *
         * 基本数据类型及其包装类名称：
         *  byte    Byte
         *  short   Short
         *  int     Integer
         *  long    Long
         *  float   Float
         *  double  Double
         *  char    Character
         *  boolean Boolean
         */

        int age;
        System.out.println(Integer.MAX_VALUE);
        /**
         * 十进制转换为其他进制
         *  toBinaryString
         *  toHexString
         *  ...
         *  toString(int i, int radix)
         *
         *  其他进制转换为10进制
         *      parseInt("string", radix)
         */
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toHexString(Integer.MIN_VALUE));
        /**
         * radix 代表进制数，二进制则写2,8进制则写8
         */
        System.out.println(Integer.toString(100, 8));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        /**
         * Integer的构造方法已过时
         */

        Integer integer = new Integer("123");
        Integer integer1 = 123;
        System.out.println(integer == integer1);
        System.out.println(integer.equals(integer1));

    }
}
