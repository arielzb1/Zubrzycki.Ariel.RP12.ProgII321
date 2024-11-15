package Zubrzycki.Ariel;
import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private ArrayList<Publicacion> publicaciones = new ArrayList<>();   

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPublicacion(Publicacion publicacion){
        if(publicacion == null){
            throw new NullPointerException("Me pasaste un null");
        }
        if(publicaciones.contains(publicacion)){
            throw new PublicacionRepetidaException();
        }
        publicaciones.add(publicacion);      
    }
    
    public void mostrarPublicaciones(){
        if(!publicaciones.isEmpty()){
            for (Publicacion publicacion : publicaciones) {
                System.out.println(publicacion.toString() + "\n");;
            }
        }
    }
    
    public void leerPublicaciones(){
        if(!publicaciones.isEmpty()){
            for (Publicacion publicacion : publicaciones) { 
                if(publicacion instanceof Legible){
                    ((Legible)publicacion).leer();
                }else{
                    System.out.println("La ilustracion "+ publicacion.getTitulo()+" no se puede leer");
                }
                
            }
        }
    }
    
}
