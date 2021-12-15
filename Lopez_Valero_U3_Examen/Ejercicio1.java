package Lopez_Valero_U3_Examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1, l2;
        int mayor, menor;


        System.out.println("Introduce la longitud del primer vector");
        l1 = sc.nextInt();
        int[] v1 = new int[l1];
        for (int i = 0; i < l1; i++) {
            System.out.println("introduce los valores del primer vector");
            v1[i] = sc.nextInt();
        }

        System.out.println("Introduce la longitud del segundo vector");
        l2 = sc.nextInt();
        int[] v2 = new int[l2];
        for (int i = 0; i < l2; i++) {
            System.out.println("introduce los valores del segundo vector");
            v2[i] = sc.nextInt();
        }

        if (l1>l2) {
            mayor = l1;
            menor = l2;
        } else {
            mayor = l2;
            menor = l1;
        }

        System.out.println(Arrays.toString(mediaVectores(v1,v2,mayor,menor)));
    }

    public static float[] mediaVectores(int[] v1, int[] v2, int mayor, int menor){
        float[] reslt= new float[mayor];

        for (int i = 0; i < menor; i++) {
            reslt[i] = v1[i]+v2[i];
            reslt[i] = reslt[i]/2;
        }

        for (int i = 0; i < mayor-menor; i++) {
            if (v1.length==mayor){
                reslt[i+menor]=v1[i+menor];
            } else if (v2.length==mayor) {
                reslt[i+menor]=v2[i+menor];
            }
        }
        return reslt;
    }
}
