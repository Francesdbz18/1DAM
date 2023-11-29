package actividades;
import java.util.Scanner;
import java.lang.Math;

public class Tarea3Arbol {
    public static void mostrarArbol(int filas, char simbolo) {
        for (int i = 0; i < filas; i++) {
            imprimirArbol((i*2) + 1, simbolo);
        }
    }
    public static void mostrarTronco(int filas, char simbolo) {
        int ancho = Math.round((float)((filas * 2) - 1) / 3);
        int altura = (int) Math.ceil((float)filas / 3);
        // Imprimir tronco del árbol centrado
        for (int i = 0; i < altura; i++) {
            imprimirArbol(ancho, simbolo);
        }
    }
    public static void imprimirArbol(int ancho, char simbolo) {
        int consola = 80;
        int espacio = (ancho%2!=0)? (int)(consola - ancho)/2:(int)((consola - ancho)/2)-1;
        
        for (int i = 0; i < espacio; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < ancho; i++) {
            System.out.print(simbolo);
        }
        if (ancho % 2 == 0) System.out.print(simbolo); //Para centrar completamente el árbol, añade un símbolo a la derecha para cuadrarlo con la copa del árbol
        System.out.println();
    }
}
