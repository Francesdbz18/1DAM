package radio;

public class RadioFM {
    private final static int frecMin = 80;
    private final static int frecMax = 105;
    float frecuencia = 0;
    private static double var = 0.5;

    public RadioFM (float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public float getFrecuencia () {
        return frecuencia;
    }
    public void setFrecuencia (float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public static int getfrecMin () {
        return frecMin;
    }

    public static int getfrecMax () {
        return frecMax;
    }

    public static double getvar () {
        return var;
    }

    public final static void setvar(double var) {
        var = 0.5;
    }

    public float subirFrec (float frecuencia) {
        frecuencia += var;
        if (frecuencia >= 105.5) frecuencia = 80;
        return frecuencia;
    }
    public void bajarFrec (float frecuencia) {
        frecuencia = (float) (frecuencia - 0.5);
        if (frecuencia <= 79.5) frecuencia = 105;
    }
}
