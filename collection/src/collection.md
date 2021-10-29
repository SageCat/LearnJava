# 集合和框架

## 1. 集合的由来
>对象用于封装特有数据，但是对象一旦多了就需要管理和存储，如果对象的个数不确定，就使用集合或容器进行存储
因此，集合是用来存储和管理对象的
## 2. 集合的特点
1. 集合是用于存储对象的容器（每一个集合都定义了自己的存储方式和结构）
2. 集合的长度是可变的（`数组的长度不可变`）
3. 集合中不可以存储基本数据类型值，只能存储引用型数据
4. 集合中存储的是**对象的地址**，因此可以存储`任意类型`的对象
## 3. 迭代器
迭代器取对象的方法
迭代的过程中，不可以对集合进行修改
- 若想要在迭代的过程中对集合进行修改，则需要使用Iterator的子类ListIterator
```java
import java.util.Iterator;

public class CollectionBasicDemo
{
    public static void main(String[] args)
    {
        /**
         * 使用ArrayList创建一个容器对象，并向其中添加3个字符串对象
         */
        Collection arrayList = new ArrayList();
        arrayList.add("abc1");
        arrayList.add("abc2");
        arrayList.add("abc3");

        /**
         * 创建容器ArrayList的迭代器
         */
        Iterator iterator = arrayList.iterator();

        /**
         * 迭代器第1种取对象的方法
         */
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        /**
         * 迭代器第2种取对象的方法
         */
        for (Iterator iterator1 = arrayList.iterator(); iterator1.hasNext();)
        {
            System.out.println(iterator1.next());
        }

        /**
         * 使用增强的for循环获取对象
         */
        for (Object o : arrayList)
        {
            System.out.println(o);
        }
    }
}
```
> 迭代器的剖析

是通过**内部类**进行实现的，调用者不需要关心内部类是如何定义的，只需要通过iterator()方法获取到迭代器，使用其中的方法即可
每一个种类的容器均有自己独特的定义内部类的方式

## 4. List 
> 元素有序，有index 
>
> 可以有重复元素

### List的功能和方法
- 增
`add()`
- 删
`remove()`
- 改
`set()`
- 查
`get(index)`
`indexOf(object)`
`subList(from, to)`
```java
public class LearnList
{
    public static void main(String[] args)
    {
        List arrayList = new ArrayList();
        show(arrayList);

    }

    private static void show(List arrayList)
    {
        /**
         * 添加元素
         */
        System.out.println("Add elements >>>>>>>>>>>");
        arrayList.add("hello");
        arrayList.add(" world,");
        arrayList.add("Sage");
        System.out.println(arrayList);
        /**
         * 插入元素
         */
        System.out.println("Insert elements >>>>>>>>>>>>>>");
        arrayList.add(1, "hahahahaahaha");
        System.out.println(arrayList);
        /**
         * 删除元素
         */
        System.out.println("Remove elements >>>>>>>>>>>>>>>>>");
        arrayList.remove(2);
        System.out.println(arrayList);
        /**
         * 修改元素
         */
        System.out.println("Modify elements >>>>>>>>>>>>>>>>>");
        arrayList.set(0, "hi");
        System.out.println(arrayList);
        /**
         * 查询元素
         */
        System.out.println("Query elements >>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.subList(0, 2));
        /**
         * list特有的取元素方法
         */
        System.out.println("-------------------------");
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }
    }
}
```
### List的子类
- Vector ： 线程安全，但是效率低下，内部是数组结构，已过时。增删和查询都很慢。
- ArrayList ： 线程不安全， 效率较高，内部是数组结构，取代Vector。查询元素的速度很快。
- LinkedList： 线程不安全，内部是链表结构，增删速度很快。

## 5. Set 
> 元素不可重复，没有角标，是无序的

Set接口中的方法和Collection一致
- HashSet
- TreeSet

## 6. Map<K,V>
> Map称为**双列集合**， Collection属于**单列集合**

1. Map每次添加对象时，是添加 Key 和  Value 一对数据
2. Map中的key是**唯一的**，需要用**Set**集合存储Key
3. Map中的value可以是**不唯一的**，需要用**Collection**集合来存储
- 增加
```text
value put(key, value)
返回前一个和key相关联的值，若无，则返回null
```
- 删除
```text
void clear()
删除所有元素
value remove(key)
根据指定的key删除键值对
```
- 判断
```text
boolean containsKey(key)
boolean containsValue(value)
boolean isEmpty()
```
- 获取
```text
value get(key)
通过指定key获取对应的值，若没有改键对应的值，则返回null
int size()
获取集合中的键值对的个数
```
### 常用Map子类
- HashTable：内部结构是哈希表，线程安全；不允许null键，允许null值
- HashMap：内部结构是哈希表，非线程安全；允许null键，允许null值
- TreeMap：内部结构式二叉树，非线程安全；可以对Map集合中的键进行排序

### Map.Entry 
```java
public class LearnMapDemo
{
    public static void main(String[] args)
    {
        // 通过 Map.Entry 获取 key 和 value 的对应关系，使其具备迭代器功能
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);
        System.out.println(map);
        
        for (Map.Entry<Integer, String> next : entries)
        {
            System.out.println(next.getKey() + "-------" + next.getValue());
        }
    }
}
```