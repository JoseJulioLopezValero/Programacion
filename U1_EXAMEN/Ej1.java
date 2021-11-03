package Examen;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;
        int espacios;

        do {
            System.out.println("Introduce la altura");
            altura = sc.nextInt();
        } while (altura < 4);

        if (altura % 2 == 0) {
            espacios = (altura - 2) / 2;
        } else {
            espacios = altura / 2;
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print("-");
            }
            if (i == 0) {
                System.out.print("*");
            } else if (i == altura - 1) {
                System.out.print("Y");
            }
            System.out.println();
        }
    }
}
