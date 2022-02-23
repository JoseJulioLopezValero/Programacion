package U4U5_Entregable;

import java.util.Arrays;

public class Vivienda extends Propiedad{
    private int nBanhos;
    private int nHabitaciones;
    public int maxCap;
    public double precio;
    private Persona[] habitantes;

    public Vivienda(int anho, String direccion, double metros, int nBanhos, int nHabitaciones, int maxCap, double precio, Persona[] habitantes) {
        super(anho, direccion, metros);
        this.nBanhos = nBanhos;
        this.nHabitaciones = nHabitaciones;
        this.maxCap = maxCap;
        this.precio = precio;
        this.habitantes = habitantes;
    }

    public int getnBanhos() {
        return nBanhos;
    }

    public void setnBanhos(int nBanhos) {
        this.nBanhos = nBanhos;
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public int getMaxCap() {
        return maxCap;
    }

    public void setMaxCap(int maxCap) {
        this.maxCap = maxCap;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Persona[] getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(Persona[] habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "nBanhos=" + nBanhos +
                ", nHabitaciones=" + nHabitaciones +
                ", maxCap=" + maxCap +
                ", precio=" + precio +
                ", habitantes=" + Arrays.toString(habitantes) +
                '}';
    }

}
