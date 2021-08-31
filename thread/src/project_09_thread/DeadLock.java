package project_09_thread;


public class DeadLock
{
    public static void main(String[] args)
    {
        DeadLockDemo deadLockDemoA = new DeadLockDemo(true);
        DeadLockDemo deadLockDemoB = new DeadLockDemo(false);

        Thread thread = new Thread(deadLockDemoA);
        Thread thread1 = new Thread(deadLockDemoB);

        thread.start();
        thread1.start();

        System.out.println("sss");
    }
}

class DeadLockDemo implements Runnable
{
    private boolean flag;

    public DeadLockDemo(boolean flag)
    {
        this.flag = flag;
    }

    @Override
    public void run()
    {
        test();
    }

    public void test()
    {
        while (true)
        {
            if (flag)
            {
                synchronized (DeadLockLock.lockA)
                {
                    System.out.println("this is lock A.....");
                    synchronized (DeadLockLock.lockB)
                    {
                        System.out.println("this is lock B .........");
                    }
                }
            }
            else
            {
                synchronized (DeadLockLock.lockB)
                {
                    System.out.println("this is lock A >>>>>>>>>>>>>>>>>>>>>>>>>");
                    synchronized (DeadLockLock.lockA)
                    {
                        System.out.println("this is lock B >>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    }
                }
            }
        }
    }
}

class DeadLockLock
{
    public final static Object lockA = new Object();
    public final static Object lockB = new Object();
}
