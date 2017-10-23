
package prueba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prueba {

   static boolean esPar(Integer n)
{  return n % 2 == 0;}
   
    public static void main(String[] args) {
       
        
List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
//encontrar los numeros pares y guardarlos en un arraylist
List<Integer> resultados = new ArrayList<Integer>();

//Funcional, declarativo, que quiero hacer?
resultados = numeros.stream().filter(n -> n%2 == 0).collect(Collectors.toList());

//Imperativa, tradicional, como?
//   for(int i =0; i< numeros.size(); i++)    if(numeros.get(i) % 2 == 0)   resultados.add(numeros.get(i));



System.out.println(resultados);
        
    }
    
}
