package actividades;
import java.util.Scanner;
@SuppressWarnings("resource")

public class TareaNavidad {
    public static void copa(char a, int f) {
        int simbolos, esp;
        for(int i=1;i<=f;i++){ //altura y arbolito
            for (esp = 1+i; esp <= f; esp++) //espacios en blanco 
                System.out.print(" ");
            for (simbolos = 1; simbolos < i*2; simbolos++) { //símbolos a mostrar (total = simbolos - 1 = doble de la fila - 1) 
                System.out.print(a); 
            }
            System.out.println();
        }//fin for altura
    }
    //TO-DO: Tronco: altura = f/3 y anchura = (simbolos - 1) / 3.
    //TO-DO: Centrar árbol y tronco: medida terminal = 80 caracteres.
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        char simbolo;
        int filas;
        System.out.print("Introduzca el símbolo con el que quiere formar su árbol: ");
        simbolo = scanner.next().charAt(0);
        System.out.print("Introduzca el número de filas a realizar: ");
        filas = scanner.nextInt();
        copa(simbolo, filas);
    } //fin main
}
//CÓMO ABORDAR EL PROBLEMA: Se debe centrar conforme se dibuja cada línea: función imprimirLineaCentrada. Función de copa debe devolver un array con ancho y altura del tronco del árbol. Caca pene tetas sexo xd