package project_06_interface;

public class MultipleImplementsDemo
{
}

/**
 * 第一个接口
 */
interface Demo1
{
    void show1();

    void show2();
}

/**
 * 第二个接口
 */
interface Demo2
{
    void show3();

    void show2();
}

/**
 * 可以实现多个接口
 *
 * 多继承的弊端：当多个父类中有相同功能时，子类调用父类方法时具有不确定性
 *
 * 多接口实现解决了多继承的弊端，因为多个接口中具有相同功能时，只重写一次，并且接口中没有方法体，具体功能由子类决定
 * 接口的出现避免了单继承的局限性，子类在继承父类的同时，还可以实现多个接口。父类定义子类具备的基础功能，接口定义子类想要具备的扩展功能。
 */
class DemoTest implements Demo1, Demo2
{

    /**
     * 同名的方法只重写一个
     */
    @Override
    public void show1()
    {

    }

    @Override
    public void show3()
    {

    }

    @Override
    public void show2()
    {

    }
}
