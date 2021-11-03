package Examen;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura, anchura;
        int total = 0;
        String bordado;
        final double BORDADO = 2.5;
        final double SBORDADO = 0.00;
        final double ENVIO = 3.25;

        System.out.println("Introduce la altura de la bandera");
        altura = sc.nextInt();
        System.out.println("Introduce la anchura de la badera");
        anchura = sc.nextInt();
        System.out.println("¿Quiere escudo bordado? (s/n)");
        sc.nextLine();
        bordado = sc.nextLine();

        int cm2 = altura * anchura;
        double precio = cm2 * 0.01;

        System.out.println("Gracias aquí tiene el desglose de su factura:");
        System.out.println("Bandera de " + cm2 + " cm2:     " + precio + "€");
        if (bordado.equals("s")) {
            System.out.println("Con bordado:            " + BORDADO + "€");
            precio = precio + BORDADO;
        } else {
            System.out.println("Sin bordado:            " + SBORDADO + "€");
        }
        System.out.println("Gastos de envío:        " + ENVIO + "€");
        precio = precio + ENVIO;
        System.out.println("Total:                  " + precio + "€");
    }
}
