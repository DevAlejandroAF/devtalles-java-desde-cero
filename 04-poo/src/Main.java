public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", "Corolla", 2021, 4);
        Vehicle myMotorcycle = new Motorcycle("Honda", "CBR 190", 2021, false);

        ((Car)myCar).start();
        ((Motorcycle)myMotorcycle).start();

        printVehicle(myCar);
        printVehicle(myMotorcycle);
    }

    public static void printVehicle(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }
}
