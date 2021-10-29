import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author g84196891
 */
public class LearnGenericDemo
{
    public static void main(String[] args)
    {
        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person("sage", 10));
        personTreeSet.add(new Person("sage1", 18));
        personTreeSet.add(new Person("sage2", 14));
        personTreeSet.add(new Person("sage3", 16));
        personTreeSet.add(new Person("sage", 10));

        for (Iterator<Person> it = personTreeSet.iterator(); it.hasNext(); )
        {
            Person person = it.next();
            System.out.println(person.toString());
        }

        GenericTool<Person> personGenericTool = new GenericTool<>();
        personGenericTool.setE(new Person("sage", 10));


    }
}
