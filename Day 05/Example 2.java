class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class TestOverriding {
    public static void main(String[] args) {
        Animal a;
        a = new Dog(); // parent reference, child object

        a.sound(); // runtime decision
    }
}