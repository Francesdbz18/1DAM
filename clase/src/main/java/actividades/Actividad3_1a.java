package actividades;
import java.util.Scanner;
@SuppressWarnings("resource")

public class Actividad3_1a { //ACTIVIDADES PROPUESTAS 3 - 01 a)
    public static void triangulin(char a, int f) {
        for(int i=1;i<=f;i++){ //altura
            for (int simbolos = 0; simbolos < i; simbolos++) { //símbolos a mostrar
                System.out.print(a); 
            }
            System.out.println();
        }//fin for altura
    }//fin procedimiento
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        char simbolo;
        int filas;
        System.out.print("Introduzca el símbolo con el que quiere formar su triángulo: ");
        simbolo = scanner.next().charAt(0);
        System.out.print("Introduzca el número de filas a realizar: ");
        filas = scanner.nextInt();
        triangulin(simbolo, filas);
    } //fin main
} //fin clase
