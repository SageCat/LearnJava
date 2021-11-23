package learn_interface;

public class C implements A,B,sum
{
    @Override
    public void methodA()
    {
        System.out.println("A Method");
    }

    @Override
    public void defaultMethod()
    {
        System.out.println("default CCC");
    }

    @Override
    public void methodB()
    {
        System.out.println("B Method");
    }
}
