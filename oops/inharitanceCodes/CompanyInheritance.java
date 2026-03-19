class Company {

    void companyName() {
        System.out.println("Google");
    }
}

public class CompanyInheritance
extends Company {

    void employee() {
        System.out.println("Software Engineer");
    }

    public static void main(String[] args) {

        CompanyInheritance c =
            new CompanyInheritance();

        c.companyName();
        c.employee();
    }
}
