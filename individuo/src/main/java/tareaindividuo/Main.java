package tareaindividuo;

public class Main {
    public static void main(String[] args) {
        Individuo alumno1 = new Individuo("111111", "Juanito Alimaña", 1975);
        Individuo alumno2 = new Individuo("111011", "Pedro Navaja", 1945);
        Individuo alumno3 = new Individuo("111111", "Madame Kalalú", 1985);
        Individuo alumno4 = new Individuo("111111", "Ligia Elena", 1969);
        System.out.println("Población: "+Individuo.getPoblacion());
    }
}
