class Person {

    void details() {
        System.out.println("Person Details");
    }
}

public class PersonInheritance
extends Person {

    void student() {
        System.out.println("Student Details");
    }

    public static void main(String[] args) {

        PersonInheritance p =
            new PersonInheritance();

        p.details();
        p.student();
    }
}