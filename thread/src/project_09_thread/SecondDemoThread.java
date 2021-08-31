package project_09_thread;

public class SecondDemoThread
{
    public static void main(String[] args)
    {
        InterThread interThread = new InterThread();

        Thread thread = new Thread(interThread);
        Thread thread2 = new Thread(interThread);

        thread.start();
        thread2.start();

    }
}

class InterThread implements Runnable
{

    @Override
    public void run()
    {
        show();
    }

    public void show()
    {
        for (int i = 0; i < 10; i++)
            System.out.println(Thread.currentThread().getName() + "---------------" + i);
    }
}
