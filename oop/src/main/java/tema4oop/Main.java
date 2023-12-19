package tema4oop;

public class Main {
    public static void main(String[] args) {
        Punto punto1, punto3 = new Punto();
        Punto punto2 = new Punto();
        Punto punto4 = new Punto(5, 2);
        punto1 = punto4;
        punto2.setX(1);
        punto2.setY(3);

        int valorX, valorY;
        valorX = punto4.getX();
        valorY = punto4.getY()
    }
}
