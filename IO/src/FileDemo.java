import java.io.File;
import java.io.IOException;
import java.text.DateFormat;

public class FileDemo
{
    public static void main(String[] args) throws IOException
    {
        /*
        File常用方法
         */
        File file = new File("IO" + File.separator + "demo.txt");

        System.out.println("getPath: " + file.getPath());
        System.out.println("getAbsolutePath: " + file.getAbsolutePath());
        System.out.println("getName: " + file.getName());
        System.out.println("getParent: " + file.getParent());

        System.out.println("geFileSize: " + file.length());
        System.out.println("getLastModifyTime: " + file.lastModified());

        boolean newFile = file.createNewFile();

        System.out.println(DateFormat.getDateTimeInstance().format(file.lastModified()));
        System.out.println(newFile);

    }
}
