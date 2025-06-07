// 1. Vehicle and Car (Single Inheritance)
class Vehicle1 {
    void drive() {
        System.out.println("Vehicle is being driven.");
    }
}
class Car1 extends Vehicle1 {
    void display() {
        System.out.println("This is a Car. Brand: Toyota, Model: Corolla.");
    }
}
class Main1 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.drive();
        car.display();
    }
}

// 2. Employee and HRManager (Method Overriding)
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
    double getSalary() {
        return 30000.0;
    }
}
class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing HR tasks.");
    }
}
class Main2 {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: $" + hr.getSalary());
    }
}

// 3. Geometry Calculator (Multilevel Inheritance)
class Shape1 {
    void calculateArea() {
        System.out.println("Calculating area...");
    }
}
class Rectangle1 extends Shape1 {
    int length = 5;
    int width = 4;
    void calculateArea() {
        System.out.println("Rectangle area: " + (length * width));
    }
}
class Square extends Rectangle1 {
    int side = 5;
    void calculateArea() {
        System.out.println("Square area: " + (side * side));
    }
}
class Main3 {
    public static void main(String[] args) {
        Square square = new Square();
        square.calculateArea();
    }
}

// 4. Hierarchical Inheritance - Vehicle
class Vehicle2 {
    void startEngine() {
        System.out.println("Engine started.");
    }
    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}
class Car2 extends Vehicle2 {
    void drive() {
        System.out.println("Driving a car.");
    }
}
class Motorcycle extends Vehicle2 {
    void ride() {
        System.out.println("Riding a motorcycle.");
    }
}
class Main4 {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.startEngine();
        car.drive();
        car.stopEngine();

        Motorcycle bike = new Motorcycle();
        bike.startEngine();
        bike.ride();
        bike.stopEngine();
    }
}

// 5. Shape Hierarchy
class Shape2 {
    double calculateArea() {
        return 0;
    }
}
class Rectangle2 extends Shape2 {
    int length = 5;
    int width = 3;
    double calculateArea() {
        return length * width;
    }
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}
class Circle extends Shape2 {
    double radius = 4.0;
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
class Main5 {
    public static void main(String[] args) {
        Rectangle2 rect = new Rectangle2();
        System.out.println("Rectangle area: " + rect.calculateArea());
        System.out.println("Rectangle perimeter: " + rect.calculatePerimeter());

        Circle circle = new Circle();
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle circumference: " + circle.calculateCircumference());
    }
}

// 6. Book Types
class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class FictionBook extends Book {
    FictionBook(String title, String author) {
        super(title, author);
    }
}
class NonFictionBook extends Book {
    NonFictionBook(String title, String author) {
        super(title, author);
    }
}
class TechnicalBook extends Book {
    TechnicalBook(String title, String author) {
        super(title, author);
    }
}
class Main6 {
    public static void main(String[] args) {
        FictionBook fb = new FictionBook("The Hobbit", "J.R.R. Tolkien");
        NonFictionBook nfb = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook tb = new TechnicalBook("Effective Java", "Joshua Bloch");

        fb.displayDetails();
        nfb.displayDetails();
        tb.displayDetails();
    }
}
