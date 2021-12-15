package Lopez_Valero_U3_Examen;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dim;

        System.out.println("Introduce las dimensiones de la tabla");
        dim = sc.nextInt();
        int[][] tabla = new int[dim][dim];


        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                tabla[i][j]=(int) (Math.random()*101)+100;
            }
        }
        System.out.println(numPicos(tabla,dim));
        
    }

    public static int numPicos(int[][] tabla, int dim) {
        int contador = 0;


        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (tabla[i][j] > tabla[i-1][j-1] ||
                        tabla[i][j] > tabla[i-1][j] ||
                        tabla[i][j] > tabla[i-1][j+1] ||
                        tabla[i][j] > tabla[i][j-1] ||
                        tabla[i][j] > tabla[i][j+1] ||
                        tabla[i][j] > tabla[i+1][j-1] ||
                        tabla[i][j] > tabla[i+1][j] ||
                        tabla[i][j] > tabla[i+1][j+1]) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
