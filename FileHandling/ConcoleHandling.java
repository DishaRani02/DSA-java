package FileHandling;
import java.io.*;
public class ConcoleHandling {
    public static void main(String[] args) throws Exception{
        InputStreamReader r= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter your name");
        String name1=br.readLine();
        String name2=br.readLine();
        System.out.println("Enter your marks");
        int marks = Integer.parseInt(br.readLine());
        System.out.println("You are :"+name1+":"+name2+"and you have scored :"+marks+"marks");
        br.close();
    }
}