class Outer {
    private String message = "Hello from Outer class";

    class Inner {
        void display() {
            System.out.println(message);
        }
    }
}

public class TestInner {
    public static void main(String[] args) {
        Outer o = new Outer();          
        Outer.Inner i = o.new Inner();  
        i.display();
    }
}