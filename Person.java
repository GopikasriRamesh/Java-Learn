public class Person {
    String name;
    int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Child class Emp extends Person
class Emp extends Person {
    int sal;

    // Constructor for Emp
    public Emp(String name, int age, int sal) {
        super(name, age);
        this.sal = sal;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + sal);
    }

    // Main method
    public static void main(String[] args) {
        Emp emp1 = new Emp("Sri", 20, 40000);
        emp1.display();
    }
}
