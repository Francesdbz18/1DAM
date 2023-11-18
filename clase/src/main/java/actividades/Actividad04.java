package actividades;

import java.util.Scanner;
@SuppressWarnings("resource")

public class Actividad04 {
    public static int menu () {
        Scanner teclado = new Scanner (System.in);
        int opcion;
        System.out.print("Opciones:\n 1. Cambio de euros a pesetas.\n 2. Cambio de pesetas a euros.\n 0. Salir del programa.\n");
        opcion = teclado.nextInt();
        return opcion;
    }
    public static float peseteiro (int opcion) {
        float cambio = 0;
        Scanner teclado = new Scanner (System.in);
        if (opcion == 1) {
            System.out.println("Introduzca el número de euros a convertir en pesetas: ");
            cambio = teclado.nextFloat();
            cambio = (float) (cambio*166.38);
        } else if (opcion == 2) {
            System.out.println("Introduzca el número de euros a convertir en pesetas: ");
            cambio = teclado.nextFloat();
            cambio = (float) (cambio/166.386);
        } else {
            System.out.println("ERROR: Inténtelo de nuevo.");
        }
       return cambio;
}
    public static void main (String[] args) {
        float resultado = peseteiro(menu());
        System.out.printf("El resultado es: %.2f", resultado);
    }
}

