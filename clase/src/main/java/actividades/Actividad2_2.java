package actividades;

import java.io.IOException;

public class Actividad2_2 {
    public static int conversor(char calificacion) {
        int nota = 0;
        switch (calificacion) {
            case 'I': nota = 4; break;
            case 'F': nota = 5; break;
            case 'B': nota = 6; break;
            case 'N': nota = 8; break;
            case 'S': nota = 9; break;
        }
        return nota;
    }
    public static void main(String[] args) throws IOException {
        int nota = 0;
        char cal;
        boolean esValida;
        System.out.print("Ingrese una nota (I, F, B, N, S):  ");
        cal = (char) System.in.read();
        cal = Character.toUpperCase(cal);
        esValida = (cal == 'I' || cal == 'F' || cal == 'B' || cal == 'N' || cal == 'S')? true:false;
        if(!esValida)System.out.println("Nota no válida");
        else{
            nota = conversor(cal);
            System.out.println("La nota es: "+nota);
        } 
    }
}
