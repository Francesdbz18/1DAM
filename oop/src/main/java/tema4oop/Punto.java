package tema4oop;

public class Punto {
    private int x, y;

    /*CONSTRUCTORS*/
    public Punto (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {}

    /*GETTERS & SETTERS*/
    public void setX (int x) {

    }
    public void setY (int y) {
        
    }
    public int getX () {
        return x;
    }
    public int getY () {
        return y;
    }
    //fin get&set

    public double modulo() {
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
    public double fase () {
        double fase = (double) (this.y)/(this.x);
        return Math.atan(fase);
    }

}
