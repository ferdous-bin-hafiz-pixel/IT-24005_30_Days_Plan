import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Displaying
        System.out.println("ArrayList Elements:");

        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}