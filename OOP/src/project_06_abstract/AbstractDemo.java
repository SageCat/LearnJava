package project_06_abstract;

/**
 * 抽象：即笼统，不具体
 * <p>
 * 抽象特点：
 * 1. 方法只有声明，没有实现实，该方法是抽象方法，必须用abstract修饰
 * 2. 抽象方法必须定义在类中，但抽象类中可以有非抽象方法。该类也必须被abstract修饰
 * 3. 抽象类必须有其子类覆盖了其所有抽象方法后，该子类才可以实例化对象，否则该子类还是抽象类。
 *
 * 抽象类的5个问题：
 * 1. 抽象类是否有构造函数？
 *  有构造函数。可用于给子类进行初始化。
 * 2. 抽象类可以不定义抽象方法吗？
 *  可以，但很少见。目的就是不让该类创建对象，AWT的适配器对象就是这种类型的抽象类。通常这个类中的方法有方法体，但是却没有内容。
 * 3. 抽象关键字不能和哪些关键字共存？
 *  private， static， final
 * 4. 抽象类和一般类的异同点？
 *    相同点：
 *      1） 都是用来描述事物的，都在内部定义了成员
 *    不同点：
 *      1） 一般类有足够的信息用来描述事物，抽象类描述的事物可能信息不足
 *      2） 一般类中不能定义抽象方法，抽象类可以定义抽象方法，也可以定义非抽象方法
 *      3） 一般类可以实例化，抽象类不可以实例化
 * 5. 抽象类一定是一个父类吗？
 *  是的，因为抽象类是向上抽取的结果。
 */

/**
 * @author g84196891
 */
public class AbstractDemo
{
    public static void main(String[] args)
    {
        DemoA demoA = new DemoA();
        demoA.show();
        demoA.speak();
    }
}


/**
 * DemoA 和 DemoB中有共性方法 show()，则可以向上抽取
 */

abstract class Demo
{
    /**
     * show method is the common function of Demo
     */

    abstract void show();

    void speak()
    {
        System.out.println("speak language");
    }
}


class DemoA extends Demo
{
    @Override
    void show()
    {
        System.out.println("DemoA show");
    }
}

class DemoB extends Demo
{
    @Override
    void show()
    {
        System.out.println("DemoB show");
    }
}