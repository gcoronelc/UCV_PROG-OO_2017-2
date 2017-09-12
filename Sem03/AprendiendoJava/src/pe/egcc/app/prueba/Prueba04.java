package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase3;
import pe.egcc.app.service.Clase4;

public class Prueba04 {

    public static void main(String[] args) {
        
        Clase1 obj = new Clase2();
        
        Clase2 x = (Clase2) obj;
        Clase3 y = (Clase3) obj; // Error
        Clase4 z = (Clase4) obj; // Error
                        
    }
    
}
