import java.util.Scanner;

public class sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter last number of the series:");
        int range = sc.nextInt();
        int counter = 1;
        while(counter <= range){
            sum = sum + counter;
            counter++; 
        }
        System.out.println("The sum is: "+ sum);

    }
}
