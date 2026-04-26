class MathOperation {

    // Method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 parameters (overloaded)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class TestOverloading {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();

        System.out.println("Sum (2 numbers): " + m.add(5, 3));
        System.out.println("Sum (3 numbers): " + m.add(5, 3, 2));
    }
}