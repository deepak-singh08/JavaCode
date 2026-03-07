class Parent {

    void display() {
        System.out.println("Parent Class");
    }
}

class Child1 extends Parent {

    void show1() {
        System.out.println("Child1 Class");
    }
}

public class HierarchicalInheritance extends Parent {

    void show2() {
        System.out.println("Child2 Class");
    }

    public static void main(String[] args) {

        HierarchicalInheritance h =
            new HierarchicalInheritance();

        h.display();
        h.show2();
    }
}