package learn_keywords;

public class Person
{

    /*
    对于成员变量来说，如果被final修饰，它也是不可变的
    1. 成员变量是有默认值的，但如果被final修饰，则不再有默认值(如果默认赋值为null，则其不再能改变，所以不再有默认值)，需要手动赋值
    2. 对于被final修饰的成员变量，要么直接赋值，要么通过构造方法进行赋值，二者选其一
     */
    private String name/* = "Sage"*/;

    public Person()
    {
        name = "Sage";
    }

    public Person(String name)
    {
        this.name = name;
    }

    public void show()
    {
        System.out.println("Student 方法");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
