class Student {
    int id;
    String name;


    Student() {
        id = 100;
        name = "Default Name";
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.display();
    }
}