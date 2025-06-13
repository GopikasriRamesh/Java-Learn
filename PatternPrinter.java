import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, rows;

        System.out.println("Choose a pattern to print:");
        System.out.println("1. Right-angled Triangle");
        System.out.println("2. Square");
        System.out.println("3. Number Pyramid");
        System.out.println("4. Reverse Number Pyramid");
        System.out.print("Enter your choice (1-4): ");
        choice = sc.nextInt();

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        System.out.println(); // Line break

        switch (choice) {
            case 1:
                printRightAngledTriangle(rows);
                break;
            case 2:
                printSquare(rows);
                break;
            case 3:
                printNumberPyramid(rows);
                break;
            case 4:
                printReverseNumberPyramid(rows);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }

    // 1. Right-angled triangle
    public static void printRightAngledTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Square pattern
    public static void printSquare(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Number pyramid
    public static void printNumberPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 4. Reverse number pyramid
    public static void printReverseNumberPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
