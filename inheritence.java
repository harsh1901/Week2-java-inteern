// Base class (Parent)
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

// Derived class (Child)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class to run
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak(); // Inherited method
        d.bark();  // Dog's own method
    }
}
