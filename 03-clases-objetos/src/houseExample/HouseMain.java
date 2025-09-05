package houseExample;

public class HouseMain {
    public static void main(String[] args) {
        House myHouse = new House(2, 4, 10);

        System.out.printf("La cantidad de puertas de la casa es: %d\n", myHouse.getDoors());
        myHouse.openDoor();
        double area = myHouse.calculateArea();

        System.out.printf("El área de la casa es: %f", area);
    }
}
