class Outer {
    static int data = 50;

    static class Inner {
        void show() {
            System.out.println("Data: " + data);
        }
    }
}

public class TestStaticInner {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner(); 
        obj.show();
    }
}