package tema3arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = {10, 1, 5, 40, 12, 34, 44, 12, 11, 91};
        int longitud = array.length;
        Funciones.bubblesort2Asc(array);
        Funciones.imprimirArrayUni(array, longitud);
    }
}