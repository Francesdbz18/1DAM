package actividades;
import java.util.Scanner;
@SuppressWarnings("resource")
public class juego {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String n; 
        int diptongos = 0;
        System.out.println("Escribe la frase");
        n = teclado.nextLine();
        for (int i = 0; i < n.length(); i++){
            if(n.indexOf("ai")>-1){
                diptongos++;

            }
            else if(n.indexOf("ei")>-1){
                diptongos++;
            }
            else if(n.indexOf("eu")>-1){
                diptongos++;
            }
            else if(n.indexOf("au")>-1){
                diptongos++;
            }
            else if(n.indexOf("ii")>-1){
                diptongos++;
            }
            else if(n.indexOf("iu")>-1){
                diptongos++;
            }
            else if(n.indexOf("oi")>-1){
                diptongos++;
            }
            else if(n.indexOf("ou")>-1){
                diptongos++;
            }
            if (diptongos>0){
                System.out.println("La palabra: "+ n + " es un diptongo");
            }
            else{
                System.out.println("La palabra: "+ n + " no tiene diptongos");
            }
            
        }
    }
}
