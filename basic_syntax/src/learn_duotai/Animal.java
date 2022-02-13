package learn_duotai;

// 父类Animal
public class Animal
{
    String name;

    // 父类静态代码块
    static {
        System.out.println("静态代码块》》》》》》》》》》》");
    }
    // 父类构造代码块
    {
        System.out.println("Animal 构造代码块======");
    }

    // 父类构造方法
    public Animal()
    {
        System.out.println("Animal 构造方法");
    }

    public void eat(){
        System.out.println("动物吃东西");
    }
}
