package Zubrzycki.Ariel;

public class Ilustracion extends Publicacion{
    private String ilustrador;
    private int ancho;
    private int alto;

    public Ilustracion(String titulo, String anio, String ilustrador, int ancho, int alto) {
        super(titulo, anio);
        this.ilustrador = ilustrador;
        this.ancho = ancho;
        this.alto = alto;
    }
 
    public String toString() {
        return "Ilustracion{" + super.toString() + ", ilustrador=" + ilustrador + ", ancho=" + ancho + ", alto=" + alto + '}';
    }    
}
