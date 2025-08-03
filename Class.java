// Class definition
public class Car {
    // Attributes (variables)
    String color;
    String model;
    int year;

    // Method to set details
    void setDetails(String c, String m, int y) {
        color = c;
        model = m;
        year = y;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Create object
        myCar.setDetails("Red", "Toyota", 2022); // Set values
        myCar.displayDetails(); // Print values
    }
}
