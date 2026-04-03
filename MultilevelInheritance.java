public class MultilevelInheritance {
    
}
class A {
    void show() { System.out.println("A"); }
}
class B extends A {
    void display() { System.out.println("B"); }
}
class C extends B {
    void print() { System.out.println("C"); }
}

    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
        obj.print();
    }
}