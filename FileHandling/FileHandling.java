package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("file1.txt");
        fw.write("Hello World");
        fw.close();
    }
    
}
