package learn_extends;

public class Zi extends Fu
{
    // 和父类重名的成员变量
    int age = 10;

    public Zi()
    {
        System.out.println("zi构造方法");
    }

    // 覆写了父类中的方法
    @Override
    public void showAge()
    {
        System.out.println("Zi age is " + age);
    }
}
