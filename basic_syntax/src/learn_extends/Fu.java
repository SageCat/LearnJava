package learn_extends;

public class Fu
{
    // 父类的成员变量
    int age = 30;

    public Fu()
    {
        System.out.println("fu 构造方法");
    }

    // // 父类中的方法，并被子类重写
    public void showAge(){
        System.out.println("Fu age is " + age);
    }

    // 父类中的方法，且子类未重写
    public void method()
    {
        System.out.println("Fu Method");
    }
}
