package project_06_interface;

/**
 * @author g84196891
 */
public class InterfaceDemo
{
    public static void main(String[] args)
    {
//        Demo.NUM = 20;
        System.out.println(Demo.NUM);
        DemoSonSon demo = new DemoSonSon();
        demo.show1();
        demo.show2();
        demo.show3();
    }

}

/**
 * 当一个类中的所有方法都是抽象的时候，可以使用  接口  这种方式来定义
 *
 * 接口中成员特点：
 *  1. 常量，使用 public static final修饰, 如果不写这些修饰符，系统会默认加上
 *  2. 方法，全都是抽象方法， 默认使用public abstract修饰，即使不写这两个关键字，系统默认会加上
 *
 *  接口的特点：
 *  1. 接口不可以创建对象
 *  2. 子类必须覆盖掉接口中所有的抽象方法后，才可以进行实例化。否则子类是一个抽象类
 */

interface Demo
{
    int NUM = 10;
    void show1();
    void show2();
    void show3();
}

abstract class DemoSon implements Demo
{

    @Override
    public void show1()
    {
        System.out.println("show1 running");
    }

    @Override
    public void show2()
    {
        System.out.println("show2 running");
    }
}

class DemoSonSon extends DemoSon
{

    @Override
    public void show3()
    {
        System.out.println("show3 running");
    }
}