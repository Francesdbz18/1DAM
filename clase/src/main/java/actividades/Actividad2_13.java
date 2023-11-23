package actividades;
import java.util.Scanner;
@SuppressWarnings("resource")
public class Actividad2_13 {
    public static double factorial (int n) {
        double fact = 1;
        for (int i = 1; i<=n; i++) {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero entero para calcular su factorial: ");
        int n = teclado.nextInt();
        System.out.println("El factorial de "+n+" es: "+factorial(n));
    }
}
