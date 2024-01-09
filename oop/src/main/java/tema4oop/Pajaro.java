package tema4oop;

public class Pajaro {
    String nombre;
    int posX, posY;

    public Pajaro() {

    }

    public Pajaro (String nombre, int posX, int posY) {
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
    }

    double volar (int posX, int posY) {
        double desplazamiento = Math.sqrt(posX*posX + posY*posY);
        this.posX = posX;
        this.posY = posY; 
        return desplazamiento;
    }

}
   