package Dominio;

import java.util.Objects;

public class Pelicula {
    private String nombre;

    public Pelicula(){

    }
    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pelicula pelicula = (Pelicula) o;

        return Objects.equals(nombre, pelicula.nombre);
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Batman");
        Pelicula pelicula2 = new Pelicula("Superman");

        System.out.println(pelicula1);
        System.out.println(pelicula2);


    }
}
