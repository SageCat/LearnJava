package project_06_abstract;

/**
 * @author g84196891
 */
public class AbstractExample
{
    public static void main(String[] args)
    {
        Programer sage = new Programer("Sage", 123, 20000);
        sage.work();
        System.out.println(sage);
        System.out.println(sage.getName());

        Manager jc = new Manager("JC", 234, 30000, 10000);
        jc.work();
        System.out.println(jc);
    }

}

abstract class Employee
{
    /**
     * 员工共有属性
     */
    private String name;
    private int id;
    private double salary;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public Employee(String name, int id, double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    /**
     * 尚不清楚的工作内容
     */
    abstract void work();
}


class Programer extends Employee
{
    public Programer(String name, int id, double salary)
    {
        super(name, id, salary);
    }

    /**
     * 必须重写work()抽象方法
     */
    @Override
    void work()
    {
        System.out.println("coding.....");
    }

    @Override
    public String toString()
    {
        return "Programer{" + super.getName() + "}";
    }
}

class Manager extends Employee
{
    /**
     * Manager特有属性
     */
    private double bonus;

    public Manager(String name, int id, double salary, double bonus)
    {
        super(name, id, salary);
        /**
         * 特有属性在构造函数中
         */
        this.bonus = bonus;
    }

    /**
     * 必须重写work()抽象方法
     */
    @Override
    void work()
    {
        System.out.println("manager working");
    }

    @Override
    public String toString()
    {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}