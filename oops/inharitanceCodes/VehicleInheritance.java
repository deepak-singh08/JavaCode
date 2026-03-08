class Vehicle {

    void speed() {
        System.out.println("Vehicle Speed");
    }
}

public class VehicleInheritance extends Vehicle {

    void car() {
        System.out.println("Car Running");
    }

    public static void main(String[] args) {

        VehicleInheritance v =
            new VehicleInheritance();

        v.speed();
        v.car();
    }
}
