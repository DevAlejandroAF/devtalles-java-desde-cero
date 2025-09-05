package scannerExample;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int b = sc.nextInt();

        System.out.printf("La suma de %d y %d es %d", a, b, (a+b));
    }
}
