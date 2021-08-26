package project_05_OOP;

/**
 * @author g84196891
 */
public class StaticDemo
{
    /*
     * 主函数特点：
     * 1. 格式是固定的
     * 2. 被jvm识别和调用
     * 3. 修饰符
     *      public：因为main函数的权限必须是最大
     *      static：不需要对象，只需要根据主函数所属类名直接调用
     *      void: 没有返回值
     *      String[] args: 主函数的参数列表，是一个数组类型的参数，且元素都是字符串类型
     * */

    public static void main(String[] args)
    {
        Person person = new Person();
        person.name = "xiaoqiang";
        person.show();

        Person person2 = new Person();
        person2.country = "US";
        person2.show();

    }
}


class Person
{
    String name;  // 又名成员变量 或 实例变量

    /*
     * static特点：
     * 1. 是一个修饰符，用于修饰成员和方法
     * 2. static修饰的成员被所有对象所共享
     * 3. static修饰的成员优先于对象而存在，因为其在类加载时就已经存在
     * 4. static修饰的成员可以直接被类名调用
     * 5. static修饰的数据是共享数据，对象中存储的是特有的数据
     * */

    static String country = "CN"; // 又名静态变量 或 类变量

    /*
     * 成员变量和静态变量的区别：
     * 1. 生命周期不同
     *   成员变量随着对象的创建而存在，随着对象的消失而消失
     *   静态变量随着类的加载而存在，随着类的消失而消失，声明周期比成员变量长
     * 2. 调用方式不同
     *   成员变量只能被对象调用
     *   静态变量可以被对象调用，也可以被类名直接调用
     * 3. 别名不同
     *   成员变量也称为实例变量
     *   静态变量也称为类变量
     * 4. 存储位置不同
     *   成员变量存储在堆内存中，所以是对象的特有数据
     *   静态变量存储在方法区的静态区，所以也叫对象的共享数据
     * */

    /*
     * static使用注意事项：
     * 1. 静态方法只能访问静态成员（包含静态变量和静态方法），非静态方法既可以访问静态成员，也可以访问非静态成员
     * 2. 静态方法中不可以使用this和super关键字，因为没有对象
     * 3. 主函数是静态的
     * */

    public void show()
    {
        System.out.println(country + ":" + name);
    }

}