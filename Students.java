import java.util.Scanner;

public class Students {
    String name;
    int rollno;

    public Students(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student rollno: " + rollno);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students[] studentArray = new Students[5];  // array of 5 students

        // Input loop
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = sc.nextLine();

            System.out.println("Enter roll number of student " + (i + 1) + ":");
            int rollno = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            studentArray[i] = new Students(name, rollno); // store in array
        }

        // Output loop
        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            studentArray[i].display();
            System.out.println();
        }

        sc.close(); // always close the Scanner
    }
}
