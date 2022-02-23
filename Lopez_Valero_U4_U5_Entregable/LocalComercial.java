package U4U5_Entregable;

public class LocalComercial extends Local{
    private String descripcion;

    public LocalComercial(int anho, String direccion, double metros, Persona propietario, double precio, String descripcion) {
        super(anho, direccion, metros, propietario, precio);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "LocalComercial{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
