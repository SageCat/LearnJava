package project_08_innerclass;

/**
 * @author g84196891
 */
public class InnerClassDemo
{
    public static void main(String[] args)
    {
        /**
         * 内部类不写权限修饰符时，可以直接访问 外部类 中的 内部类 的成员
         * 访问方式是： new Outer(). new Inner().show()  但这种方式并不常见
         */
        new Outer().new Inner().show();

        /**
         * 如果内部类被 static 修饰符修饰，则相当于是一个外部类， 则可以使用 外部类名.内部类名 的方式访问
         */
        new Outer.StaticInner().show();

        /**
         * 如果内部类是静态的，静态内部类中的成员也是静态的，则调用静态内部类成员时 不再需要 new 对象
         * 如果内部类中定义了静态成员，则该内部类必须是静态内部类，用static修饰
         */
        Outer.StaticStaticInner.show();


    }
}

/**
 * 具有内部类的类，编译后 会生成两个字节码文件， 一个是 Outer.class， 另一个是Outer$Inner.class
 * <p>
 * 内部类设计场景：
 * 在分析事物时，如果发现事物中还包含事物，且内部的事物还需要访问外部事物的成员，这时就需要定义内部类了
 */

class Outer // 外部类
{
    private int num = 3;
    private static int staticNum = 32;

    /**
     * 内部类特点：
     * 1. 内部类可以直接访问外部类的成员
     * 2. 外部类如果要访问内部类的成员，则需要创建内部类的对象才能访问
     */
    class Inner // 内部类
    {
        public void show()
        {
            /**
             * 内部类可以直接访问外部类的成员 num
             */
            System.out.println("The number is " + num);
        }
    }

    /**
     * 静态内部类
     */
    static class StaticInner
    {
        public void show()
        {
            /**
             * 内部类可以直接访问外部类的成员 staticNum
             */
            System.out.println("The staticNum is " + staticNum);
        }
    }

    /**
     * 带有静态成员的静态内部类
     */
    static class StaticStaticInner
    {
        public static void show()
        {
            System.out.println("The staticNum is " + staticNum);
        }
    }

    /**
     * 外部类访问内部类成员，需要创建内部类对象进而进行访问
     */
    public void method()
    {
        new Inner().show();
    }
}
