import java.util.*;

public class IncomeTax {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income: ");
        int income = sc.nextInt();
        int tax;

        if(income < 5000000) {tax = 0;
        }
        else if(income >= 5000000 && income < 1800000){
            tax = (int) (income*0.2) ;
        }

        else tax = (int) (income*0.3) ;
        System.out.println("Tax for this income is: " + tax);
    }
}