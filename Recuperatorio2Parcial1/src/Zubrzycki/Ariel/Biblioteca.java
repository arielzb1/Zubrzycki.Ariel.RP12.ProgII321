package Zubrzycki.Ariel;

public class Biblioteca {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("John");
        
        cargarEmpleado(empleado);
        
        empleado.mostrarPublicaciones();
        
        empleado.leerPublicaciones();
    }
    
    public static void cargarEmpleado(Empleado empleado){
        try{
            empleado.agregarPublicacion(new Libro("Rosamonte","2013","Antonio",TipoGenero.NO_FICCION));
            empleado.agregarPublicacion(new Ilustracion("Playadito", "2023", "Cacho Castania", 25,12));
            empleado.agregarPublicacion(new Revista("Cachamate", "2010", 14));
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }   
    
}
