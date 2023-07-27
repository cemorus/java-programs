interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
    }
}
