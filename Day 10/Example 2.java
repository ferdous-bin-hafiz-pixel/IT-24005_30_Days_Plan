import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {

        // TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // elements
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        // Displaying 
        System.out.println("TreeSet Elements:");

        for(Integer n : numbers) {
            System.out.println(n);
        }
    }
}