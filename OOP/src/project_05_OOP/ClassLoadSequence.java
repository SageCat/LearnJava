package project_05_OOP;

public class ClassLoadSequence
{
    public static void main(String[] args)
    {
        /**
         * 对象加载过程 1
         * 1. new Zi() 后 立即调用 Zi 类的构造方法
         * 2. 子类的构造方法中，默认先执行super()调用父类的构造方法。
         * 在下述案例中，父类构造方法调用了show()方法，该方法已被Zi类覆写，则直接调用子类的show()，
         * 子类的show()方法中引用的变量num在此时还尚未进行初始化，因此打印结果为： the num is 0
         * 3. 在子类的构造方法中，调用了super()后，立即对成员变量num进行初始化，赋值为10，
         * 因此子类的sout()方法打印出的结果为： Zi constructor num is 10
         */
        new Zi();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");

        /**
         * 对象加载过程 2
         * 1. new Zi() 后 立即调用 Zi 类的构造方法
         * 2. 子类的构造方法中，默认先执行super()调用父类的构造方法，在父类执行构造方法前，先执行父类的构造代码块，
         * 因此输出 Fu Constructor code is running............，之后再运行父类的构造函数
         * 在下述案例中，父类构造方法调用了show()方法，该方法已被Zi类覆写，则直接调用子类的show()，
         * 子类的show()方法中引用的变量num在此时还尚未进行初始化，因此打印结果为： the num is 0
         * 3. 在子类的构造方法中，调用了super()后，立即对成员变量num进行初始化，赋值为10，
         * 因此子类的sout()方法打印出的结果为： Zi constructor num is 10
         * 4. 成员变量初始化为10之后，立即执行构造代码块中的语句，在构造代码块中，num被初始化为 30
         * 5. 下一步sout()方法打印出的结果为： ZiSeq ......30
         */
        new ZiSeq();

    }
}

class Zi extends Fu
{
    int num = 10;

    public Zi()
    {
        /**
         * 这里系统默认调用 super()
         */
        super();
        /**
         * 调用super() 后 马上显示初始化 num 的值
         */
        System.out.println("Zi constructor num is " + num);
    }

    void show()
    {
        System.out.println("the num is " + num);
    }
}

class Fu
{
    public Fu()
    {
        show();
    }

    void show()
    {
        System.out.println("Fu show....");
    }
}


class ZiSeq extends FuSeq
{
    int num = 10;

    {
        System.out.println("ZiSeq constructor code is running");
        num = 30;
    }

    public ZiSeq()
    {
        System.out.println("ZiSeq ......" + num);
    }

    void show()
    {
        System.out.println("The number is " + num);
    }
}


class FuSeq
{
    {
        System.out.println("Fu Constructor code is running............");
    }
    public FuSeq()
    {
        System.out.println("Fu constructor is running");
        show();
    }

    void show()
    {
        System.out.println("Fu he he he");
    }

}