package Lopez_Valero_U4_U5_Examen;

import java.util.Arrays;
import java.util.Objects;

public class Coro extends AgrupacionOficial{
    private String nBandurrias;
    private String nGuitarras;
    private String pObtenidos;

    public Coro(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integrante[] integrantes, Integrante nIntegrante, String nBandurrias, String nGuitarras, String pObtenidos) {
        super(nombre, autor, autorMusica, autorLetras, tipo, integrantes, nIntegrante);
        this.nBandurrias = nBandurrias;
        this.nGuitarras = nGuitarras;
        this.pObtenidos = pObtenidos;
    }

    public String getnBandurrias() {
        return nBandurrias;
    }

    public void setnBandurrias(String nBandurrias) {
        this.nBandurrias = nBandurrias;
    }

    public String getnGuitarras() {
        return nGuitarras;
    }

    public void setnGuitarras(String nGuitarras) {
        this.nGuitarras = nGuitarras;
    }

    public String getpObtenidos() {
        return pObtenidos;
    }

    public void setpObtenidos(String pObtenidos) {
        this.pObtenidos = pObtenidos;
    }

    @Override
    public String toString() {
        return "Coro{" +
                "nombre='" + nombre + '\'' +
                ", integrantes=" + Arrays.toString(integrantes) +
                ", nIntegrante=" + nIntegrante +
                ", nBandurrias='" + nBandurrias + '\'' +
                ", nGuitarras='" + nGuitarras + '\'' +
                ", pObtenidos='" + pObtenidos + '\'' +
                '}';
    }
}
