package learn_inner;

public class InnerTest
{
    public static void main(String[] args)
    {
        // 通过 接口的实现类，先创建实现类的对象，再调用方法
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.method();

        // 通过 匿名内部类来创建对象，再调用方法
        MyInterface anInterface = new MyInterface()
        // 下面大括号中的内容属于一个类（结尾的分号不能丢），但是没有名字，所以是匿名内部类
        {
            @Override
            public void method()
            {
                System.out.println("通过匿名内部类调用 method 方法");
            }
        };
        anInterface.method();
    }
}
