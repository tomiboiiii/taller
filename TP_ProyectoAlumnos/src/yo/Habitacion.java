package yo;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Habitacion {
    private double costoNoche;
    private Cliente cli;
    private boolean ocupada = false;
    private int habitaciones;

    public double getCostoNoche() {
        return costoNoche;
    }

    public void setCostoNoche(double costoNoche) {
        this.costoNoche = costoNoche;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Habitacion(int d) {
        this.costoNoche = GeneradorAleatorio.generarDouble(6000) + 2000;
        this.cli = null;
        this.ocupada = false;
    }
    
    
}
