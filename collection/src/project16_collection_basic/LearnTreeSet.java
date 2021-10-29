package project16_collection_basic;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author g84196891
 */
public class LearnTreeSet
{
    public static void main(String[] args)
    {
        /**
         * TreeSet
         *  可以对集合中的内容进行指定顺序进行排序
         */
        TreeSet<String> stringTreeSet = new TreeSet<>();

        stringTreeSet.add("abc");
        stringTreeSet.add("adc");
        stringTreeSet.add("acc");
        stringTreeSet.add("ddc");
        stringTreeSet.add("bab");
        stringTreeSet.add("bdac");
        stringTreeSet.add("bdbc");

        for (String string : stringTreeSet)
        {
            System.out.println(string);
        }

        /**
         * 存储自定义对象 Student
         *
         * 传入自定义的对象，则对象所属类需要实现 Comparable 接口，并实现 CompareTo 方法，返回值为 0 时，则判断为同一对象
         */

        TreeSet<Student> studentTreeSet = new TreeSet<Student>(new CompareStudentByName());

        studentTreeSet.add(new Student("sage", 23));
        studentTreeSet.add(new Student("lily", 18));
        studentTreeSet.add(new Student("lily", 18));
        studentTreeSet.add(new Student("tom", 45));
        studentTreeSet.add(new Student("tony", 33));
        studentTreeSet.add(new Student("tony", 33));
        studentTreeSet.add(new Student("joan", 23));

        for (Student student : studentTreeSet)
        {
            System.out.println(student.getName() + " ----- " + student.getAge());
        }

    }
}

/**
 * TreeSet 集合做对象比较的第二种方法：
 * 传入 比较器。
 * 可以自定义比较器，实现Comparator接口即可
 */
class CompareStudentByName implements Comparator
{

    @Override
    public int compare(Object o1, Object o2)
    {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;
        int result = student1.getName().compareTo(student2.getName());
        return result == 0 ? student1.getAge() - student2.getAge() : result;
    }
}