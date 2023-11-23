package actividades;
import java.util.Scanner;
@SuppressWarnings({"resource", "variable"})
public class Actividad2_14 {
    public static boolean nPrimo (int n) {
        boolean esprimo = false;
        if (n%n == 0 && n%1 == 0) {
            for (int i=2; i<n; i++) {
                if(n % i == 0){
                    esprimo = false;
                    break;
                } else esprimo = true;
            }
        }
        return esprimo;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero entero para calcular su factorial: ");
        int n = teclado.nextInt();
        boolean esprimo = nPrimo(n);
        if (esprimo) System.out.println(n+ " es primo.");
        else System.out.println(n+ " no es primo.");
    }
}
