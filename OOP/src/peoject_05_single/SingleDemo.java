package peoject_05_single;

/**
 * 设计模式：对问题行之有效的解决方式，是一种思想
 *
 * 1. 单例设计模式
 * 解决的问题： 可以保证一个类在内存中的对象的唯一性
 * 场景： 多个程序访问同一个对象中所包含的数据，则需要保证被访问的这个对象的唯一性
 *
 * 如何保证对象的唯一性？
 * 1） 不允许其他程序new创建对象
 * 2） 在该类中创建一个本类实例
 * 3） 对外提供一个方法，使其他程序可以访问该对象
 *
 * 步骤：
 * 1） 私有化该类的构造函数，进而不允许new该类的对象
 * 2） 通过new在本类中创建一个本类对象
 * 3） 创建一个public方法，将创建的本类对象返回
 */


/**
* 类一加载，就创建对象，又叫饿汉式，多线程时无安全隐患，开发时多用。
*/
class Single
{
    /** 私有化构造函数，不再允许其他程序使用new进行对象的创建 */
    private Single()
    {

    }
    /** 创建一个本类对象，对象只能是static的，因为要被静态的getInstance方法调用并返回。使用private修饰，对其进行隐藏，使其不能直接被类名调用 */
    private static final Single s = new Single();

    /** 静态方法返回对象 */
    public static Single getInstance()
    {
        return s;
    }
}

/**
 * 只有调用getInstance()方法时，才创建对象，属于对象的延迟加载，又叫懒汉式。多线程时存在安全隐患，开发时少用
 */
class Single2
{
    /** 私有化构造函数，不再允许其他程序使用new进行对象的创建 */
    private Single2()
    {

    }
    /** 创建一个本类对象变量，但是先不创建对象，变量只能是static的，因为要被静态的getInstance方法调用并返回。使用private修饰，对其进行隐藏，使其不能直接被类名调用 */
    private static Single2 s = null;

    /** 静态方法返回对象 */
    public static Single2 getInstance()
    {
        if(s == null)
        {
            s = new Single2();
        }
        return s;
    }
}

/**
 * @author g84196891
 */
public class SingleDemo
{
    public static void main(String[] args)
    {
        Single instance = Single.getInstance();
        Single instance2 = Single.getInstance();
        System.out.println(instance == instance2);

        Single2 instance11 = Single2.getInstance();
        Single2 instance12 = Single2.getInstance();
        System.out.println(instance11 == instance12);


    }
}
