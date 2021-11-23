package learn_interface;

public interface A
{
    void methodA();

    public default void defaultMethod(){
        System.out.println("Default AAAA");
    }
}
