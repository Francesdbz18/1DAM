package radio;
import java.util.Scanner;
@SuppressWarnings("resource")
public class Main {
    public static void main(String[] args) {
        float frecuencia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la frecuencia");
        frecuencia = teclado.nextFloat();
        RadioFM radio = new RadioFM(frecuencia);
        System.out.println(radio.frecuencia);
        radio.frecuencia = radio.subirFrec(radio.frecuencia);
        System.out.println(radio.frecuencia);
    }
}