package banco;

public class Cuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    public Cuenta () {

    }

    public Cuenta(String nombre, String cuenta, double saldo, double tipoInteres) throws Exception{
        setCuenta(cuenta);
        setNombre(nombre);
        setTipoInteres(tipoInteres);
        ingreso(saldo);
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) throws Exception {
        if (cuenta.length()== 0 ) throw new Exception("Error: ponme algo, papito.");
        this.cuenta = cuenta;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() == 0) {
            throw new Exception("Error: ponme algo, papito.");
        }
        this.nombre = nombre;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double estadoCuenta () {
        return saldo;
    }

    public void ingreso (double cantidad) throws Exception {
        if (cantidad <= 0) throw new Exception("Error: ponme dinero, papito.");
        saldo += cantidad;
    }

    public void reintegro (double cantidad) throws Exception {
        if (saldo < cantidad) throw new Exception("Error: saldo insuficiente, papito.");
        saldo -= cantidad;
    }

    @Override
    public String toString() {
        return "info. de la cuenta:\nNombre: "+getNombre()+"\nCuenta: "+getCuenta()+"\nSaldo actual: "+estadoCuenta()+ "\nTipo de interés: "+getTipoInteres()+"%";
    }  
}
