class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student x = new Student();
        x.id = IT-24005;
        x.name = "Ferdous";

        x.display(); 
    }
}