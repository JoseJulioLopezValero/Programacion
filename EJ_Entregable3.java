package Entregable1;

import java.util.Scanner;

public class EJ_Entregable3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nent;
        String dia;
        String tarj;
        int ent;
        final double DESC = 0.1;
        final int PAREJA = 11;
        double tdesc;
        int tEnt;
        double total;

        System.out.println("Indique el número de entradas");
        nent = sc.nextInt();
        System.out.println("Introduce el dia");
        sc.nextLine();
        dia = sc.nextLine();
        System.out.println("Tarjeta Cinecampa? (s/n)");
        tarj = sc.nextLine();


        if (dia.equals("miercoles")) {
            ent=5;
            tEnt=5*nent;
        } else if (nent%2==1 && dia.equals("jeves")) {
            ent=11;
            tEnt=nent/2*ent+8;
        } else if (nent%2==0) {
            ent = 11;
            tEnt=nent/2*PAREJA;
        }
        else {
            ent=8;
            tEnt=nent*ent;
        }
        if (tarj.equals("s")) {
            tdesc=tEnt*DESC;
            total=tEnt-tdesc;
        }
        else {
            total=tEnt;
        }
        System.out.println(nent+" Entradas");
        System.out.println("Precio por entrada: "+ent);
        System.out.println("El total es "+total);




    }
}
