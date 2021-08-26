package project_07_polymorphism;

/**
 * @author g84196891
 */
public class ComputerDemo
{
    public static void main(String[] args)
    {
        /**
         * 创建computer对象
         */
        Computer computer = new Computer();
        /**
         * 通过调用useUSB() 方法使用 Mouse
         */
        computer.useUSB(new Mouse());
        /**
         * 通过调用useUSB() 方法使用 Keyboard
         */
        computer.useUSB(new Keyboard());
    }

}

/**
 * 定义USB接口
 */
interface USB
{
    void open();

    void close();
}

/**
 * 定义Computer类，并使用USB接口
 */
class Computer
{
    public Computer()
    {
        System.out.println("Computer running");
    }

    /**
     * 使用USB接口，父类引用指向子类对象，增强计算机类的可扩展性
     * @param usb
     */
    public void useUSB(USB usb)
    {
        if (usb != null)
        {
            usb.open();
            usb.close();
        }
    }
}

/**
 * 定义Mouse类并实现USB接口
 */
class Mouse implements USB
{

    @Override
    public void open()
    {
        System.out.println("Mouse open");
    }

    @Override
    public void close()
    {
        System.out.println("Mouse Close");
    }
}

/**
 * 定义Keyboard类并实现USB接口
 */
class Keyboard implements USB
{

    @Override
    public void open()
    {
        System.out.println("Keyboard open");
    }

    @Override
    public void close()
    {
        System.out.println("Keyboard close");
    }
}