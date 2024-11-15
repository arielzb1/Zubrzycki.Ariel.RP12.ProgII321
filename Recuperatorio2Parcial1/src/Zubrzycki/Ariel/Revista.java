package Zubrzycki.Ariel;

public class Revista extends Publicacion implements Legible{
    private int numeroEdicion;

    public Revista(String titulo, String anio, int numeroEdicion) {
        super(titulo, anio);
        this.numeroEdicion = numeroEdicion;
    }

    public String toString() {
        return "Revista{" + super.toString() + ", numeroEdicion=" + numeroEdicion + '}';
    }

    public void leer() {
        System.out.println("La revista " + getTitulo() + " se ha podido leer");
    }
   
   
    
}
