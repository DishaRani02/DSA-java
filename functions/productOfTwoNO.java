import java.util.Scanner;

public class productOfTwoNO {
    public static int product(int a, int b){
        int num1 = a;
        int num2 = b;
        return num1*num2;
    }
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int result = product(a, b);
        System.out.println("The product is:" +result);
        

    }
}
