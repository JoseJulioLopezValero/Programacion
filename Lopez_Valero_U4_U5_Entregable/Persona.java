package U4U5_Entregable;

public class Persona {
    private String nif;
    private String nombreApellidos;
    static int Id=0;
    private int id;

    public Persona(String nif, String nombreApellidos) {
        this.nif = nif;
        this.nombreApellidos = nombreApellidos;
        Id++;
        this.id=Id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nif='" + nif + '\'' +
                ", nombreApellidos='" + nombreApellidos + '\'' +
                ", id=" + id +
                '}';
    }
}
