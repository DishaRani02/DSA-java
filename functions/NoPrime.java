import java.util.Scanner;

public class NoPrime {
    public static void prime(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0){
                System.out.println("Not a prime no.");
                break;
            }
            else {
                System.out.println("Given no. is prime");
                break;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        prime(a);
    }
}
// import java.util.*;
// public class NoPrime{
//     public static boolean isPrime(int n){
//         boolean isPrime = true;
//         for(int i=2; i<n-1; i++){
//             if(n%i==0){
//                 isPrime = false;
//                 break;
//             }
//         }
//         return isPrime;
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter your number: ");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println(isPrime(a));
//     }
// }