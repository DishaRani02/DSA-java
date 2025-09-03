import java.util.*;
public class syntaxWithParameter{
    public static int calculateSum(int num1, int num2){
            int sum = num1 + num2;
            return sum;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number:");
    int b = sc.nextInt();
    // System.out.println("The sum of two numbers is:");
    // int sum = a+b;
    // System.out.println(sum);
    int result = calculateSum(a, b);
    System.out.println(result);
}
}
