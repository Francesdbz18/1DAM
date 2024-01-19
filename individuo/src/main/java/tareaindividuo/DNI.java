package tareaindividuo;

public class DNI {
    // attrs estáticos
    static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
    // attrs del objeto
    private int numDNI;

    // métodos públicos

    public void establecer (String nif) throws Exception {
        if(DNI.validarNIF(nif)) {
            this.numDNI = DNI.extraerNumNIF(nif);
        } else {
            throw new Exception("Nif inválido, mi negro. Pon otra cosita." +nif);
        }
    }
    public void establecer(int dni) throws Exception {
        if(dni>9999999 && dni <999999999) {
            this.numDNI = dni;
        } else {
            throw new Exception ("Este número ta mal, mi minoría racializada. Pon el de verdad. "+dni);
        }
    }

    public String obtenerNIF() {
        String cadenaNIF;
        char letraNIF = calcularLetraNIF(numDNI);
        cadenaNIF = Integer.toString(numDNI)+String.valueOf(letraNIF);
        return cadenaNIF;
    }

    public int obtenerDNI() {
        return numDNI;         
    }

    // métodos privados
    private static char extraerLetraNIF (String nif) {
        char letraDNI = nif.charAt(nif.length()-1);
        return letraDNI;
    }

    private static int extraerNumNIF (String nif) {
        int nNIF = Integer.parseInt(nif.substring(0, nif.length()-1));
        return nNIF;
    }

    private static char calcularLetraNIF (int numDNI) {
        char letraDNI;
        letraDNI = LETRAS_DNI.charAt(numDNI%23);
        return letraDNI;
    }
    private static boolean validarNIF(String nif) {
        boolean valido = true;
        int numeroDNI;
        char letraleida;
        char letracalc;
        if (nif == null) {
            valido = false;
        } else if (nif.length() < 8 || nif.length() > 9) {
            valido = false;
        } else {
            numeroDNI = DNI.extraerNumNIF(nif);
            letracalc = DNI.calcularLetraNIF(numeroDNI);
            letraleida = DNI.extraerLetraNIF(nif);
            if (letracalc == letraleida) {
                valido = true;
            } else {
                valido = false;
            }
        }
        return valido;
    }
}
