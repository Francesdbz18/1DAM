package actividades;
import java.util.Scanner;
@SuppressWarnings("resource")

public class Actividad2_20 {
    public static void serie1 (int n) {
        int i, j;
        for(i=1;i<=n;i++) {
            for(j=1;j<=i;j++) {
            if(j<i) System.out.print(i+",");
            else System.out.print(i);
            }
	        System.out.print(";");
        }
    }
    public static void serie2 (int n) {
        char i, j;
        for(i='a';i<n+'a';i++) {
            for(j='a';j<=i;j++) {
            if(j<i) System.out.print(i+",");
            else System.out.print(i);
            }
	        System.out.print(";");
        }
    }
    public static void serie2B (int n) {
        char i, j;
        for(i='A';i<n+'A';i++) {
            for(j='A';j<=i;j++) {
            if(j<i) System.out.print(i+", ");
            else System.out.print(i);
            }
	        System.out.print(";");
        }
        System.out.println();
    }
    public static void serie3 (int n) {
        int i;
        for(i=1;i<=n;i++) {
            if(i%2==0) System.out.print("1, ");
            else if (i%2==0&&i+1==n) System.out.print("1\n");
            else if (i%2!=0&&i<n) System.out.print("-1, ");
            else System.out.print("-1\n");
        }
    }
    public static void serie4 (int n) {
        String cadena = "1  5  3  7  5  9  7  11  9  13";
    }
    public static void serie4b (int n) {
        int [] cadena = new int[]{1,5,3,7,5,9,7,11,9,13};
        for (int i = 0; i<=n;i++) {
            if(i==n) System.out.print(cadena[i]+"\n");
            else System.out.print(cadena[i]+" ");
        }
    }
    public static void main(String[] args) {
        int n;
        char opcion;
        System.out.print("Introduce el numero de elementos: ");
        Scanner in = new Scanner(System.in);
		n = in.nextInt();
        serie4b(n);
        serie3(n);
        serie1(n);
        System.out.print("\nEscriba 'M' si desea la serie en mayúsculas, 'm' si la desea en minúsculas: ");
        opcion = in.next().charAt(0);
        switch (opcion) {
            case 'M':
            serie2B(n);
            break;
            case 'm':
            serie2(n);
            break;
            default:
            System.out.println("ERROR: Elija una opción válida.");
            break;
        }
    }
}
