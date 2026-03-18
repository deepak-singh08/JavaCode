class Hospital {

    void services() {
        System.out.println("Medical Services");
    }
}

public class HospitalInheritance
extends Hospital {

    void doctor() {
        System.out.println("Heart Specialist");
    }

    public static void main(String[] args) {

        HospitalInheritance h =
            new HospitalInheritance();

        h.services();
        h.doctor();
    }
}
