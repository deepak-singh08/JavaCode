interface Animal {

    void sound();
}

class Dog {

    void bark() {
        System.out.println("Dog Barks");
    }
}

public class HybridInheritance extends Dog
implements Animal {

    public void sound() {
        System.out.println("Animal Sound");
    }

    public static void main(String[] args) {

        HybridInheritance h =
            new HybridInheritance();

        h.sound();
        h.bark();
    }
}
