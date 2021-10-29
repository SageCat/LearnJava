package project_10_string;

/**
 * @author g84196891
 */
public class LearnString
{
    public static void main(String[] args)
    {
        String s1 = "abc";
        // 产生一个对象，在常量池中产生对象
        String s2 = "abc";
        System.out.println(s1 == s2);

        // 产生两个对象， 在堆内存中产生对象
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s3 == s4);

        // String类覆写了Object中的equals方法，用于比较字符串的内容，而不是对象地址
        System.out.println(s3.equals(s4));


//        String a1 = new String("abc");
        String a1 = "abc";
        String a2 = a1.intern();
        System.out.println(a1 == a2);
    }
}
