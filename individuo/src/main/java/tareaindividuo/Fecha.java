package tareaindividuo;

public class Fecha {
    private int dia;
    private int mes;
    private int anyo;

    public Fecha () {

    }

    public Fecha (int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }
    
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public boolean esBisiesto () {
        boolean bisiesto;

        if ((anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 == 0) {
            bisiesto = true;
        } else bisiesto = false;

        return bisiesto;
    }    

    public boolean correcto () {
        boolean anyoCorrecto, mesCorrecto, diaCorrecto, correcto;

        anyoCorrecto = anyo > 0;
        mesCorrecto = mes > 0 && mes < 13;

        switch(mes) {
            case 2:
                if (esBisiesto()) diaCorrecto = dia >=0 && dia <= 29;
                else diaCorrecto = dia >= 0 && dia < 29;
                break;
            case 4:
                diaCorrecto = dia >= 0 && dia <= 30;
                break;
            case 6: 
                diaCorrecto = dia >= 0 && dia <= 30;
                break;
            case 9: 
                diaCorrecto = dia >= 0 && dia <= 30;
                break;
            case 11:
                diaCorrecto = dia >= 0 && dia <= 30;
                break;
            default: 
                diaCorrecto = dia >= 0 && dia <= 31;
                break;
        }

        correcto = anyoCorrecto && mesCorrecto && diaCorrecto;
        return correcto;
    }

    public void aumentarDia (int dia, int mes, int anyo) {
        dia++;
        if (!correcto()) {
            dia = 1;
            mes++;
            if (!correcto()) {
                mes = 1;
                anyo++;
            }    
        } 
    }
    @Override
    public String toString() {
        StringBuilder fespañol = new StringBuilder();
        if (dia<10) {
            fespañol.append("0");
        }
        fespañol.append(dia);
        fespañol.append("-");
        if(mes<10) {
            fespañol.append("0");
        }
        fespañol.append(mes);
        fespañol.append("-");
        fespañol.append(anyo);
        return fespañol.toString();
    } //finn & jake

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Fecha nueva = new Fecha(this.dia, this.mes, this.anyo);
        return nueva;
    }
}
