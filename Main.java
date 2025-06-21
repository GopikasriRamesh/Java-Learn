public class Main {

    // Base class
    static class Shape {
        public void draw() {
            System.out.println("Drawing a shape");
        }
    }

    // Subclass Circle overrides draw()
    static class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }

    // Subclass Rectangle overrides draw()
    static class Rectangle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a rectangle");
        }
    }

    // Main method to test polymorphism
    public static void main(String[] args) {
        Shape s1 = new Circle();     // Upcasting to Shape
        Shape s2 = new Rectangle();  // Upcasting to Shape

        s1.draw();  // Output: Drawing a circle
        s2.draw();  // Output: Drawing a rectangle
    }
}
