package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase3;
import pe.egcc.app.service.Clase4;

public class Prueba05 {

    public static void main(String[] args) {
        
        Object obj = new Clase2();
        
        
        System.out.println("Object: " + ((obj instanceof Object)?"SI":"NO"));
        System.out.println("Clase1: " + ((obj instanceof Clase1)?"SI":"NO"));
        System.out.println("Clase2: " + ((obj instanceof Clase2)?"SI":"NO"));
        System.out.println("Clase3: " + ((obj instanceof Clase3)?"SI":"NO"));
        System.out.println("Clase4: " + ((obj instanceof Clase4)?"SI":"NO"));
        
    }

    
}
