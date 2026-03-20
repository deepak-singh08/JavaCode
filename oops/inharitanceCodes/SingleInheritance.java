package oops.inharitanceCodes;

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

public class SingleInheritance extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        SingleInheritance d =
            new SingleInheritance();

        d.sound();
        d.bark();
    }
}