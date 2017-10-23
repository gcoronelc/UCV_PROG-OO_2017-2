package Huesp;
public class hues {
    //Variable
    private String nombre;
    private String apellido;
    
    //Constructores
    public hues() {
    }
    public hues(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Metodos Get and Set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
}
