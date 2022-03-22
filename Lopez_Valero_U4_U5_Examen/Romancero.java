package Lopez_Valero_U4_U5_Examen;

import java.util.Arrays;
import java.util.Objects;

public class Romancero extends AgrupacionOficial implements Callejera{
    private String tipo;
    private String tCartelon;

    public Romancero(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integrante[] integrantes, Integrante nIntegrante, String tipo1, String tCartelon) {
        super(nombre, autor, autorMusica, autorLetras, tipo, integrantes, nIntegrante);
        this.tipo = tipo1;
        this.tCartelon = tCartelon;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String gettCartelon() {
        return tCartelon;
    }

    public void settCartelon(String tCartelon) {
        this.tCartelon = tCartelon;
    }

    @Override
    public String toString() {
        return "Romancero{" +
                "nombre='" + nombre + '\'' +
                ", integrantes=" + Arrays.toString(integrantes) +
                ", nIntegrante=" + nIntegrante +
                ", tipo='" + tipo + '\'' +
                ", tCartelon='" + tCartelon + '\'' +
                '}';
    }
}
