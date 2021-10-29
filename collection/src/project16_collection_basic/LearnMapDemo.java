package project16_collection_basic;

import java.util.*;

/**
 * @author g84196891
 */
public class LearnMapDemo
{
    public static void main(String[] args)
    {
//        Map<Integer, String> integerStringMap = new HashMap<>(2);
//        methodTest(integerStringMap);


        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("aaaa");
        stringArrayList.add("bcdf");
        stringArrayList.add("a");
        stringArrayList.add("cb");
        stringArrayList.add("d");
        Collections.sort(stringArrayList);

        System.out.println(stringArrayList);

//        Arrays.equals(integerStringMap, integerStringMap);
    }

    private static void methodTest(Map<Integer, String> map)
    {
        // 添加元素
        String value = map.put(123, "sage0");
        map.put(1234, "sage1");
        map.put(12345, "sage2");
        System.out.println(value); // null
        System.out.println(map);

        // 删除元素
        map.remove(123);
        System.out.println(map);
        System.out.println(map.remove(123));

        // 判断元素
        System.out.println(map.containsKey(1234));
        System.out.println(map.containsValue("sage1"));

        // 获取元素
        System.out.println("get value of 12345: " + map.get(12345));
        System.out.println("map 集合的大小："  + map.size());


        System.out.println(">>>>>>>>>>>>>>");
        // 获取所有键，再通过键获取值
        Set<Integer> integerSet = map.keySet();
        for (Integer i : integerSet)
        {
            System.out.println("key: " + i + "  value: " + map.get(i));
        }

        // 通过 Map.Entry 获取 key 和 value 的对应关系，使其具备迭代器功能
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);
        System.out.println(map);
        for (Map.Entry<Integer, String> next : entries)
        {
            System.out.println(next.getKey() + "-------" + next.getValue());
        }

        Collection<String> values = map.values();
        System.out.println(values);
    }
}

class CompareByLength implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2)
    {
        int temp = o1.length() - o2.length();
        return temp == 0 ? o1.compareTo(o2) : temp;
    }
}


