package EntregableUnidad3;

import java.sql.Array;
import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {1, 5, 8, 7, 0};

        System.out.println(Arrays.toString(interseccionVectores(v1, v2)));

    }

    public static int[] interseccionVectores(int[] v1, int[] v2) {
        int mayor = v1.length;
        if (v2.length == v1.length) {
            mayor = v2.length;
        }
        int[] resultado = new int[0];
        for (int i = 0; i < mayor; i++) {
            for (int j = 0; j < mayor; j++) {
                if (v1[i] == v2[j]) {
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[j] = v1[i];
                }
            }
        }
        return resultado;
    }
}
