public class Engine {
    public void start() {
        System.out.println("Encendiendo el vehículo");
    }

    public void start(boolean silentMode) {
        if (silentMode) {
            System.out.println("Esta encendiendo en modo silencioso");
        } else {
            System.out.println("Encendiendo el vehículo");
        }
    }
}
