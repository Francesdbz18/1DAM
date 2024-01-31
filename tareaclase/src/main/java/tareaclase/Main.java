package tareaclase;
import javax.swing.JOptionPane;

public class Main {

    /**
     * Crea array de profesores.
     * @return
     */
    public static Profesor[] crearArrayProfs () {
        Profesor profs[] = new Profesor[10];
        return profs;
    }

    /**
     * Crea array de alumnos
     * @return
     */
    public static Alumno[] crearArrayAlu () {
        Alumno alu[] = new Alumno[10];
        return alu;
    }

    /**
     * Menú principal del programa que introduce y muestra profs. y alumnos.
     * @param profesores
     * @param alumnos
     * @throws Exception
     */
    public static void menu (Profesor [] profesores, Alumno [] alumnos) throws Exception{
        int opcion=0, contadorProfesores = 0, contadorAlumnos = 0;
        String [] opciones = {"Introducir profesor", "Introducir alumno", "Imprimir profesores", "Imprimir alumnos", "Salir"};
        while (opcion !=4) {
            opcion = JOptionPane.showOptionDialog(null, "Elija una opción", "Clases",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            switch (opcion) {
                case 0:
                    profesores[contadorProfesores] = new Profesor ();
                    profesores[contadorProfesores].setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del profesor"));
                    profesores[contadorProfesores].setDni(JOptionPane.showInputDialog(null, "Ingrese el DNI del profesor"));
                    profesores[contadorProfesores].setCuentaBancaria(JOptionPane.showInputDialog(null, "Ingrese la cuenta bancaria del profesor"));
                    profesores[contadorProfesores].setNomina(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nómina del profesor")));
                    profesores[contadorProfesores].setFechaNacimiento(JOptionPane.showInputDialog(null, "Ingrese la fecha de nacimiento del profesor"));
                    contadorProfesores++;
                    break;
                case 1:
                    alumnos[contadorAlumnos] = new Alumno();
                    alumnos[contadorAlumnos].setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno"));
                    alumnos[contadorAlumnos].setDni(JOptionPane.showInputDialog(null, "Ingrese el DNI del alumno"));
                    alumnos[contadorAlumnos].setFechaNacimiento(JOptionPane.showInputDialog(null, "Ingrese la fecha de nacimiento del alumno con formato YYYY-MM-DD"));
                    contadorAlumnos++;
                    break;
                case 2:
                    for(int i=0;i<contadorProfesores;i++){
                        profesores[i].imprimirProfesor();
                    }
                    break;
                case 3: 
                    for(int i=0;i<contadorAlumnos;i++){
                        alumnos[i].imprimirAlumno();
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione una opción válida.");
                    break;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        menu(crearArrayProfs(), crearArrayAlu());
    }
}