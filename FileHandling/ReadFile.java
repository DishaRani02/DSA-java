package FileHandling;
import java.io.BufferReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {
    public static void main(String[] args)throws IOException {
        BufferReader br = new BufferReader(new FileReader("file1.txt"));
    System.out.println(br.ReadFile());
    br.close();
    }
}
