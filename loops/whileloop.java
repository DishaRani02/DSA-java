import java.util.Scanner;

public class whileloop {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter last number to be printed: ");
    int range = sc.nextInt();
    System.out.println("Numbers are:");
    int counter = 1;
    while(counter<= range){
        System.out.println(counter + " ");
        counter++;
    }
    }
    }
