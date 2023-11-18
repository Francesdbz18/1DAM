package actividades;
import java.util.Scanner;
@SuppressWarnings("resource")

public class Actividad2_3c {
    public static int serieFORcustom (int a, int b) {
        int suma = 0;
        while (a<b) {
            a+=3;
            if (a<=b-3) {
            System.out.print(a+", ");
            } else System.out.print(a + "\n");
            suma = suma + a;
        } //fin while
        return suma;
    } //fin funcion
    public static int serieFORcustomfull (int a, int b, int c) {
        int suma = 0;
        while (a < b) {
            a+=c;
            if (a<=b-c) {
            System.out.print(a+", ");
            } else System.out.print(a + "\n");
            suma = suma + a;
        } //fin while
        return suma;
    } //fin funcion
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
            System.out.println("La suma es: " +serieFORcustom(a, b));
       else if (opcion == 'B' || opcion == 'b') {
            System.out.print("Introduzca el número de la serie: ");
            c = teclado.nextInt();
            System.out.printf("La suma es: %d", serieFORcustomfull(a, b, c)); 
        } //Fin elif
       else System.out.println("Saliendo..."); 
    } //fin main
} //fin class

