package actividades;

public class Actividad3_2Burbuja {
    public static int[] bubblesort(int[] numbers) {
        boolean swapped = true;
        int temp;
        for (int i = numbers.length-1; i>0 && swapped; i--) {
            swapped = false;
            for (int j = 0; j<i; j++) {  //cambiar a j > i para versión ascendiente
                if (numbers[j] < numbers[j+1]) {
                temp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers [j+1] = temp;
                swapped = true;
                }
            }
        }
        return numbers;
    }
    public static int [] bubblesort2 (int[] numbers) {
        int i = 0;
        int j = numbers.length-1;
        int temp;
        boolean swapped = true;
        while(i>j &&swapped) { //cambiar a i<j para versión descendiente
            swapped = false;
            for (int k = i; k<j; k++) {
                if(numbers[k]>numbers[k+1]) {
                    temp = numbers[k];
                    numbers [k] = numbers [k+1];
                    numbers [k+1] = temp;
                    swapped = true;
                }//fin if
            }//fin for
            j--;
            if(swapped) {
                swapped = false;
                for (int k = j; k>i; k--) {
                    if(numbers[k] < numbers [k-1]) {
                        temp = numbers[k];
                        numbers [k] = numbers [k-1];
                        numbers [k-1] = temp;
                        swapped = true;
                    }//fin if
                } //fin for
            }//fin if
            i++;
        }//fin while
        return numbers;
    }
    static void imprimirArrayUni(int a[], int length) {
        System.out.print("El resultado del array es: [");
        for (int i = 0; i<length;i++) {
            System.out.print(a[i]);
            if (i<length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int [] array = {10, 1, 5, 40, 12, 34, 44, 12, 11, 91};
        int longitud = array.length;

        bubblesort(array);
        imprimirArrayUni(array, longitud);
        System.out.println("\nVersión mejorada: ");
        bubblesort2(array);
        imprimirArrayUni(array, longitud);
    }
}
