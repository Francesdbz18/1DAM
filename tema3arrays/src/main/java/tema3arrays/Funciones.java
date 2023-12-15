package tema3arrays;

public class Funciones {
    public static int[] bubblesortDesc(int[] numbers) {
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
    public static int[] bubblesortAsc(int[] numbers) {
        boolean swapped = true;
        int temp;
        for (int i = numbers.length-1; i>0 && swapped; i--) {
            swapped = false;
            for (int j = 0; j>i; j++) {  //cambiar a j > i para versión ascendiente
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
    public static int [] bubblesort2Asc (int[] numbers) {
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
    public static int [] bubblesort2Desc (int[] numbers) {
        int i = 0;
        int j = numbers.length-1;
        int temp;
        boolean swapped = true;
        while(i<j &&swapped) { //cambiar a i<j para versión descendiente
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
        System.out.println("]");
    }
}
