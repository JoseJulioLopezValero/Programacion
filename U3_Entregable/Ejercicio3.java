package EntregableUnidad3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de los lados");
        int logitud = sc.nextInt();

        int[][] cuadrado = new int[logitud][logitud];

        for (int i = 0; i < logitud; i++) {
            for (int j = 0; j < logitud; j++) {
                cuadrado[i][j] = (int) (Math.random()*(65-18)+18);
            }
        }
    }
}
