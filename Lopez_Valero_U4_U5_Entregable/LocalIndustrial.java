package U4U5_Entregable;

public class LocalIndustrial extends Local {
    private double consumo;

    public LocalIndustrial(int anho, String direccion, double metros, Persona propietario, double precio, double consumo) {
        super(anho, direccion, metros, propietario, precio);
        this.consumo = consumo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "LocalIndustrial{" +
                "consumo=" + consumo +
                '}';
    }
}
