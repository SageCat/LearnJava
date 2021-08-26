package project_06_extends;

/**
 * @author g84196891
 */
public class ExtendsDemo02
{
    public static void main(String[] args)
    {
        Son son = new Son();
        son.show();
    }
}


/**
 * 当函数中出现字符类同名的函数，则会运行子类的函数，这种现象叫做函数的覆盖，也叫重写。 子类覆盖父类方法。
 *
 * 函数重写注意事项：
 * 1. 子类函数重写父类方法时，子类方法的权限一定要大于或等于父类方法的权限
 * 2. 子类非静态方法无法覆盖父类中的静态方法。即：静态方法只能被静态方法覆盖，非静态方法只能被非静态方法覆盖。
 */

/**
 * 什么时候用覆盖操作?
 * 当对一个类进行子类的扩展时，子类需要保留父类的功能声明，但要定义子类中该功能的特有功能时，需要采用覆盖操作。
 */

class Father
{
    public void show()
    {
        System.out.println("Father show function running");
    }
}

class Son extends Father
{
    /** 子类覆盖父类方法 */
    @Override
    public void show()
    {
        System.out.println("Son show function running");
    }
}
