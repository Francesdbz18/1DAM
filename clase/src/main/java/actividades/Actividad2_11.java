package actividades;
public class Actividad2_11 {
    public static float masAlta(float[] notas) {
        float masAlta = 1;
        for (int i = 0; i<=25; i++) {
            if (notas[i] > masAlta && notas[i]<=10){
                masAlta = notas[i];
            }
        }
        return masAlta;
    }
    public static float masBaja(float[] notas) {
        float masBaja = 10;
        for (int i = 0; i<=25; i++) {
            if (notas[i] < masBaja && notas[i]>=1){
                masBaja = notas[i];
            }
        }
        return masBaja;
    }
    public static void main(String[] args) {
        float [] notas = new float [] {1,2,3,4,5,6,7,8,9,(float)1.5, (float)2.5, (float)3.5, 10, (float)9.6, 7, (float) 8.8, 1, 1, 1, 1, 1, 2, 2, 2, 5, 5, 5, 6, 6, 6, 6};
        System.out.println("La nota más alta es: "+masAlta(notas));
        System.out.println("La nota más baja es: "+masBaja(notas));

    }
}