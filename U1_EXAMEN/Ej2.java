package Examen;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int reves = 0;
        int aux;

        System.out.println("Introduce el número");
        num = sc.nextInt();


        while (num>0) {
            reves = reves*10+(num%10);
            num=num/10;
        }
        System.out.println(reves);

        while (reves>0) {
            aux = (reves%10);
            reves=reves/10;

            //System.out.println(aux);

            for (int i = 0; i <= aux; i++) {
                if (i!=aux) {
                    System.out.print("*");
                } else if (aux==0) {
                    System.out.print("-");
                } else if (reves==0){
                    System.out.println();
                } else {
                    System.out.print("-");
                }
            }

        }


        }
}
