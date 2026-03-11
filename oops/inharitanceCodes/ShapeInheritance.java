class Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }
}

public class ShapeInheritance
extends Shape {

    void circle() {
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {

        ShapeInheritance s =
            new ShapeInheritance();

        s.draw();
        s.circle();
    }
}