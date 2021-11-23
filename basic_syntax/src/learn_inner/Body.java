package learn_inner;

public class Body
{
    int num = 10; // 外部类的成员变量

    class Heart
    {
        int num = 20; // 内部类的成员变量
        // 内部类方法
        public void heartMethod()
        {
            int num = 30; // 内部类成员方法的局部变量
            System.out.println("内部类成员方法的局部变量 num 是 " + num); // 局部变量采用就近原则
            System.out.println("内部类成员变量 num 是 " + this.num); // 内部类的成员变量
            System.out.println("外部类成员变量 num 是 " + Body.this.num); // 外部类的成员变量
        }
    }
}
