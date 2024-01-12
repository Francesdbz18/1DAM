package radio;

public class RadioFM {
    private final static int frecMin = 80;
    private final static int frecMax = 105;
    private float frecuencia;
    private final static float var = 0.5f;

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
}
