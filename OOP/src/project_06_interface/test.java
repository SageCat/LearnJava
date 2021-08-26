package project_06_interface;

public class test
{
    public static void main(String[] args)
    {
        导盲犬 导盲犬 = new 导盲犬();
        缉毒犬 缉毒犬 = new 缉毒犬();

        导盲犬.吃饭();
        导盲犬.吼叫();
        导盲犬.导盲();

        缉毒犬.吃饭();
        缉毒犬.吼叫();
        缉毒犬.缉毒();
    }
}

/**
 * 抽象方法定义犬类的基础功能
 */
abstract class 犬
{
    public abstract void 吼叫();

    public abstract void 吃饭();
}

/**
 * 接口定义缉毒功能
 */
interface 缉毒able
{
    void 缉毒();
}

/**
 * 导盲定义导盲功能
 */
interface 导盲able
{
    void 导盲();
}

/**
 * 定义导盲犬类，继承 犬类 并实现 导盲able 接口
 */
class 导盲犬 extends 犬 implements 导盲able
{

    @Override
    public void 吼叫()
    {
        System.out.println("导盲犬吼叫");
    }

    @Override
    public void 吃饭()
    {
        System.out.println("导盲犬吃饭");
    }

    @Override
    public void 导盲()
    {
        System.out.println("导盲犬导盲ing");
    }
}

/**
 * 定义缉毒犬类，继承自 犬类 并实现 缉毒able 接口
 */
class 缉毒犬 extends 犬 implements 缉毒able
{

    @Override
    public void 吼叫()
    {
        System.out.println("缉毒犬吼叫");
    }

    @Override
    public void 吃饭()
    {
        System.out.println("缉毒犬吃饭");
    }

    @Override
    public void 缉毒()
    {
        System.out.println("缉毒犬缉毒ing");
    }
}