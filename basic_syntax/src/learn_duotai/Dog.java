package learn_duotai;

// 子类Dog
public class Dog extends Animal
{
    static
    {
        System.out.println("Dog 静态代码块");
    }

    public Dog()
    {
        super();
        System.out.println("Dog构造方法！！！！！！！11");
    }

    // 覆写父类方法
    @Override
    public void eat()
    {
        System.out.println("狗吃骨头");
    }

    // 子类Dog特有方法
    public void watchHouse()
    {
        System.out.println("狗看家");
    }
}
