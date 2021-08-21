package test.lambok;

/**
 * @author g84196891
 */
public class StudentTest
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.setName("sage");
        student.setAge(23);
        System.out.println(student);

        Teacher teacher = new Teacher();
        teacher.setName("Lily");
        teacher.setDescription("she is our teacher");
        teacher.setAge(23);
        System.out.println(teacher);

    }
}
