// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another derived class
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal a; // Reference of base class

        a = new Dog(); // Polymorphism
        a.sound(); // Output: Dog barks

        a = new Cat(); // Polymorphism
        a.sound(); // Output: Cat meows
    }
}
