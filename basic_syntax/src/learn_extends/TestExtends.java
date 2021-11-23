package learn_extends;

public class TestExtends
{
    public static void main(String[] args)
    {
        Fu zi = new Zi();

        // 调用了父类的成员变量(变量看左边)
        System.out.println(zi.age);
        // 强转为子类后(向下转型)，访问的是子类的变量
        System.out.println(((Zi)zi).age);

        System.out.println("===================");
        // 调用了子类的成员方法(方法看右边)，且方法内的变量使用的是子类的变量
        zi.showAge();

        zi.method();
    }
}
