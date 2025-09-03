import java.util.Scanner;

public class reverse_of_no {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit to be reversed: ");
        int n = sc.nextInt();
        System.out.println("The reverse is: ");
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }
    }
}
