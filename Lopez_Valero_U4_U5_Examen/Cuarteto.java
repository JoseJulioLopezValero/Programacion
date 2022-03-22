package Lopez_Valero_U4_U5_Examen;

import java.util.Arrays;
import java.util.Objects;

public class Cuarteto extends AgrupacionOficial implements Callejera{
    private String nMiembros;
    private String pObtenidos;

    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integrante[] integrantes, Integrante nIntegrante, String nMiembros, String pObtenidos) {
        super(nombre, autor, autorMusica, autorLetras, tipo, integrantes, nIntegrante);
        this.nMiembros = nMiembros;
        this.pObtenidos = pObtenidos;
    }

    public String getnMiembros() {
        return nMiembros;
    }

    public void setnMiembros(String nMiembros) {
        this.nMiembros = nMiembros;
    }

    public String getpObtenidos() {
        return pObtenidos;
    }

    public void setpObtenidos(String pObtenidos) {
        this.pObtenidos = pObtenidos;
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                "nombre='" + nombre + '\'' +
                ", integrantes=" + Arrays.toString(integrantes) +
                ", nIntegrante=" + nIntegrante +
                ", nMiembros='" + nMiembros + '\'' +
                ", pObtenidos='" + pObtenidos + '\'' +
                '}';
    }
}
