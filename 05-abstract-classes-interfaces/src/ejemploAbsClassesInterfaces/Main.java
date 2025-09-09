package ejemploAbsClassesInterfaces;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Fiat", "Uno Way", 2019) {
            @Override
            public void drive() {
                System.out.println("Estoy conduciendo!");
            }
        };

        System.out.println(vehicle.toString());

        Vehicle myVehicle = new ElectricCar("Fiat", "Duna", 2025, Color.RED, VehicleStatus.AVAILABLE, 80);

        System.out.println(myVehicle.toString());
    }
}
