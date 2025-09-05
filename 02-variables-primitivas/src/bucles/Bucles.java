package bucles;

public class Bucles {
    public static void main(String[] args) {
        // for
        final int MAX_NUMBER = 5;
        for (int current = 0; current < MAX_NUMBER; current++) {
            System.out.printf("Valor: %d\n", current);
        }
        System.out.println("Termina for\n");

        // while
        int counter = 0;
        int acumulador = 0;
        while (counter < 5) {
            System.out.printf("Counter: %d\n", counter);
            acumulador = acumulador + counter;
            counter++;
        }
        System.out.println("Termina while");
        System.out.printf("Acumulador: %d\n\n", acumulador);

        // do while
        int counter2 = 0;
         do {
             System.out.printf("Counter 2: %d\n", counter2);
             counter2++;
         } while (counter2 < 5);
        System.out.println("Termina do while\n");
    }
}
