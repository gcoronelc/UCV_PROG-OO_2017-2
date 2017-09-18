/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import model.ItemNumeros;
/**
 *
 * @author core i5
 */
public class numero {
    
    public String esPar(int n){
                String respuesta="";
                if(n%2==0){
                    respuesta="Par";
                }else{
                    respuesta="Impar";
                 }
                return respuesta;
    }
    public String esPositivo(int n){
        String respuesta;
        if(n>0){
            respuesta="Positivo";
        } else if(n<0){
            respuesta="Negativo";
        }else{
            respuesta="Neutro";
        }
        return respuesta;
        
    }
}
