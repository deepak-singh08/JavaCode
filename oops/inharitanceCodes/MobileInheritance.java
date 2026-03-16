class Mobile {

    void company() {
        System.out.println("Samsung");
    }
}

public class MobileInheritance
extends Mobile {

    void model() {
        System.out.println("Galaxy");
    }

    public static void main(String[] args) {

        MobileInheritance m =
            new MobileInheritance();

        m.company();
        m.model();
    }
}
