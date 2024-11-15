package Zubrzycki.Ariel;

public class Libro extends Publicacion implements Legible{
    private String autor;
    private TipoGenero genero;

    public Libro(String titulo, String anio, String autor, TipoGenero genero) {
        super(titulo, anio);
        this.autor = autor;
        this.genero = genero;
    }

    
    public String toString() {
        return "Libro{"+ super.toString() + ", autor=" + autor + ", genero=" + genero + '}';
    }

    public void leer() {
        System.out.println("El libro " + getTitulo() + " se ha podido leer");
    } 
}
