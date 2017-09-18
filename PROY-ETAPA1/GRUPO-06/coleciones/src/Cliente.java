
public class Cliente {

    public Cliente(String nombre, String n_dni, Double saldo) 
    {
        this.saldo = saldo;
        this.n_dni= n_dni;
        this.nombre = nombre;
    }

    private String nombre;
    private String n_dni;
    private Double saldo;

    public String getN_dni() {
        return n_dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setN_dni(String n_dni) {
        this.n_dni = n_dni;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
} 



