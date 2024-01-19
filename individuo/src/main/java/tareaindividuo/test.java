package tareaindividuo;

import java.util.Scanner;
@SuppressWarnings("resource")

public class test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, anyo;
        System.out.println("Introduzca la fecha:");
        System.out.print("Día: ");
        dia = teclado.nextInt();
        System.out.print("Mes: ");
        mes = teclado.nextInt();
        System.out.print("Año: ");
        anyo = teclado.nextInt();

        Fecha fecha1 = new Fecha(dia, mes, anyo);
        Fecha fecha2 = new Fecha();

        if (fecha1.correcto()) {
            System.out.println("Fecha introducida: "+fecha1);
        }
        else {
            System.out.println("Nigga pls");
        }
        fecha2 = fecha1;
        System.out.println("Fecha segunda: "+fecha2);
        fecha1.setDia(15);

        System.out.println("Fecha1: "+fecha1);
        System.out.println("Fecha2: "+fecha2);

        //fecha2 = fecha1.clone();
        

    }

}
