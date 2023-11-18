package actividades;
import java.util.Scanner;
@SuppressWarnings("resource")
public class Actividad2_3b {
    public static void serieFORcustom (int a, int b) {
        int suma = 0;
        for (a = a; a<=b; a+=3) {
            if (a<b-1) {
            System.out.print(a+", ");
            } else {System.out.print(a + "\n");}
            suma = suma + a;
        }
        System.out.println(suma);
    }
    public static void serieFORcustomfull (int a, int b, int c) {
        int suma = 0;
        for (a = a; a<=b; a+=c) {
            if (a<b-1) {
            System.out.print(a+", ");
            } else {System.out.print(a + "\n");}
            suma = suma + a;
        }
        System.out.println(suma);
    }
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       char opcion;
       int a, b, c;
       System.out.println("Escriba A si quiere usar la versión 1, B si quiere usar la version 2: ");
       opcion=teclado.next().charAt(0);
       System.out.print("Introduzca el número de inicio de la serie: "); 
       a = teclado.nextInt();
       System.out.print("\nIntroduzca el número final de la serie: ");
       b = teclado.nextInt();
       if (opcion == 'a' || opcion == 'A')
            serieFORcustom(a, b);
       else if (opcion == 'B' || opcion == 'b') {
            System.out.print("Introduzca el número de la serie: ");
            c = teclado.nextInt();
            serieFORcustomfull(a, b, c); 
        }
       else {
            System.out.println("Saliendo...");
        }
    }
}
