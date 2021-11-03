package Examen;

public class Ej3 {
    public static void main(String[] args) {

        int carta = (int) (Math.random()*13);
        int palo = (int) (Math.random()*4);

        if (palo==0) {
            System.out.println("Palo  - Picas");
        } else if (palo==1) {
            System.out.println("Palo  - Corazones");
        } else if (palo==2) {
            System.out.println("Palo  - Diamantes");
        } else if (palo==3) {
            System.out.println("Palo  - Tréboles");
        }

        if (carta==0) {
            System.out.println("Carta: K");
        } else if (carta==1) {
            System.out.println("Carta: A");
        } else if (carta==12) {
            System.out.println("Carta: J");
        }else if (carta==13) {
            System.out.println("Carta: Q");
        } else System.out.println("Carta: "+carta);



    }
}
