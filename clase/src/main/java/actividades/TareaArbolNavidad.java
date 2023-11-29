package actividades;

import java.util.Scanner;

public class TareaArbolNavidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar entrada de usuario
        System.out.print("Ingrese la altura de la copa del árbol: ");
        int alturaCopa = scanner.nextInt();
        System.out.print("Ingrese el símbolo de relleno: ");
        char simboloRelleno = scanner.next().charAt(0);
        // Crear y mostrar el árbol de Navidad
        crearArbolNavidad(alturaCopa, simboloRelleno);
        // Cerrar el scanner
        scanner.close();
    }
    
    public static void crearArbolNavidad(int alturaCopa, char simboloRelleno) {
        // Imprimir copa del árbol centrada
        for (int i = 0; i < alturaCopa; i++) {
            imprimirLineaCentrada(2 * i + 1, simboloRelleno);
        }
        // Calcular dimensiones del tronco
        int anchoTronco = alturaCopa * 2 / 3;
        int alturaTronco = alturaCopa / 3;
        // Imprimir tronco del árbol centrado
        for (int i = 0; i < alturaTronco; i++) {
            imprimirLineaCentrada(anchoTronco, simboloRelleno);
        }
    }

    public static void imprimirLineaCentrada(int longitud, char caracter) {
        int anchoConsola = 80;
        int margenIzquierdo = (anchoConsola - longitud) / 2;
        for (int i = 0; i < margenIzquierdo; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < longitud; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
}

