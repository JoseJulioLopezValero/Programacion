package Lopez_Valero_U4_U5_Examen;

import java.util.Objects;

public abstract class Agrupacion{
    public String nombre;
    private String Autor;
    private String autorMusica;
    private String autorLetras;
    private String tipo;


    public Agrupacion(String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
        this.nombre = nombre;
        Autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getAutorMusica() {
        return autorMusica;
    }

    public void setAutorMusica(String autorMusica) {
        this.autorMusica = autorMusica;
    }

    public String getAutorLetras() {
        return autorLetras;
    }

    public void setAutorLetras(String autorLetras) {
        this.autorLetras = autorLetras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void cantar_la_presentacion(String nombre){
        System.out.println("Cantando la presentación de la Chirigota/Coro/... con nombre "+nombre);
    }

    public void hacer_tipo(String nombre, String tipo) {
        System.out.println("La Chirigota/Coro/.... "+nombre+"va de "+tipo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agrupacion that = (Agrupacion) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(Autor, that.Autor) && Objects.equals(autorMusica, that.autorMusica) && Objects.equals(autorLetras, that.autorLetras) && Objects.equals(tipo, that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Autor, autorMusica, autorLetras, tipo);
    }

    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", Autor='" + Autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
