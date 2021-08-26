package project_06_extends;

/**
 * @author g84196891
 */
public class ExtendsDemo03
{
    public static void main(String[] args)
    {
        /**
         * 以下代码输出内容是：
         * Fu running
         * Zi running
         */
        new Zi();
    }
}

/**
 * 字父类构造函数特点：访问子类构造函数时，父类的构造函数会先运行
 * 原因： 在子类的构造函数的第一行，有一个默认的隐式语句 super();
 * <p>
 * 子类实例化过程中，子类的所有构造函数，都会默认访问父类中空参的构造函数。为什么？
 * 原因： 子类继承了父类之后，获取了父类中的内容和属性，所以在使用父类之前，要先看看父类是如何对自己的子类进行初始化的
 * 所以子类在构造对象时必须先调用父类的空参构造函数。
 */

class Fu
{
    public Fu()
    {
        System.out.println("Fu running");
    }
}

class Zi extends Fu
{
    public Zi()
    {
        /** 隐式函数 super() 作用是调用父类中空参的构造函数 */
        super();
        System.out.println("Zi running");
    }
}
