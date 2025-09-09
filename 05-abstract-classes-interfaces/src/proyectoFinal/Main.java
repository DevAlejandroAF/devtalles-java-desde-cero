package proyectoFinal;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Fiat", "Uno Way", 2019, CarType.SEDAN);
        Vehicle myElectricCar = new ElectricCar("Tesla", "Model 3", 2025, CarType.SEDAN, 80);

        myCar.start();
        myElectricCar.start();

        ((ElectricCar)myElectricCar).chargeBattery();

        System.out.println(myCar);
        System.out.println(myElectricCar);
    }
}
