package Lopez_Valero_U4_U5_Examen;

import java.util.Arrays;

public abstract class COAC{

    AgrupacionOficial[] agrupacion;
    AgrupacionOficial nAgrupacionOficial;

    public void inscribir_agrupacion(AgrupacionOficial[] agrupacion, AgrupacionOficial nAgrupacionOficial) {
        Arrays.copyOf(agrupacion, agrupacion.length+1);
        agrupacion[agrupacion.length-1]=nAgrupacionOficial;
    }

    public boolean eliminar_agrupacion(AgrupacionOficial[] agrupacion ){
        if (agrupacion.length>0){
            Arrays.copyOf(agrupacion, agrupacion.length-1);
            return true;
        } else {
            return false;
        }
    }

}
