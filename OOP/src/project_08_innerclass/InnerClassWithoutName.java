package project_08_innerclass;

/**
 * @author g84196891
 */
public class InnerClassWithoutName
{
    public static void main(String[] args)
    {
        new Outer4().method();
    }
}

abstract class DemoClass
{
    abstract void show();
}

interface DemoInterface
{
    void show();

    void cry();
}

class Outer4
{
    void method()
    {
        /**
         * 匿名内部类： 其实就是一个匿名的子类对象
         * 直接 new AbstractClass 或 Interface 并覆盖其中的抽象方法
         * 一般 new 完对象后会直接调用 覆写的方法，否则匿名内部类无意义
         */
        new DemoClass()
        {
            @Override
            void show()
            {
                System.out.println("DemoClass running");
            }
        }.show();

        new DemoInterface()
        {
            @Override
            public void show()
            {
                System.out.println("DemoInterface showing");
            }

            @Override
            public void cry()
            {

            }
        }.show();

        new DemoInterface()
        {
            @Override
            public void show()
            {

            }

            @Override
            public void cry()
            {
                System.out.println("DemoInterface crying");
            }
        }.cry();
    }
}
