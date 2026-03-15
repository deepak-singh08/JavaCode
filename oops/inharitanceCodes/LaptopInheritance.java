class Laptop {

    void brand() {
        System.out.println("HP Laptop");
    }
}

public class LaptopInheritance
extends Laptop {

    void processor() {
        System.out.println("i5 Processor");
    }

    public static void main(String[] args) {

        LaptopInheritance l =
            new LaptopInheritance();

        l.brand();
        l.processor();
    }
}
