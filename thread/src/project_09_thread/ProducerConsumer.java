package project_09_thread;

/**
 * @author g84196891
 */
public class ProducerConsumer
{
    public static void main(String[] args)
    {
        Resource resource = new Resource();

        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        new Thread(producer).start();
        new Thread(consumer).start();

    }
}

class Resource
{
    private String name;
    private String gender;
    private boolean flag = false;

    public boolean isFlag()
    {
        return flag;
    }

    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }
}

class Producer implements Runnable
{
    private Resource resource;
    private int i = 0;

    public Producer(Resource resource)
    {
        this.resource = resource;
    }

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (resource)
            {
                if (resource.isFlag())
                {
                    try
                    {
                        resource.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                setInfo();
                resource.setFlag(true);
                resource.notify();
            }
        }
    }

    public void setInfo()
    {
        if (i == 0)
        {
            resource.setName("Sage");
            resource.setGender("Male");
        }
        else
        {
            resource.setName("Candy.......");
            resource.setGender("Female.......");
        }
        System.out.println(Thread.currentThread().getName() + "!!!!!!!!!!!!!" + resource.getName() + ">>>>>>>>" + resource.getGender());
        i = (i + 1) % 2;
    }
}

class Consumer implements Runnable
{
    private Resource resource;

    public Consumer(Resource resource)
    {
        this.resource = resource;
    }

    @Override
    public void run()
    {
        while (true)
        {
            /**
             * 将当前对象resource作为锁进行同步
             */
            synchronized (resource)
            {
                /**
                 * 判断标记位的值
                 */
                if (!resource.isFlag())
                {
                    try
                    {
                        resource.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                show();
                resource.setFlag(false);
                resource.notify();
            }
        }
    }

    public void show()
    {
        System.out.println(Thread.currentThread().getName() + resource.getName() + ">>>>>>>>" + resource.getGender());
    }
}
