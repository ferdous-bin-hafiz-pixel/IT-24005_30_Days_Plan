class Rectangle {
    int length;
    int width;

    int calculateArea() {
        return length * width;
    }
}

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(); 
        r.length = 10;
        r.width = 5;

        System.out.println("Area = " + r.calculateArea());
    }
}