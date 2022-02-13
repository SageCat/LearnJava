package learn_extends;

public class Fu
{
    // 父类的成员变量
    int age = 30;

    public Fu()
    {
        System.out.println("fu 构造方法");
    }

    // 父类中的方法，并被子类重写
    public void showAge(){
        System.out.println("Fu age is " + age);
    }

    // 父类中的方法，且子类未重写
    public void method()
    {
        System.out.println("Fu Method");
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        Fu fu = (Fu) o;

        return age == fu.age;
    }

    @Override
    public String toString()
    {
        return "Fu{" +
                "age=" + age +
                '}';
    }

    @Override
    public int hashCode()
    {
        return age;
    }
}
