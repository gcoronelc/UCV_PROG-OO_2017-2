

package Producto;

public abstract class Pelota {
    float diametro;
    float peso;
    String material;
    
    public abstract String getTipo();

    //getters and setters 
    
    
    
    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
