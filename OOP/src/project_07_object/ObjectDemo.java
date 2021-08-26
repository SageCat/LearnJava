package project_07_object;

/**
 * @author g84196891
 */
public class ObjectDemo
{
    public static void main(String[] args)
    {
        Person person = new Person(23);
        Person person1 = new Person(23);
        System.out.println(person.equals(person1));
        System.out.println(person.equals(person));
        System.out.println(person.equals(new String("hello")));
    }
}

class Person
{
    private int age;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Person(int age)
    {
        this.age = age;
    }

    /**
     * 创建一个新的类时，通常都会重写 equals 方法 和 tostring 方法
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj)
    {
        /**
         * 判断是否是对象本身，若是则直接返回true
         */
        if (this == obj)
        {
            return true;
        }
        /**
         * 判断对象类型是否是同一类型，若不是，则抛出类型不对异常
         */
        if (!(obj instanceof Person))
        {
            throw new ClassCastException("类型不对，请改正！");
        }
        /**
         * 向下转型后判断对应值是否一致
         */
        Person obj1 = (Person) obj;
        return this.age == obj1.age;
    }
}

