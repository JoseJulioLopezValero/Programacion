package Entregable1;

import java.util.Scanner;

public class EJ1_Entregable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alt;
        int numx = 1;


        System.out.println("Introduce la altura de la Z");
        alt = sc.nextInt();

        int numEsp = alt - 1;
        int anchura = alt;

        do {
            for (int i = 0; i < alt; i++) {

                for (int j = 0; j < alt - 1; j++) {
                    System.out.println("*");
                }


                System.out.println();
            }
        }
        while (alt>=3);
    }
}
