package project_06_extends;

class Person
{
    private String name;
    private int age;

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
}

class Student extends Person
{

    public void studying()
    {
        System.out.println(super.getName() + "学生" + super.getAge());
    }
}

class Worker extends Person
{
    public void working()
    {
        System.out.println( super.getName() + "工人" + super.getAge());
    }
}

/**
 * @author g84196891
 */
public class ExtendsDemo01
{
    public static void main(String[] args)
    {
        Student student = new Student();
        Worker worker = new Worker();

        student.setName("Sage");
        student.setAge(23);

        worker.setName("Bob");
        worker.setAge(35);

        student.studying();
        worker.working();
    }
}
