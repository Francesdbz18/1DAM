package actividades;

public class EjemplosArbol {
    public static void arbol1() {
        int i,j,k,n;
        n=10; //Modifica este parámetro si quieres
        for(i=1; i<n+(n/2); i++){
            for(j=n+(n/2); j>i; j--){
                System.out.print(" ");}
            for(k=1; k<=2*i-1; k++){
                System.out.print("*");}
            System.out.println("");
        }
        for(i=1; i<n-(n/2); i++){
            for(j=n+(n/2); j>1; j--){
                System.out.print(" ");}
            for(k=n/2; k<=(n/2)+1; k++){
                System.out.print("*");}
            System.out.println("");
        }
    }
    public static void arbol2() {
                int n = 10;
                int space = n - 1;
                int hashtag = 1;
        
                // Dibujar el árbol de Navidad
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < space; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < hashtag; j++) {
                        System.out.print("#");
                    }
                    System.out.println();
                    space--;
                    hashtag += 2;
                }
            }
    public static void main(String[] args) {
        arbol1();
        arbol2();
    }
}
