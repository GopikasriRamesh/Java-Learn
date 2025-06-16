import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Print numbers from 0 to 99 and sum even numbers
        int sum = 0;
        for (int i = 0; i <=100; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers from 0 to 100: " + sum);

        // 2. Reverse a digit
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        int reverse = 0;
        int original = n; // store original for display

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reversed number of " + original + " is: " + reverse);
        sc.close();
    }
}
