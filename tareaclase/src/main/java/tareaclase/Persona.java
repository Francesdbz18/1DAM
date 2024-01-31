package tareaclase;

public class Persona {
    protected String nombre;
    protected String dni;
    protected String fechaNacimiento;
    static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
    protected int numDNI;
    /**
     * Constructor vacío para Persona.
     */
    public Persona () {}

    /**
     * Constructor de Persona.
     * @param nombre
     * @param dni
     * @param fechaNacimiento
     * @throws Exception
     */
    public Persona(String nombre, String dni, String fechaNacimiento) throws Exception {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI validado.
     * @param dni
     * @throws Exception
     */
    public void setDni(String dni) throws Exception {
        if(Persona.validarNIF(dni)) {
            this.numDNI = Persona.extraerNumNIF(dni);
        } else {
            throw new Exception("Nif inválido: " +dni);
        }
    }

    /**
     * @return fecha de nacimiento.
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Valida el DNI.
     * @param nif
     * @return
     */
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
            numeroDNI = Persona.extraerNumNIF(nif);
            letracalc = Persona.calcularLetraNIF(numeroDNI);
            letraleida = Persona.extraerLetraNIF(nif);
            if (letracalc == letraleida) {
                valido = true;
            } else {
                valido = false;
            }
        }
        return valido;
    }
    /**
     * @param nif
     * @return
     */
    private static char extraerLetraNIF (String nif) {
        char letraDNI = nif.charAt(nif.length()-1);
        return letraDNI;
    }

    /**
     * @param nif
     * @return
     */
    private static int extraerNumNIF (String nif) {
        int nNIF = Integer.parseInt(nif.substring(0, nif.length()-1));
        return nNIF;
    }

    /**
     * @param numDNI
     * @return
     */
    private static char calcularLetraNIF (int numDNI) {
        char letraDNI;
        letraDNI = LETRAS_DNI.charAt(numDNI%23);
        return letraDNI;
    }
}
