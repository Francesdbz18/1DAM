package actividades;
import java.lang.Math;
import java.util.Arrays;
public class Ejemplo01STR {
    public static void main (String [] args) {
        String texto = "Hola mundo";
        System.out.println("La longitud es: "+texto.length());

        //Se cuenta desde 0 hasta length-1
        System.out.println(texto.charAt(1));

        //Obtener una palabra de la cadena
        char buffer[] = new char [5];
        texto.getChars(5, 9, buffer, 0);
        System.out.println("El buffer copiado es: "+ Arrays.toString(buffer));

        //Comparaciones
        String nombre1 = "Juan";
        String nombre2 = "Juan";
        if (nombre1.equalsIgnoreCase(nombre2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }

        //CompareTo:
        //devuelve 0 si son iguales
        //devuelve negativo si el string es menor
        //devuelve positivo si el string es mayor
        if (nombre1.compareTo(nombre2)==0) {
            System.out.println("son iguales");
        } else if (nombre1.compareTo(nombre2)<0) {
            System.out.println("el primero es menor que el segundo");
        } else {
            System.out.println("el primero es mayor que el segundo");
        }

        //Conversión de variables a String
        System.out.println(String.valueOf(Math.PI));

        //BUSCAR CONTENIDO
        String sTexto= "palabra1 palabra2 palabra3";
        String busqueda = "palabra2";//contenido a buscar
        int contador = 0;//contador de ocurrencias

        while (sTexto.indexOf(busqueda) > -1) {
            sTexto = sTexto.substring(sTexto.indexOf(busqueda)+busqueda.length());
            contador++;
        } //fin del while
        System.out.println("El contador es: " +contador);
    }
}