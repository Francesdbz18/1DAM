package actividades;
import java.util.Scanner;
@SuppressWarnings("resource")
public class Actividad2_4 {
    public static char comp (int a) {
        char es;
        if (a > 17 && a < 66 ) es = 'd';
            else if (a > 65) es = 'M';
            else es = 'm';
        return es;
    }
    public static void main(String[] args) {
        int a; int menor = 0; int mayor = 0; int entre = 0;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Introduzca diez números enteros, pulsando la tecla Entrar tras cada uno: ");
        for (int i=0 ; i<=9 ; i++) {
            a = teclado.nextInt();//MEJORA: cambiar esto por un switch
            if (comp(a)=='d') entre++;
            else if (comp(a)=='M') mayor++;
            else menor++;
        }
        System.out.printf("%d número(s) está(n) entre 18 y 65.\n%s número(s) es/son mayor(es) que 65.\n%s número(s) es/son menor(es) que 18.", entre, mayor, menor);
    }
 }

