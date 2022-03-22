package Lopez_Valero_U4_U5_Examen;

import java.util.Arrays;
import java.util.Objects;

public class Comparsa extends AgrupacionOficial{
    private String eAtrezzo;
    private String pObtenidos;

    public Comparsa(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integrante[] integrantes, Integrante nIntegrante, String eAtrezzo, String pObtenidos) {
        super(nombre, autor, autorMusica, autorLetras, tipo, integrantes, nIntegrante);
        this.eAtrezzo = eAtrezzo;
        this.pObtenidos = pObtenidos;
    }

    public String geteAtrezzo() {
        return eAtrezzo;
    }

    public void seteAtrezzo(String eAtrezzo) {
        this.eAtrezzo = eAtrezzo;
    }

    public String getpObtenidos() {
        return pObtenidos;
    }

    public void setpObtenidos(String pObtenidos) {
        this.pObtenidos = pObtenidos;
    }

    @Override
    public String toString() {
        return "Comparsa{" +
                "nombre='" + nombre + '\'' +
                ", integrantes=" + Arrays.toString(integrantes) +
                ", nIntegrante=" + nIntegrante +
                ", eAtrezzo='" + eAtrezzo + '\'' +
                ", pObtenidos='" + pObtenidos + '\'' +
                '}';
    }
}
