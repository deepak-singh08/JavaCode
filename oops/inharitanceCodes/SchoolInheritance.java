class School {

    void schoolName() {
        System.out.println("DAV School");
    }
}

public class SchoolInheritance
extends School {

    void className() {
        System.out.println("ai engginer");
    }

    public static void main(String[] args) {

        SchoolInheritance s =
            new SchoolInheritance();

        s.schoolName();
        s.className();
    }
}