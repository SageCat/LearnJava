package project_07_polymorphism;

/**
 * 多态的出现是为了解决程序的可扩展性，具体体现为 父类引用指向子类对象，对象既有父类属性，又有子类属性
 * <p>
 * 多态的好处：提高了程序的可扩展性
 *
 * 多态的弊端：通过父类引用操作子类对象时，只能调用父类中已有的方法，不能调用子类特有的方法
 *
 * 多态的前提：
 *  1. 必须有继承或实现的关系
 *  2. 通常都有重写操作
 *
 *  父类引用指向子类对象时，如何运行子类的特有方法？
 *  1. 父类引用指向子类对象时，称为子类对象的 向上转型，转型后隐藏了子类型，提高了扩展性，但是却只能调用父类定义过的方法，不能调用子类特有的方法了；
 *  2. 对象向上转型后，若想调用子类特有的方法，可以向下转型后再调用。
 *
 *  向下转型的注意事项：
 *  为了避免触发 ClassCastException，在进行向下转型之前应 使用 if(objectName instanceof className)对对象做类型的判断
 */

/**
 * @author g84196891
 */
public class PolyMorPhismDemo
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        callAnimalEatMethod(dog);
        dog.lookHome();

        Cat cat = new Cat();
        callAnimalEatMethod(cat);
        cat.miaojiao();

        /**
         * 向上转型
         */
        Animal dog1 = new Dog();
        callAnimalEatMethod(dog1);
        /**
         * 强制向下转型
         */
        if (dog1 instanceof Dog)
        {
            Dog dog11 = (Dog) dog1;
            dog11.lookHome();
        }

    }

    public static void callAnimalEatMethod (Animal animal)
    {
        /**
         * 因为子类对父类中的 eat() 方法进行了重写，所以在这里父类的引用调用的是子类重写后的方法。
         */
        animal.eat();
    }

}

/**
 * 定义Animal父类
 */
abstract class Animal
{
    public abstract void eat();
}

/**
 * 定义Dog类继承自Animal
 */
class Dog extends Animal
{

    @Override
    public void eat()
    {
        System.out.println("Dog is eating");
    }

    public void lookHome()
    {
        System.out.println("Dog is looking home");
    }
}

/**
 * 定义Cat类继承自Animal
 */
class Cat extends Animal
{

    @Override
    public void eat()
    {
        System.out.println("Cat is eating");
    }

    public void miaojiao()
    {
        System.out.println("Cat is miaoing");
    }
}
