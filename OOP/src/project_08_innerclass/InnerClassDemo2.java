package project_08_innerclass;

/**
 * @author g84196891
 */
public class InnerClassDemo2
{
    public static void main(String[] args)
    {
        new Outer2().method();

    }
}

/**
 * 内部类中具有和外部类中 同名的 成员变量
 */

class Outer2
{
    int num = 1;

    class Inner2
    {
        int num = 2;

        void show()
        {
            int num = 3;
            /**
             * 调用 值为 3 的 num
             */
            System.out.println("The num is " + num);

            /**
             * 调用 值为 2 的 num
             */
            System.out.println("The num is " + this.num);

            /**
             * 调用 值为 1 的 num
             * 为何内部类可以直接访问外部类的成员，是因为内部类持有了外部类的引用，即 外部类名.this
             */
            System.out.println("The num us " + Outer2.this.num);
        }
    }

    public void method()
    {
        new Inner2().show();
    }
}
