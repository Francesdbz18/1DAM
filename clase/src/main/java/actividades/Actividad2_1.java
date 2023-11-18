package actividades;
import java.util.Scanner;
import java.lang.Math;
@SuppressWarnings("resource")

public class Actividad2_1 {
    public static void mostrarNotas (String [] nombres, float [] nota) {
        int suspensos = 0;
        float media;
        System.out.print("Las notas son: ");
        for (int i = 2; i>=0; i--){
            if (nota[i] < 5 && nota[i] >=4) {
                nota[i] = (float) Math.floor(nota[i]);
                suspensos++;
                System.out.printf("\n%s: %.0f", nombres[i], nota[i]);
                     } else {
                suspensos = (nota[i]<5)? suspensos+1:suspensos;
                nota [i] = (float) Math.round(nota[i]);
                System.out.printf("\n%s: %.0f", nombres[i], nota[i]);
            }
        }
        media = ((nota[0]+nota[1]+nota[2])/3);
        System.out.printf("\nSuspensos: %d \nMedia: %.2f", suspensos, media);
    }
    public static void notaMayor (String [] nombres, float [] nota) {
        if (nota[0] > nota[1]) {
            if (nota[0] > nota[2]) {
                System.out.println("\nLa nota mayor es de "+ nombres[0] + ": "+nota[0]);
            } else {
                System.out.println("\nLa nota mayor es de "+ nombres[2] + ": "+nota[2]);
            }
        } else if (nota[1] > nota[2]) {
            System.out.println("\nLa nota mayor es de "+ nombres[1] + ": "+nota[1]);
        } else {
            System.out.println("\nLa nota mayor es de "+ nombres[2] + ": "+nota[2]);
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre[] = new String[3];
        float nota[] = new float[3];
        for (int i = 2; i>=0; i--) {
            System.out.println("Introduzca el nombre y apellido del alumno: ");
            nombre[i]= teclado.nextLine();
            System.out.println("Introduzca la nota del alumno "+nombre[i]+": ");
            nota[i]=teclado.nextFloat();
            teclado.nextLine();
        }
        mostrarNotas(nombre, nota);
        notaMayor(nombre, nota);
    }
}
