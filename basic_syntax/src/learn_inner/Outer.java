package learn_inner;

public class Outer
{
    public void outerMethod()
    {
        class Inner // 局部内部类
        {
            int num = 10;

            public void innerMethod()
            {
                System.out.println("Inner 局部内部类 的成员变量 num 是 " + num);
            }

        }

        // 调用局部内部类的成员方法，必须在当前方法内部 创建对象 并调用方法
        new Inner().innerMethod();
    }
}
