package actividades;
import java.util.Scanner;
import java.lang.Math;

/**
* Imprime un árbol de navidad con el símbolo y altura de la copa deseados por el usuario.
* @author: Francesco Fevoli
* @version: 1.0
*/


public class Tarea3Arbol {
    static Scanner teclado = new Scanner (System.in); //Declara el Scanner teclado como variable global para su uso en todo el programa.

    /**
    * Imprime una línea con los espacios en blanco y símbolos requeridos.
    * @param ancho el ancho del árbol o el tronco.
    * @param simbolo el símbolo con el que debe rellenar la figura.
    */
    public static void imprimirArbol(int ancho, char simbolo) { //Recibe el ancho de lo que se quiere imprimir (copa o tronco) y el símbolo con el que se quiere rellenar.
        int espacio = 0, i = 0, j = 0, consola = 0;
        consola = 80; //Está indicado en el enunciado el supuesto de que la consola mide 80 caracteres.
        espacio = (ancho%2!=0)? (int)(consola - ancho)/2:(int)((consola - ancho)/2)-1; //La variable espacio define cuántos espacios en blanco deben imprimirse a la izquierda. Si el ancho es par, se resta uno para cuadrar el relleno del tronco con la punta de la copa. Si no es par, se procede directamente con la resta del ancho a la longitud de la consola, en este caso 80 caracteres.
        for (i = 0; i < espacio; i++) {
            System.out.print(" ");
        } //Fin for.
        for (j = 0; j < ancho; j++) {
            System.out.print(simbolo);
        } //FIn for.
        if (ancho % 2 == 0){
            System.out.print(simbolo); //Para centrar completamente el árbol, añade un símbolo a la derecha para cuadrarlo con la copa del árbol
        } //Fin if.
        System.out.println();
    }//Fin del procedimiento imprimirArbol.

    /**
    * Usa el método imprimirArbol para mostrar en pantalla la copa del árbol completa.
    * @param filas las filas de altura de la copa que desea el usuario.
    * @param simbolo el símbolo con el que debe rellenar la figura.
    */
    public static void mostrarCopa(int filas, char simbolo) {
        int k;
        for (k = 0; k < filas; k++) {
            imprimirArbol((k*2) + 1, simbolo);
        } //Fin del for.
    }//Fin del procedimiento mostrarArbol.

    /**
    * Usa el método imprimirArbol para mostrar en pantalla el tronco del árbol completo.
    * @param filas las filas de altura de la copa que desea el usuario.
    * @param simbolo el símbolo con el que debe rellenar la figura.
    */
    public static void mostrarTronco(int filas, char simbolo) {
        int l, ancho, altura;
        ancho = Math.round((float)((filas * 2) - 1) / 3); //El ancho de la última fila del árbol es igual al doble del número de filas menos 1. Se divide entre 3 para lograr el ancho deseado del tronco.
        altura = Math.round((float)filas / 3); //Se usa Math.round para redondear el ancho del tronco y su altura al entero más próximo.
        // Imprimir tronco del árbol centrado
        for (l = 0; l < altura; l++) {
            imprimirArbol(ancho, simbolo);
        } //Fin del for.
    }//Fin del procedimiento mostrarTronco.

    /**
    * Menú de opciones. El usuario elige si imprimir un árbol o salir del programa.
    */
    public static void menu () {
        char opcion = 'a';
        System.out.println("Bienvenido. Este programa imprime un árbol de navidad en la consola con el símbolo y la altura que elija.");
        while (opcion != 'b') {
            System.out.println("a. Imprimir árbol");
            System.out.println("b. Salir del programa");
            System.out.print("Escoja su opción: ");
            opcion = teclado.next().charAt(0);
            opcion = Character.toLowerCase(opcion); //Pasa el caracter leído a minúsculas para evitar errores.
            switch (opcion) {
                case 'a':
                    int filas;
                    char simbolo;
                    System.out.print("Introduzca el símbolo con el que quiere formar su árbol: ");
                    simbolo = teclado.next().charAt(0);
                    System.out.print("Introduzca el número de filas a realizar: ");
                    filas = teclado.nextInt();
                    mostrarCopa(filas, simbolo);
                    mostrarTronco(filas, simbolo);
                    break;
                case 'b':
                    System.out.println("Saliendo... ¡Felices fiestas!");
                    break;
                default:
                    System.out.println("ERROR: Elija una opción válida.");
                    break;
            }//Fin del switch.
        }//Fin del while.
    } //Fin del procedimiento menu.

    public static void main(String[] args) {
        menu();
    } //Fin del método principal main.
} //Fin de la clase Tarea3Arbol.
