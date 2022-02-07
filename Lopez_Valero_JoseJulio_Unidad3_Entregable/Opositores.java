package Entregable;

public class Opositores {
    private String nombre, apellidos;
    private int anioNac;
    private boolean adaptacion;
    private String descripcion;

    public Opositores(String nombre, String apellidos, int anioNac, boolean adaptacion, String descripcion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anioNac = anioNac;
        this.adaptacion = false;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }

    public boolean isAdaptacion() {
        return adaptacion;
    }

    public void setAdaptacion(boolean adaptacion) {
        this.adaptacion = adaptacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean adaptacion(boolean adaptacion, String descripcion) {
        if (adaptacion) {
            this.descripcion=descripcion;
        } else descripcion="No hay adaptación";
        return adaptacion;
    }

    @Override
    public String toString() {
        return "Opositores{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", anioNac=" + anioNac +
                ", adaptacion=" + adaptacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
