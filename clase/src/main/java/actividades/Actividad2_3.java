package actividades;

public class Actividad2_3 {
    public static void serieFOR () {
        int n = 3;
        for (n = 3; n<=100; n+=3) {
            if (n<99) {
            System.out.print(n+", ");
            } else {System.out.print(n + "\n");}
        }
    }
    public static void serieWHILE () {
        int i = 0;
        while (i < 99){
            i += 3;
            if (i < 99) { System.out.print(i+", "); }
            else {System.out.print(i + "\n");} 
        }
    }
    public static void serieDO () {
        int j = 0;
        do{
            j += 3;
            if (j < 99) { System.out.print(j+", "); }
            else {System.out.print(j + "\n");} 
        } while (j<99);
    }
    public static void main(String[] args) {
        serieFOR();
        serieWHILE();
        serieDO();
    }
}
