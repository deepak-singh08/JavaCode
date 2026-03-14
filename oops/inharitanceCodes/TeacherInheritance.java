class Teacher {

    void teach() {
        System.out.println("Teaching Students");
    }
}

public class TeacherInheritance
extends Teacher {

    void subject() {
        System.out.println("Java Programming");
    }

    public static void main(String[] args) {

        TeacherInheritance t =
            new TeacherInheritance();

        t.teach();
        t.subject();
    }
}
