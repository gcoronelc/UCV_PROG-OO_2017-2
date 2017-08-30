public class Producto{
  
  public Producto( ){
    System.out.println("Bien Gustavo ");
  }
  
  @Override
  protected void finalize(){
    System.err.println("Chau objeto ");
  }
  
}

