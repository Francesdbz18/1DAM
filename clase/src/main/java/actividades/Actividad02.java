package actividades;

import java.util.Scanner;
@SuppressWarnings("resource")

public class Actividad02 {
    public static String ordenalfabetico () {
        String enorden;
        char a, b;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Introduzca la primera letra: ");
        a = teclado.next().charAt(0);
        System.out.print("Introduzca la segunda letra: ");
        b = teclado.next().charAt(0);
        if (b == a+1 ) {
            enorden = "Están en orden alfabético.";
        } else {
            enorden = "No están en orden alfabético.";
        }
        return enorden;
    }
    public static void main (String[] args){
        String cuca;
        cuca = ordenalfabetico();
        System.out.println(cuca);
    }
}
