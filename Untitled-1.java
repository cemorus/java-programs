package com.example.shapes;
public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int area() {
        return length * breadth;
    }
}
// Main.java
import com.example.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.printf("\nArea of rectangle is: %d", rect.area());
    }
}
