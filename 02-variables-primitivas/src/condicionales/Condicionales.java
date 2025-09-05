package condicionales;

public class Condicionales {
    public static void main(String[] args) {
        int age = 10;
        double average = 7.5;

        boolean isAdult = age > 17;
        boolean hasPassingGrade = average >= 7;

        if (isAdult) {
            System.out.println("Es mayor a 18");
        } else if (age <= 0) {
            System.out.println("No es válido");
        } else {
            System.out.println("Es menor a 18");
        }

        if (isAdult && hasPassingGrade) {
            System.out.println("El estudiante cumple con todos los requerimientos");
        }

        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Lunes");
            case 2:
                System.out.println("Martes");
            case 3:
                System.out.println("Miercoles");
            case 4:
                System.out.println("Jueves");
            case 5:
                System.out.println("Viernes");
            case 6:
                System.out.println("Sabado");
            case 7:
                System.out.println("Domingo");
            default:
                System.out.println("El dato ingresado no es válido");
        }
    }
}
