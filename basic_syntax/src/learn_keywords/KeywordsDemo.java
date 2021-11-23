package learn_keywords;

public class KeywordsDemo
{
    public static void main(String[] args)
    {
        // final 修饰局部变量，局部变量只能赋值一次，不能再进行更改
        final String name;
        name = "Sage";
        System.out.println(name);

        // final 修饰引用类型的局部变量，局部变量只能赋值一次，不能再进行更改
        final Person person = new Person("Sage");
    }
}
