package EntregableUnidad3;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {

        final int LONGITUD = 20;

        int[] num = new int[LONGITUD];
        int[] cuadra = new int[LONGITUD];
        int[] cubo = new int[LONGITUD];

        for (int i = 0; i < LONGITUD; i++) {
            num[i] =(int) (Math.random()*101);
        }

        for (int i = 0; i < LONGITUD; i++) {
            cuadra[i] = num[i]*2;
        }

        for (int i = 0; i < LONGITUD; i++) {
            cubo[i] = num[i]*num[i]*num[i];
        }

        for (int i = 0; i < LONGITUD; i++) {
            System.out.print(num[i]+"  ");
            System.out.print(cuadra[i]+"  ");
            System.out.print(cubo[i]+"  ");
            System.out.println();
        }


    }
}
