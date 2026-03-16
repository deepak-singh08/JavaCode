class Fruit {

    void taste() {
        System.out.println("Sweet");
    }
}

public class FruitInheritance
extends Fruit {

    void color() {
        System.out.println("Red");
    }

    public static void main(String[] args) {

        FruitInheritance f =
            new FruitInheritance();

        f.taste();
        f.color();
    }
}
