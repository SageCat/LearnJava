package learn_duotai;

// 子类Cat
public class Cat extends Animal
{
    // 覆写父类方法
    @Override
    public void eat()
    {
        System.out.println("猫吃鱼");
    }

    // Cat子类特有方法
    public void catchMouse()
    {
        System.out.println("猫捉老鼠");
    }
}
