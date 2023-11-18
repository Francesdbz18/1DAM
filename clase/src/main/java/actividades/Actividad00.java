package actividades;
import java.util.Scanner;
@SuppressWarnings("resource")

public class Actividad00 {
    public static String parImpar(){
        Scanner teclado = new Scanner(System.in);
        int pene;
        String espar;
        System.out.print("Introduzca un número entero: ");
        pene = teclado.nextInt();
        if (pene%2==0) {
            espar = "Es par.";

        } else {
            espar = "Es impar.";
        }
        return espar;
    }
    public static void main (String[] args) {
        String parimpar = parImpar();
        System.out.print(parimpar);
    }
}
