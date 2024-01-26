package radiofm;
import java.util.Scanner;
@SuppressWarnings ("resource")

/**
* Imprime por consola 6 emisoras de radio que varían según el usuario pida bajar o subir, en orden de frecuencia en la banda VHF de radio FM)
* @author: Francesco Fevoli
* @version: 1.0
*/

public class Main {

    /**
     * Crea el array de objetos RadioFM con seis emisoras preestablecidas, cada una con su nombre y frecuencia.
     * @return Emisoras: Array de objetos RadioFM con las emisoras.
     */
    public static RadioFM[] crearArrayRadio () {
        //Creación del array de emisoras
        RadioFM[] Emisoras = new RadioFM[6];
        Emisoras[0] = new RadioFM("Hit FM", 89.9);
        Emisoras[1] = new RadioFM("Cadena Dial", 91.7);
        Emisoras[2] = new RadioFM("Los40 Dance", 92.4);
        Emisoras[3] = new RadioFM("Radio Marca", 103.5);
        Emisoras[4] = new RadioFM("BOM Radio", 105.1);
        Emisoras[5] = new RadioFM("COPE", 106.3);
        return Emisoras;
    } // fin del método

    /**
     * Muestra la emisora actual, anterior y siguiente. Si es la última emisora, la siguiente será la primera. Si es la primera emisora, la anterior será la última.
     * @param emisora Array de objetos RadioFM con las emisoras de radio.
     * @param emisoraActual Índice para moverse por las posiciones del array emisora.
     */
    public static void mostrarEmisora (RadioFM[] emisora, int emisoraActual) {
        System.out.println("Actualmente está escuchando: "+emisora[emisoraActual].getNombre()+", "+emisora[emisoraActual].getFrecuencia()+" FM."); 

        if (emisoraActual == emisora.length-1) System.out.println("Emisora siguiente: "+emisora[0].getNombre()+", "+emisora[0].getFrecuencia()+" FM."); //Si la emisora actual es la de frecuencia más alta, la siguiente al usar la opción de subir será la de frecuencia más baja.
        else System.out.println("Emisora siguiente: "+emisora[emisoraActual+1].getNombre()+", "+emisora[emisoraActual+1].getFrecuencia()+" FM."); //En caso contrario, la siguiente en orden de frecuencia será la que se mostrará. 
        
        if (emisoraActual==0) System.out.println("Emisora anterior: "+emisora[emisora.length-1].getNombre()+", "+emisora[emisora.length-1].getFrecuencia()+" FM."); //Si la emisora actual es la de menor frecuencia, la siguiente al bajar será la de mayor frecuencia.
        else System.out.print("Emisora anterior: "+emisora[emisoraActual-1].getNombre()+", "+emisora[emisoraActual-1].getFrecuencia()+" FM.");
    }//fin del método

    /**
     * Se muestra cada vez que se inicia el programa. Muestra la emisora favorita ya establecida, la anterior a esta y la siguiente.
     * @param emisora Array de objetos RadioFM con las emisoras de radio.
     * @param emisoraActual Índice para moverse por las posiciones del array emisora.
     */
    public static void inicio (int emisoraActual, RadioFM[] emisora) {
        System.out.println("Bienvenido. La emisora favorita es: "+emisora[emisoraActual].getNombre()+", "+emisora[emisoraActual].getFrecuencia()+" FM.");

        if (emisoraActual == emisora.length-1) System.out.println("Emisora siguiente: "+emisora[0].getNombre()+", "+emisora[0].getFrecuencia()+" FM.");
        else System.out.println("Emisora siguiente: "+emisora[emisoraActual+1].getNombre()+", "+emisora[emisoraActual+1].getFrecuencia()+" FM.");

        if (emisoraActual==0) System.out.println("Emisora anterior: "+emisora[emisora.length-1].getNombre()+", "+emisora[emisora.length-1].getFrecuencia()+" FM.");
        else System.out.print("Emisora anterior: "+emisora[emisoraActual-1].getNombre()+", "+emisora[emisoraActual-1].getFrecuencia()+" FM.");
    }//fin del método

    /**
     * Menú con tres opciones: subir frecuencia, bajar frecuencia y salir del programa. Cada vez que se usan las dos primeras opciones se muestra emisora actual, anterior y siguiente.
     * @param radio Array de objetos RadioFM con las emisoras de radio.
     * @param emisoraActual Índice para moverse por las posiciones del array radio.
     */
    public static void menu (RadioFM[] radio, int emisoraActual) {
        Scanner teclado = new Scanner(System.in); //Inicia un Scanner para obtener datos del usuario.
        int option = 0;
        
        System.out.print("Opciones:\n1. Subir frecuencia.\n2. Bajar frecuencia.\n3. Salir.");
        
        while (option != 3) { //La elección de opciones se repite hasta que el usuario ingrese 3 para salir del programa.
            System.out.print("\nElija su opción: ");
            option = teclado.nextInt();
            System.out.println();
            
            switch (option) {
                case 1:
                        if (emisoraActual != radio.length-1) { //Si la emisora actual no es la de frecuencia mayor, aumenta la frecuencia. En caso contrario, vuelve al mínimo.
                        emisoraActual++;
                    } else {
                        emisoraActual = 0; 
                    }
                    mostrarEmisora(radio, emisoraActual);
                    break;
                case 2:
                    if (emisoraActual != 0) { //Si la emisora actual no es la de frecuencia menor, baja la frecuencia. De otro modo, pasa a la de frecuencia mayor.
                        emisoraActual--;
                    } else {
                        emisoraActual = radio.length - 1;
                    }
                    mostrarEmisora(radio, emisoraActual);
                    break;
                case 3:
                    System.out.println("Saliendo..."); //Sale del programa.
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor elija una de las opciones.");
                    break;
            } // fin switch
        } // fin while
    } // fin método

    /**
     * Método principal del programa. Aquí se usan los métodos creados y se crean variables locales para usarlas en los mismos.
     * @param args
     */
    public static void main(String[] args) {
        int emisoraActual = 2; //La emisora seleccionada inicia en la posición de la emisora favorita, Los40 Dance en este caso.
        RadioFM[] Radio = crearArrayRadio(); //Se genera el array de objetos con el método creado para hacerlo.

        inicio(emisoraActual, Radio); //Método que se muestra cada vez que inicia el programa con la emisora favorita.
        menu(Radio, emisoraActual); //Menú con todas las opciones del programa para el usuario.

    } //fin main
}//fin class