package learn_interface;

public interface B
{
    void methodB();

    public default void defaultMethod(){
        System.out.println("Default BBB");
    }
}
