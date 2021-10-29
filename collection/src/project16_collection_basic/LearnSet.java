package project16_collection_basic;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author g84196891
 */
public class LearnSet
{
    public static void main(String[] args)
    {
        HashSet<Student> stringHashSet = new HashSet<Student>();
        /**
         * 虽然对象是 同名同年龄，但却是不同的实例对象，所以存储的内容会有重复
         * 为了避免这种情况，需要重写 Student类的equals()方法和 hashCode()方法
         *
         * 在HashSet容器添加对象时，会先调用对象的hashCode()方法，若hash值不同，则添加对象，
         * 若哈希值相同，则再调用equals()方法比较对象的属性值，若属性值也和已有的对象相同，则不添加该重复对象
         *
         * 先调用 hashCode() 比较哈希值，再调用 equals() 方法比较对象属性
         */
        stringHashSet.add(new Student("Sage", 21));
        stringHashSet.add(new Student("Sage", 21));
        stringHashSet.add(new Student("Sage", 21));
        stringHashSet.add(new Student("Sage", 21));

        for (Student student : stringHashSet)
        {
            System.out.println(student.getName() + "----" + student.getAge());
        }
        System.out.println("hello");


        /**
         * LinkedHashSet 容器，既可以保证顺序，又可以保证唯一
         */
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        LinkedHashSet<String> stringsLinkedHashSet = new LinkedHashSet<String>();
        stringsLinkedHashSet.add("sage0");
        stringsLinkedHashSet.add("sage1");
        stringsLinkedHashSet.add("sage2");
        stringsLinkedHashSet.add("sage2");
        stringsLinkedHashSet.add("sage3");
        stringsLinkedHashSet.add("sage4");
        stringsLinkedHashSet.add("sage4");

        for (String linkedHashSet : stringsLinkedHashSet)
        {
            System.out.println(linkedHashSet);
        }
    }
}

class Student implements Comparable
{
    private String name;
    private int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * 重写equals()方法，用于比较Student对象的姓名和年龄
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Student))
        {
            throw new ClassCastException();
        }
        Student student = (Student) obj;
        return (this.name.equals(student.name) && this.age == student.age);
    }

    /**
     * 重写 hashCode() 方法，根据Student类的姓名和年龄计算hash值并返回
     * @return
     */
    @Override
    public int hashCode()
    {
        return this.name.hashCode() + this.age;
    }

    @Override
    public int compareTo(Object o)
    {
        if (this.equals(o))
        {
            return 0;
        }
        if (!(o instanceof Student))
        {
            throw new ClassCastException();
        }
        Student student = (Student)o;
        int temp = student.age - this.age;
        return temp == 0 ? student.name.compareTo(this.name) : temp;
    }

}