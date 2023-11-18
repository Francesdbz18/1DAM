package actividades;

import java.util.Scanner;
@SuppressWarnings("resource")

public class Actividad01 {
    public static void mayormenor () {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduzca el primer número entero: ");
        n1 = teclado.nextInt();
        System.out.print("Introduzca el segundo número entero: ");
        n2 = teclado.nextInt();
        System.out.print("Introduzca el tercer número entero: ");
        n3 = teclado.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es "+n1);
            } else {
                System.out.println("El mayor es "+n3);
            }
        } else if (n2 > n3) {
            System.out.println("El mayor es "+n2);
        } else {
            System.out.println("El mayor es "+n3);
        }
    }
    
     public static void main (String[] args) {
        mayormenor();
     }
}
