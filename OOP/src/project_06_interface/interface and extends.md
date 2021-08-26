## 接口和抽象类的思想

> 笔记本电脑USB接口的例子
1. 接口的出现对功能实现了扩展
2. 接口的出现定义了规则
3. 接口的出现降低了耦合性

### 1. 接口的出现实现了解耦
- 一方使用规则，例如笔记本使用USB接口的规则
- 另一方实现规则，鼠标厂商实现接口的规则

### 2. 接口和抽象类的区别
- 抽象类对子类的**基础功能**进行了抽取和定义，抽象类中还可以定义非抽象方法
- 接口对类的**扩展功能**进行了抽取和定义，只能定义抽象方法，负责功能的扩展
- 类与类之间是继承关系，是 **is a** 的关系
- 类与接口之间是实现关系，是 **like a** 的关系

例如：导盲犬，缉毒犬都属于**犬类**，二者都具备吃饭和吼叫的功能，则可将此类基础功能抽象到父类中。
但是缉毒犬具有**缉毒**的扩展功能，这时应该将缉毒的功能抽象成接口；导盲犬具有**导盲**的功能，应该将导盲的功能抽取到接口中。

1. 先定义犬类：
```java
/**
 * 抽象方法定义犬类的基础功能
 */
abstract class 犬
{
    public abstract void 吼叫();

    public abstract void 吃饭();
}
```
2.1 定义导盲功能接口：
```java
/**
 * 导盲定义导盲功能
 */
interface 导盲able
{
    void 导盲();
}
```
2.2 定义缉毒功能接口：
```java
/**
 * 接口定义缉毒功能
 */
interface 缉毒able
{
    void 缉毒();
}
```
3.1 定义导盲犬类：
```java
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
```
3.2 定义缉毒犬类：
```java
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
```

4. 主函数new对象并调用方法：
```java
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
```
输出结果：
```text
导盲犬吃饭
导盲犬吼叫
导盲犬导盲ing
缉毒犬吃饭
缉毒犬吼叫
缉毒犬缉毒ing
```