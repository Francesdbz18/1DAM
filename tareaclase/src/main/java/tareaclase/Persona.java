package tareaclase;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Persona {
    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String dni;
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    private LocalDateTime fechaNacimiento; 

    public Persona(String nombre, String dni, LocalDateTime fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        LocalDateTime myDateObj = LocalDateTime.now();  
        System.out.println("Before formatting: " + myDateObj);  
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formattedDate = myDateObj.format(myFormatObj);  
        System.out.println("After formatting: " + formattedDate); 
    }
}
