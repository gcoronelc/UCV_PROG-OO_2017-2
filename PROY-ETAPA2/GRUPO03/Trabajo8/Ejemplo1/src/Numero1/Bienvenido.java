
package Numero1;
import javax.swing.JOptionPane;

public class Bienvenido { 
// Nombre de la clase: Bienvenido
// Public : Se puede acceder desde otras clases
public static void main(String[] args){
// Declara la primera funcion o Rutina
// metodo main resive un arreglo string
// void : sirve para identificar que es procedimiento

  // Correcta Forma Declarar Variables
String Nombre; // Se describe
String Apellido;

Nombre=JOptionPane.showInputDialog("Ingese su Nombre");// Captura Datos
Apellido=JOptionPane.showInputDialog("Ingese su Apellido");//Captura Datos
JOptionPane.showMessageDialog(null, "Bienvenido : "+Nombre+" "+Apellido);//Muestra

}

}
