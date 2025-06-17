import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num; // Store the number for comparison
        int sum = 0;

        int numberOfDigits = String.valueOf(num).length();

        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, numberOfDigits);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println("Armstrong Number.");
        } else {
            System.out.println("Not Armstrong Number.");
        }

        sc.close();
    }
}
