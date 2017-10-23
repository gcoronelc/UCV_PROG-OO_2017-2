package Prueba;

import AbstractFactory.DesignFactory;
import AbstractFactory.ServicioFactory;
import AbstractFactory.ServicioInformatico;
import AbstractFactory.SoftwareFactory;
import AbstractFactory.WebsiteFactory;
import java.util.Scanner;

public class Principal {

    private static Scanner S = new Scanner(System.in);
    
    public static void main(String[] args) {
        int o;
        do{
            o = preguntarServicio();
            switch(o) {
                case 1:
                    usarServicio(new DesignFactory());
                    break;
                case 2:
                    usarServicio(new SoftwareFactory());
                    break;
                case 3:
                    usarServicio(new WebsiteFactory());
                    break;
                case 4:
                    System.out.println("Cerrando programa.");
                    break;
                default:
                    System.out.println("Se ha ingresado una opción inválida.");
            }
            System.out.print("\n");
        }while(o!=4);
    }
    
    public static void usarServicio(ServicioFactory factory) {
        ServicioInformatico servicio = factory.crearServicio();
        servicio.asignarTrabajo();
        servicio.indicarFechaEntrega();
        servicio.informarSobrePago();
    }
    
    public static int preguntarServicio() {
        System.out.print(
                "MENÚ DE OPCIONES\n"
              + "---- -- -------->\n"
              + "1. Solicitar servicio de diseño gráfico.\n"
              + "2. Solicitar desarrollo de software educacional.\n"
              + "3. Solicitar creación de sitios web.\n"
              + "4. Cerrar programa.\n"
              + "Seleccione opción: "
        );
        return Integer.parseInt( S.nextLine() );
    }
}
