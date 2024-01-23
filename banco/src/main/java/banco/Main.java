package banco;
import java.awt.Component;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) throws Exception {
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta("Juanito Alimaña", "ES123456789", 600000, 1);

        cuenta1.setNombre("Maldi Tosju Dios");
        cuenta1.setCuenta("M3P1C4NL0SC0C05");
        cuenta1.setTipoInteres(1.5);
        cuenta1.ingreso(3000);

        System.out.println("saldo 1: "+ cuenta1.estadoCuenta());
        System.out.println("saldo 2: "+ cuenta2.estadoCuenta());

        cuenta1.reintegro(2500);
        System.out.println(cuenta1.toString());

        JOptionPane.showMessageDialog(null, "te voy a hacer mierda", "sos pollo", 2);

        }
}