package Zubrzycki.Ariel;

import java.util.Objects;

public class Publicacion {
    private String titulo;
    private String anio;

    public Publicacion(String titulo, String anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void mostrar(){
        System.out.println(toString());
    }

    public String toString() {
        return "titulo=" + titulo + ", anio=" + anio;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.anio, other.anio);
    }
    
    public int hashCode(){
        return Objects.hash(titulo,anio);
    }   
}
