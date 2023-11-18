package actividades;

import java.util.Scanner;
@SuppressWarnings("resource")

public class Actividad05 {
    public static void personalidad() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.printf("Por favor, ingrese si es del Real Madrid (R), del Atlético de Madrid (A) o de otro equipo: ");
        String equipo = scanner.nextLine();

        switch (equipo.toLowerCase()) {
            case "real madrid":
            System.out.println("rATERO!");
                break;
            case "atletico de madrid":
            System.out.println("Va primero en LaLiga 20/21");
            break;
            default:
            System.out.println("Tiene las mismas champions que el ATM");
            break;
        }
    }//fin personalidad()
    public static void edad () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese su edad:");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Usted es un adulto.");
        } else {
            System.out.println("Usted es un joven.");
        }
    } //fin edad()
    public static String [] recogerNombres() { //Función que recoge nombre y apellidos del usuario y devuelve un array con los datos recogidos.
        Scanner scanner = new Scanner(System.in);
        String [] nombre = new String[3];
        System.out.print("Introduzca su nombre: ");
        nombre [0] = scanner.nextLine();
        System.out.print("Introduzca su primer apellido: ");
        nombre [1] = scanner.nextLine();
        System.out.print("Introduzca su segundo apellido: ");
        nombre [2] = scanner.nextLine();
        return nombre;
    } //Fin de la funcion recogerNombres.
    public static void main(String[] args) {
        recogerNombres();
        edad();
        personalidad();
    } //fin main
} //fin class
