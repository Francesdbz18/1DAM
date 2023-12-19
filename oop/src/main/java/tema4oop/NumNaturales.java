package tema4oop;

public class NumNaturales {
    private int inicial, maximo;
    public NumNaturales (int inicial, int mainicialimo) {
        this.inicial = inicial;
        this.maximo = maximo;
    }
    /*GETTERS & SETTERS*/
    public void setinicial (int inicial) {

    }
    public void setmaximo (int maximo) {
        
    }
    public int getinicial () {
        return inicial;
    }
    public int getmaximo () {
        return maximo;
    }
    //fin get&set
    public void reset () {
        this.inicial = 0;
        this.maximo = 0; 
    }
    public void imprimirRango() {
        for (int i = this.inicial; i <= this.maximo; i++) {
            if (i == this.maximo) System.out.print(i);
            else System.out.print(i+", ");
        }
    }
    public void imprimirRangoInverso() {
        for (int i = this.maximo; i >= this.inicial; i--) {
            if (i == this.inicial) System.out.print(i);
            else System.out.print(i+", ");
        }
    }
}
