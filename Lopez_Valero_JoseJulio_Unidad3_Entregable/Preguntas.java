package Entregable;

import java.util.Arrays;

public class Preguntas {
    private String enunciado;
    private Opciones opciones;
    private int[] resultado;

    public Preguntas(String enunciado, Opciones opciones, int[] resultado) {
        this.enunciado = enunciado;
        this.opciones = opciones;
        this.resultado = resultado;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Opciones getOpciones() {
        return opciones;
    }

    public void setOpciones(Opciones opciones) {
        this.opciones = opciones;
    }

    public int[] getResultado() {
        return resultado;
    }

    public void setResultado(int[] resultado) {
        this.resultado = resultado;
    }
    
    public int[] addRespuesta(Opciones opciones, int[] resultado) {
        for (int i = 0; i < 3; i++) {
            if (opciones.equals(resultado[i])){
                Arrays.copyOf(resultado,3);
                opciones.equals(resultado[i]);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Preguntas{" +
                "enunciado='" + enunciado + '\'' +
                ", opciones=" + opciones +
                ", resultado=" + Arrays.toString(resultado) +
                '}';
    }
}
