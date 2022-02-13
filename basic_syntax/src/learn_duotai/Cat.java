package learn_duotai;

// 子类Cat
public class Cat extends Animal
{
    // 本类静态代码块
    static
    {
        System.out.println("Cat 静态代码块");
    }

    // 本类构造代码块
    {
        System.out.println("Cat 构造代码块");
    }

    // 本类构造方法
    public Cat()
    {
        super(); // 系统会默认添加
        System.out.println("Cat构造方法！！！！！！！！！！");
    }



}
