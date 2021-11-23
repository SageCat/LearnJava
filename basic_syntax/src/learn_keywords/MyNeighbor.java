package learn_keywords;

public class MyNeighbor
{
    public void show()
    {
        // 如果同一个包中的另一个变量被 public  protected  default修饰，则该变量
        System.out.println(new MyClass().num);
    }
}
