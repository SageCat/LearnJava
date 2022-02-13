package learn_duotai;

public class TestAnimal
{
    public static void main(String[] args)
    {
/*
        Animal animal_cat = new Cat();
        Animal animal_dog = new Dog();

        // 执行父类具备的方法
        animal_cat.eat();
        animal_dog.eat();
        System.out.println("========================");

        //父类引用无法执行子类特有的方法，因此需要向下转型才能执行子类特有方法
        executeLowerClassMethod(animal_cat);
        executeLowerClassMethod(animal_dog);
        System.out.println("========================");

        new Animal();
        new Animal();

 */


        Animal cat = new Cat();
        System.out.println("=============");
        Animal cat1 = new Cat();


        String s1 = "abc";
        String s2 = null;
        System.out.println(s1.equals(s2));




    }

/*    public static void executeLowerClassMethod(Animal animal)
    {
        if (animal instanceof Cat)
        {
            Cat cat = (Cat) animal;
            // 执行 Cat 类特有方法
            cat.catchMouse();
        }
        else if (animal instanceof Dog)
        {
            Dog dog = (Dog) animal;
            // 执行 Dog 类特有方法
            dog.watchHouse();
        }
    }*/
}
