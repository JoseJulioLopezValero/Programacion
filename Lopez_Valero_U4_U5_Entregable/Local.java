package U4U5_Entregable;

public abstract class Local extends Propiedad{
    private Persona propietario;
    private double precio;

    public Local(int anho, String direccion, double metros, Persona propietario, double precio) {
        super(anho, direccion, metros);
        this.propietario = propietario;
        this.precio = precio;
    }
}
