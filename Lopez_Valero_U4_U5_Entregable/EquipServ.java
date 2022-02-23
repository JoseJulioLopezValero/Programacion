package U4U5_Entregable;

public class EquipServ extends Propiedad{
    private TipoServicio tipo;

    public EquipServ(int anho, String direccion, double metros, TipoServicio tipo) {
        super(anho, direccion, metros);
        this.tipo = tipo;
    }

    public TipoServicio getTipo() {
        return tipo;
    }

    public void setTipo(TipoServicio tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "EquipServ{" +
                "tipo=" + tipo +
                '}';
    }
}
