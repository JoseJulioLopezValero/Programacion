package Lopez_Valero_U3_Examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = {1, 2, 3, 4, 5};
        int valor, pos;
        int longitud = v.length;

        System.out.println("¿Qué valor quiere insertar?");
        valor = sc.nextInt();

        System.out.println("¿Dónde quiere insertar el valor?");
        pos = sc.nextInt();

        System.out.println(Arrays.toString(insertarValor(v,pos,valor,longitud)));
    }

    public static int[] insertarValor(int[] v,int pos, int valor, int longitud){
        int[] reslt = new int[longitud+1];

        for (int i = 0; i < longitud; i++) {
            reslt[i] = v[i];
        }

        for (int i = 0; i < longitud; i++) {
            if (pos==i) {
                reslt[i+1]=v[i];
                reslt[i]=valor;
            } else if (i>pos) {
                reslt[i+1]=v[i];
            }
        }
        return reslt;
    }
}
