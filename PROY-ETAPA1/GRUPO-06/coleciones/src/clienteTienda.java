import java.util.*;

public class clienteTienda {
    public static void main(String[] args) {
        
        Cliente cl1 = new Cliente("Juan Tomas","70113123", 182731298.0);
        Cliente cl2 = new Cliente("Manlee Rivera","723323", 731298.0);
        Cliente cl3 = new Cliente("Jorge kiremi","9847123", 221123008.0);
        
       Set<Cliente> clienteTienda = new HashSet <Cliente>();
        
        clienteTienda.add(cl1);
        clienteTienda.add(cl2);
        clienteTienda.add(cl3);
        
        for (Cliente cliente : clienteTienda) {
            
            System.out.println(cliente.getNombre()+" "
                    + cliente.getN_dni()+ " "+ cliente.getSaldo());
            
        }
    }
}
