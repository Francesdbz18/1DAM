package actividades;
import java.util.Scanner;
@SuppressWarnings("resource")
public class Actividad2_5 {
    public static boolean parImpar(int n){
        boolean esPar;
        if (n%2==0) {
            esPar = false;

        } else {
            esPar = true;
        }
        return esPar;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String numCadena = "";
        int suma = 0;
        int par = 0;
        int impar = 0;
        boolean valido = true;
        System.out.print ("Ingrese los números que desee sumar o S para salir: ");
        while (valido != false) {
            numCadena = teclado.nextLine();
            if (numCadena.equalsIgnoreCase("S")){
                valido = false;
            } else {
                int n = Integer.parseInt(numCadena);
                suma += n;
                if (parImpar(n)==true) par++;
                else impar++;
            }
        }
        System.out.println("\nLa suma de todos los numeros ingresados es " +suma+".");
        System.out.println(par+" números son pares.\n"+impar+" números son impares.");
    }
}