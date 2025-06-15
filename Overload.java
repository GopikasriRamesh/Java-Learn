import java.util.Scanner;

public class Overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For two-number addition
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of two numbers: " + add(a, b));

        // For three-number addition
        System.out.println("Enter three numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Sum of three numbers: " + add(x, y, z));
        
        sc.close();
    }

    // Method 1: Adds 2 numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds 3 numbers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
