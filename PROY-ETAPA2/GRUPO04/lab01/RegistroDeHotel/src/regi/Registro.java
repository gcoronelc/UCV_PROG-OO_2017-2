package regi;

import Habi.Hab;
import Huesp.hues;
import Sal.slda;
import javax.swing.JOptionPane;

public class Registro {

    //Vectores and Variables
    Hab objHabitacion[] = new Hab[50];
    hues[] objHuesped = new hues[50];
    slda[] objSalida = new slda[50];
    byte index = 0, indice = 0;

    //Constructor
    public Registro() {

    }

    //Registro de datos
    public void IngresarRegistro(Hab datos, hues data) {
        objHabitacion[index] = datos;
        objHabitacion[index].setEstadoHabitacion(true);
        objHuesped[index] = data;
        index++;

    }

    //La salida se buscara por número de habitacion
    public void salidaHuesped(int numero, String fechaSalida) {
        byte contador = 0;

        while (contador < index) {
            if (objHabitacion[contador].getNumeroHabitacion() == numero) {
                objHabitacion[contador].setEstadoHabitacion(false);
                objSalida[indice] = new slda(objHuesped[contador], objHabitacion[contador], fechaSalida);
                indice++;
                while (contador < index) {
                    //Al momento de registrar, fue un registro paralelo "Vectores Paralelos"
                    if (contador + 1 == index) {

                        index--;
                        break;
                    }
                    objHabitacion[contador] = objHabitacion[contador + 1];
                    objHuesped[contador] = objHuesped[contador + 1];
                    contador++;
                }
            }
            contador++;
        }
    }

    public void ordenarNombre() {
        for (int index = 0; index < this.index; index++) {
            //buble para c = index+1 aumetara en 1 hasta máximo agregados-1
            for (int indice = index + 1; indice < this.index; indice++) {
                /*una vez encontrado el nombre lo comparamos con el codigo "compareToIgnreCase", 
                  este codigo compara cadenas con el alfabeto yle ponemso >0 para que comienze desde la A*/
                if (objHuesped[index].getNombre().compareToIgnoreCase(objHuesped[indice].getNombre()) > 0) {
                    hues temporal;

                    temporal = objHuesped[index];
                    objHuesped[index] = objHuesped[indice];
                    objHuesped[indice] = temporal;
                    Hab tempo;
                    tempo = objHabitacion[index];
                    objHabitacion[index] = objHabitacion[indice];
                    objHabitacion[indice] = tempo;

                }
            }
        }
    }

    public void ordenarHabitacion() {
        for (int index = 0; index < this.index; index++) {
            //buble para c = index+1 aumetara en 1 hasta máximo agregados-1
            for (int indice = index + 1; indice < this.index; indice++) {
                /*una vez encontrado el nombre lo comparamos con el codigo "compareToIgnreCase", 
                  este codigo compara cadenas con el alfabeto yle ponemso >0 para que comienze desde la A*/
                if (objHabitacion[index].getNumeroHabitacion() < objHabitacion[indice].getNumeroHabitacion()) {
                    hues temporal;

                    temporal = objHuesped[index];
                    objHuesped[index] = objHuesped[indice];
                    objHuesped[indice] = temporal;
                    Hab tempo;
                    tempo = objHabitacion[index];
                    objHabitacion[index] = objHabitacion[indice];
                    objHabitacion[indice] = tempo;

                    
                }
            }
        }
    }

    public String mostrar() {
        String lista = "Nombre\tApellido\tTipo\tNúmero\tfechaRegistro\tHabitacionOcupado\n";

        for (int indice = 0; indice < index; indice++) {
            lista += objHuesped[indice].getNombre() + "\t" + objHuesped[indice].getApellido() + "\t" + objHabitacion[indice].getTipoHabitacion() + "\t" + objHabitacion[indice].getNumeroHabitacion() + "\t"
                    + objHabitacion[indice].getFechaRegistro() + "\t   " + objHabitacion[indice].isEstadoHabitacion() + "\n";
        }

        return lista;

    }

    public String clientesRetirados() {
        String lista = "Nombre\tApellido\tTipo\tNúmero\tfechaRegistro\tHabitacionOcupada\tfechaSalida\n";

        for (int indice = 0; indice < this.indice; indice++) {
            lista += objSalida[indice].getNombre() + "\t" + objSalida[indice].getApellido() + "\t" + objSalida[indice].getTipoHabitacion() + "\t" + objSalida[indice].getNumeroHabitacion() + "\t"
                    + objSalida[indice].getFechaRegistro() + "\t        " + objSalida[indice].isEstadoHabitacion() + "\t\t" + objSalida[indice].getFechaSalida() + "\n";
        }

        return lista;
    }

    public boolean verificarHabitacion(byte numero) {
        byte num = 0;
        
        for (byte indice = 0; indice < this.index; indice++) {
            if (objHabitacion[indice].getNumeroHabitacion() == numero) {
                JOptionPane.showMessageDialog(null, "LA HABITACION ELEGIDA ESTA OCUPADA POR OTRO HUESPED");
                num = indice;
                System.out.println(index);
                return false;
            }
        }
        return true;
    }

}
