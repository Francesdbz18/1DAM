package tema3arrays;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String [] nombres = {"Juanito", "Jorgito", "Pancracio", "Petronilo"};
        System.out.println("Array de nombrecitos: " +Arrays.toString(nombres));
        Arrays.sort(nombres);
        System.out.println("Array ordenado: "+Arrays.toString(nombres));
        Arrays.sort(nombres, Collections.reverseOrder());
        System.out.println("Array ordenado de forma descendente: "+Arrays.toString(nombres));
    }
}