class College {

    void collegeName() {
        System.out.println("rayat bhara college");
    }
}

public class CollegeInheritance
extends College {

    void studentName() {
        System.out.println("Deepak");
    }

    public static void main(String[] args) {

        CollegeInheritance c =
            new CollegeInheritance();

        c.collegeName();
        c.studentName();
    }
}
