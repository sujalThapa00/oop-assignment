abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
    double calculateArea() { return Math.PI * radius * radius; }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }
    double calculateArea() { return length * width; }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { base = b; height = h; }
    double calculateArea() { return 0.5 * base * height; }
}

abstract class Payment {
    abstract void validate();
    abstract void pay(double amount);
}

class CreditCard extends Payment {
    void validate() { System.out.println("Validating credit card."); }
    void pay(double amount) { System.out.println("Paid $" + amount + " via Credit Card."); }
}

class PayPal extends Payment {
    void validate() { System.out.println("Validating PayPal."); }
    void pay(double amount) { System.out.println("Paid $" + amount + " via PayPal."); }
}

class BankTransfer extends Payment {
    void validate() { System.out.println("Validating Bank Transfer."); }
    void pay(double amount) { System.out.println("Paid $" + amount + " via Bank Transfer."); }
}

abstract class Vehicle {
    abstract double calculateRent(int days);
}

class Car extends Vehicle {
    double calculateRent(int days) { return days * 50; }
}

class Motorcycle extends Vehicle {
    double calculateRent(int days) { return days * 30; }
}

class Bicycle extends Vehicle {
    double calculateRent(int days) { return days * 10; }
}

abstract class MenuItem {
    abstract void prepare();
    abstract void serve();
}

class Appetizer extends MenuItem {
    void prepare() { System.out.println("Preparing Appetizer..."); }
    void serve() { System.out.println("Serving Appetizer."); }
}

class MainCourse extends MenuItem {
    void prepare() { System.out.println("Cooking Main Course..."); }
    void serve() { System.out.println("Serving Main Course."); }
}

class Beverage extends MenuItem {
    void prepare() { System.out.println("Pouring Beverage..."); }
    void serve() { System.out.println("Serving Beverage."); }
}

abstract class ShapeManipulator {
    abstract void resize();
    abstract void rotate();
}

class CircleShape extends ShapeManipulator {
    void resize() { System.out.println("Resizing Circle."); }
    void rotate() { System.out.println("Rotating Circle."); }
}

class Square extends ShapeManipulator {
    void resize() { System.out.println("Resizing Square."); }
    void rotate() { System.out.println("Rotating Square."); }
}

class TriangleShape extends ShapeManipulator {
    void resize() { System.out.println("Resizing Triangle."); }
    void rotate() { System.out.println("Rotating Triangle."); }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Geometry {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(double base, double height, boolean type) {
        return 0.5 * base * height;
    }
}

class Employee {
    double baseSalary = 3000;
    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double bonus = 1000;
    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Account {
    double balance;
    Account(double b) { balance = b; }
    double calculateInterest() {
        return balance * 0.02;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(double b) { super(b); }
    @Override
    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends Account {
    FixedDepositAccount(double b) { super(b); }
    @Override
    double calculateInterest() {
        return balance * 0.06;
    }
}

class Character {
    void attack() {
        System.out.println("Basic Attack");
    }
}

class Warrior extends Character {
    @Override
    void attack() {
        System.out.println("Warrior slashes with a sword!");
    }
}

class Mage extends Character {
    @Override
    void attack() {
        System.out.println("Mage casts a fireball!");
    }
}

abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() {
        System.out.println("Piano plays melody.");
    }
}

class Guitar extends Instrument {
    void playSound() {
        System.out.println("Guitar strums chords.");
    }
}

class Violin extends Instrument {
    void playSound() {
        System.out.println("Violin plays smooth tune.");
    }
}

public class AllInOneDemo {
    public static void main(String[] args) {
        // 1. Shape Area
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Triangle(3, 7);
        System.out.println("Circle Area: " + s1.calculateArea());
        System.out.println("Rectangle Area: " + s2.calculateArea());
        System.out.println("Triangle Area: " + s3.calculateArea());

        // 2. Payment Methods
        Payment p1 = new CreditCard();
        p1.validate(); p1.pay(150);
        Payment p2 = new PayPal();
        p2.validate(); p2.pay(100);

        // 3. Car Rental
        Vehicle v = new Car();
        System.out.println("Car Rent (3 days): $" + v.calculateRent(3));

        // 4. Menu Item
        MenuItem m = new MainCourse();
        m.prepare(); m.serve();

        // 5. Shape Manipulation
        ShapeManipulator sm = new Square();
        sm.resize(); sm.rotate();

        // 6. Calculator
        Calculator c = new Calculator();
        System.out.println("Add int: " + c.add(2, 3));
        System.out.println("Add double: " + c.add(2.5, 3.5));
        System.out.println("Add three ints: " + c.add(1, 2, 3));

        // 7. Geometry
        Geometry g = new Geometry();
        System.out.println("Area of Circle: " + g.calculateArea(7));
        System.out.println("Area of Rectangle: " + g.calculateArea(4, 5));
        System.out.println("Area of Triangle: " + g.calculateArea(6, 2, true));

        // 8. Payroll
        Employee e = new Manager();
        System.out.println("Manager Salary: $" + e.calculateSalary());

        // 9. Banking Interest
        Account a = new SavingsAccount(5000);
        System.out.println("Savings Interest: $" + a.calculateInterest());

        // 10. Game Character
        Character ch = new Mage();
        ch.attack();

        // 11. Music Instrument
        Instrument i = new Violin();
        i.playSound();
    }
}
