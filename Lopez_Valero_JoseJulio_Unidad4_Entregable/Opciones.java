package Entregable;

public class Opciones {
    private String texto;
    private boolean vf;

    public Opciones(String texto, boolean vf) {
        this.texto = texto;
        this.vf = vf;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isVf() {
        return vf;
    }

    public void setVf(boolean vf) {
        this.vf = vf;
    }

    @Override
    public String toString() {
        return "Opciones{" +
                "texto='" + texto + '\'' +
                ", vf=" + vf +
                '}';
    }
}
