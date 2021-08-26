package project_08_innerclass;

/**
 * @author g84196891
 */
public class InnerClassDemo3
{
    public static void main(String[] args)
    {
        new Outer3().method();
    }
}

/**
 * 局部内部类： 定义在方法体中的内部类
 */
class Outer3
{
    int num = 3;

    void method()
    {
        int y = 10;
        class Inner3
        {
            void show()
            {
                /**
                 * 直接调用外部类的成员
                 */
                num = 20;
                num = 30;
                System.out.println(num);

                /**
                 * 调用局部变量时，系统默认为其增加 final 修饰符， 该局部变量的值不再可以修改
                 */
                System.out.println("the value of y in method is " + y);
            }
        }

        new Inner3().show();
    }
}
