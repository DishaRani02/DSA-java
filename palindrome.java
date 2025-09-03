public import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String input = sc.nextLine();

        boolean isPalindrome = true;
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.print("isPalindrome");
        } else {
            System.out.print("notPalindrome");
        }

        sc.close();
    }
} {
    
}
