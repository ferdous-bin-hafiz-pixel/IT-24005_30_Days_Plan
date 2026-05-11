import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {

        //LinkedList
        LinkedList<String> names = new LinkedList<>();

        // elements
        names.add("Rahim");
        names.add("Karim");
        names.add("Salam");

        // Displaying 
        System.out.println("LinkedList Elements:");

        for(String name : names) {
            System.out.println(name);
        }
    }
}