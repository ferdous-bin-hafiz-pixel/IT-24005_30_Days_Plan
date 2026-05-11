import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {

        // HashSet
        HashSet<String> fruits = new HashSet<>();

        //elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicate value

        // Displaying 
        System.out.println("HashSet Elements:");

        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}