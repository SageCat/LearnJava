package learn_static;

public class StaticDemo
{
    public static void main(String[] args)
    {
        Student.class_room = "room one";

        Student sage = new Student("sage", 23);
        Student lily = new Student("lily", 25);

        System.out.println("The name is " + sage.getName() + " the age is " + sage.getAge() + " in " + Student.class_room);
        System.out.println("The name is " + lily.getName() + " the age is " + lily.getAge() + " in " + Student.class_room);
    }
}

class Student
{
    private String name;
    private int age;
    public static String class_room;

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
}
