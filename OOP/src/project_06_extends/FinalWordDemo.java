package project_06_extends;

/**
 * @author g84196891
 */
public class FinalWordDemo
{
    public static void main(String[] args)
    {
        new FinalSon().show();
    }
}


class FinalFather
{
    public void show()
    {
        /**
         * 如果父类中调用底层资源的方法被子类覆盖后，则父类的方法将不再调用，那么就无法调用底层资源了
         * 所以在此情况下继承的弊端是：打破了类的封装性
         *
         * final关键字：
         * 1. 是一个修饰符，可以修饰方法，变量，类等
         * 2. final修饰的类不可以被继承，因为已经是最终类了
         * 3. final修饰的方法不可以被覆写
         * 4. final修饰的变量是一个常量，只能赋值一次，且必须在声明时就赋值
         */
        System.out.println("Call Hardware");
    }
}


class FinalSon extends FinalFather
{
    final int age = 0;

    @Override
    public void show()
    {
        System.out.println("Son Running");
    }
}
