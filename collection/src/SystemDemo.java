import java.util.Properties;
import java.util.Set;

/**
 * @author g84196891
 */
public class SystemDemo
{
    public static void main(String[] args)
    {
        /* 自1970年1月1日到现在的毫秒值 */
        System.out.println(System.currentTimeMillis());

        /*

         */
        Properties properties = System.getProperties();
        Set<String> strings = properties.stringPropertyNames();
        for (String name : strings)
        {
            String value = properties.getProperty(name);
            System.out.println(name + " = " + value);
        }
    }
}
