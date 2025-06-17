import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num; //stores original number
        int reverse = 0;

        while (temp != 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }
        if (num == reverse) {
            System.out.println("Palindrome Number.");
        } else {
            System.out.println("Not a Palindrome Number.");
        }

        sc.close();
    }
}
