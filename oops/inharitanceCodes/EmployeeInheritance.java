class Employee {

    int salary = 50000;
}

public class EmployeeInheritance
extends Employee {

    int bonus = 10000;

    public static void main(String[] args) {

        EmployeeInheritance e =
            new EmployeeInheritance();

        System.out.println(
            e.salary + e.bonus
        );
    }
}