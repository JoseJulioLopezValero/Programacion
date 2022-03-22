package Lopez_Valero_U4_U5_Examen;

import java.util.Objects;

public class Chirigota extends AgrupacionOficial implements Callejera{
    private String nCuples;
    private String pObtenidos;

    public Chirigota(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integrante[] integrantes, Integrante nIntegrante, String nCuples, String pObtenidos) {
        super(nombre, autor, autorMusica, autorLetras, tipo, integrantes, nIntegrante);
        this.nCuples = nCuples;
        this.pObtenidos = pObtenidos;
    }

    public String getnCuples() {
        return nCuples;
    }

    public void setnCuples(String nCuples) {
        this.nCuples = nCuples;
    }

    public String getpObtenidos() {
        return pObtenidos;
    }

    public void setpObtenidos(String pObtenidos) {
        this.pObtenidos = pObtenidos;
    }

}
