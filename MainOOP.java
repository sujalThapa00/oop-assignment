// Circle Class
class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

// Simple Interest Class
class SimpleInterest {
    private double principal, rate, time;

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public double getTime() {
        return time;
    }

    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

// Dog Class
class Dog {
    private String name, breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}

// Main Class to Run All
public class MainOOP {
    public static void main(String[] args) {
        // Circle Test
        Circle c = new Circle();
        c.setRadius(7);
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Circle Circumference: " + c.calculateCircumference());

        // Simple Interest Test
        SimpleInterest si = new SimpleInterest();
        si.setPrincipal(10000);
        si.setRate(5);
        si.setTime(2);
        System.out.println("\nSimple Interest: " + si.calculateInterest());

        // Dog Test
        Dog dog1 = new Dog("Max", "Labrador");
        Dog dog2 = new Dog("Bella", "Beagle");

        dog1.setName("Rocky");
        dog2.setBreed("Poodle");

        System.out.println("\nDog 1: " + dog1.getName() + " - " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + " - " + dog2.getBreed());
    }
}
