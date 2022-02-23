package U4U5_Entregable;

public abstract class Propiedad {

    private int anho;
    private String direccion;
    private double metros;

    public Propiedad(int anho, String direccion, double metros) {
        this.anho = anho;
        this.direccion = direccion;
        this.metros = metros;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "anho=" + anho +
                ", direccion='" + direccion + '\'' +
                ", metros=" + metros +
                '}';
    }

}
