package Lopez_Valero_U4_U5_Examen;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion{
    Integrante[] integrantes;
    Integrante nIntegrante;

    public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integrante[] integrantes, Integrante nIntegrante) {
        super(nombre, autor, autorMusica, autorLetras, tipo);
        this.integrantes = integrantes;
        this.nIntegrante = nIntegrante;
    }

    public Integrante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrante[] integrantes) {
        this.integrantes = integrantes;
    }

    public Integrante getnIntegrante() {
        return nIntegrante;
    }

    public void setnIntegrante(Integrante nIntegrante) {
        this.nIntegrante = nIntegrante;
    }

    public void caminito_del_falla(Agrupacion agrupacion) {
        System.out.println("El/la coro/comparsa/chirigota/cuarteto "+agrupacion.nombre+" va caminito del falla");
    }

    public void addIntegrantes(Integrante[] integrantes, Integrante nintegrante) {
        Integrante integrante;
        Arrays.copyOf(integrantes,integrantes.length+1);
        integrantes[integrantes.length-1] = nintegrante;
    }

    public boolean eliminarIntegrantes(Integrante[] integrantes){
        if (integrantes.length>0) {
            Arrays.copyOf(integrantes,integrantes.length-1);
            return true;
        } else {
            return false;
        }
    }


}
