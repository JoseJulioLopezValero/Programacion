package Entregable;

public class Sedes {
    private String codigo;
    private CIUDADES ciudad;
    private Opositores opositores;
    private int[] resultado;

    public Sedes(String codigo, CIUDADES ciudad, Opositores opositores, int[] resultado) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.opositores = opositores;
        this.resultado = resultado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public CIUDADES getCiudad() {
        return ciudad;
    }

    public void setCiudad(CIUDADES ciudad) {
        this.ciudad = ciudad;
    }

    public Opositores getOpositores() {
        return opositores;
    }

    public void setOpositores(Opositores opositores) {
        this.opositores = opositores;
    }

    public int[] getResultado() {
        return resultado;
    }

    public void setResultado(int[] resultado) {
        this.resultado = resultado;
    }

}
