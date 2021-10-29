package project16_collection_basic;

import java.util.*;

/**
 * @author g84196891
 */
public class LearnList
{
    public static void main(String[] args)
    {
        List arrayList = new ArrayList();
        show(arrayList);

    }

    /**
     * This is a function show.
     * @param arrayList - the input list
     * @author g84196891
     */
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

        System.out.println("-------------------------");
        /**
         * list特有的取元素方法
         */
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }

        System.out.println("-------------------------");
        /**
         * List 及其子类
         *  Vector 效率低下，已被ArrayList取代
         *  ArrayList
         *  LinkedList
         */

        Vector<String> strings = new Vector<>();
        System.out.println(strings.capacity());
        System.out.println(strings.size());
        strings.add("abc1");
        strings.add("abc2");
        strings.add("abc3");
        strings.add("abc4");

        /**
         * 因名字太长，被Iterator接口取代
         */
        Enumeration<String> elements = strings.elements();
        while(elements.hasMoreElements())
        {
            System.out.println(elements.nextElement());
        }
        System.out.println("-------------------------");

        /**
         * LinkedList
         */
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Sage1");
        stringLinkedList.add("Sage2");
        stringLinkedList.add("Sage3");
        stringLinkedList.add("Sage4");
        stringLinkedList.addFirst("Sage5");
        Iterator<String> iterator = stringLinkedList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
