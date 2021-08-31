package project_09_thread;

public class ThreadDemo
{
    public static void main(String[] args)
    {
        /**
         * 多线程执行
         */
        Demo sage = new Demo("Sage");
        Demo cat = new Demo("Cat");
        sage.start();
        cat.start();
        System.out.println(">>>>>>>>>" + Thread.currentThread().getName());

    }
}

class Demo extends Thread
{
    private String name;

    public Demo(String name)
    {
        this.name = name;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++)
            System.out.println("The name is -->" + name + " ---> " + i + "---->" + this.getName());
    }
}
