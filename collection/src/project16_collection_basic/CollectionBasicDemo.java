package project16_collection_basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionBasicDemo
{
    public static void main(String[] args)
    {
        /**
         * 集合的由来：
         *  对象用于封装特有数据，但是对象一旦多了就需要管理和存储，如果对象的个数不确定，就使用集合或容器进行存储
         *
         * 集合的特点：
         *  1. 集合是用于存储对象的容器（每一个集合都定义了自己的存储方式和结构）
         *  2. 集合的长度是可变的
         *  3. 集合中不可以存储基本数据类型值，只能存储引用型数据
         */

        Collection arrayList = new ArrayList();
        arrayList.add("abc1");
        arrayList.add("abc2");
        arrayList.add("abc3");

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        for (Object o : arrayList)
        {
            System.out.println(o);
        }

        System.out.println(arrayList);

    }
}
