package project_05_OOP;

/*
 * static何时使用？
 * 1. 静态变量
 *   当对象中所具备的成员变量的值都是相同的，则这个成员可以被static修饰
 *
 * 2. 静态函数
 *   若该函数需要访问静态成员变量，则将函数定义成静态函数
 * */

public class StaticDemo2
{
    /*
    * 构造代码块，对所有的对象进行初始化（通用性），而构造函数是对特有的对象进行初始化（特有性）
    * */

    {
        System.out.println("我是构造代码块");
    }

    static
    {
        System.out.println("我是主函数的静态代码块");
    }
    public static void main(String[] args)
    {
        new Student().show();
//        Student.show();

    }
}


class Student
{

    /*
     * 构造代码块，对所有的对象进行初始化（通用性），而构造函数是对特有的对象进行初始化（特有性）
     * */
    {
        System.out.println("我是构造代码块");
    }
    /*
    * 静态代码块：
    * 只要new对象，则将运行静态代码块中的内容，而且只执行一次
    * 静态代码块用于对类进行初始化
    *
    * new对象时，先执行静态代码块，后执行构造代码块
    * */
    static
    {
        System.out.println("我是静态代码块");
    }

    void show()
    {
        System.out.println("我是show方法");
    }
}