package actividades;
import java.util.Scanner;
public class Actividad2_15 {
    public static Scanner teclado = new Scanner(System.in);
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
    public static double factorial (int n) {
        double fact = 1;
        for (int i = 1; i<=n; i++) {
            fact = fact*i;
        }
        return fact;
    }
    public static void esBisiesto (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " es bisiesto.");
        } else {
            System.out.println(year + " no es bisiesto.");
        }
    }
    public static void menu () {
        int num = 0;
        System.out.print("1. Muestra si un número es primo o no.\n2. Calcula el factorial de un número\n3. Muestra si un año es bisiesto o no.");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
            System.out.print("Ingrese un numero entero positivo para saber si es primo o no: ");
            num = teclado.nextInt();
            boolean primo = nPrimo(num);
            if (primo) System.out.println(num + " es un numero primo");
            else System.out.println(num+ " no es un número primo.");
            break;
            case 2:
            System.out.print("Ingrese el valor de N en la formula del factorial: ");
            num = teclado.nextInt();
            System.out.println("El factorial de "+num+" es: "+factorial(num));
            break;
            case 3: 
            System.out.print("Ingrese el año a verificar si es bisiesto: ");
            num = teclado.nextInt();
            esBisiesto(num);
            break;
            default:
            System.out.println("Opcion invalida, vuelva a intentarlo");
            break;
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
