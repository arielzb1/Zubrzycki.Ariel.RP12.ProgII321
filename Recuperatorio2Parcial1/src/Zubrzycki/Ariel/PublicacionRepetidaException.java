package Zubrzycki.Ariel;


public class PublicacionRepetidaException extends RuntimeException{
    private static final String MESSAGE = "La Publicacion ya esta en la lista";
    
    public PublicacionRepetidaException(){
        super(MESSAGE);
    }   
}