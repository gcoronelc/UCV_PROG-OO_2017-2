/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.model.Matricula;
import app.service.ServiceMatricula;
import java.util.List;
import java.util.Map;

public class ControllerMatricula {

    public void registrar(Matricula bean) {
        ServiceMatricula service = new ServiceMatricula();
        service.registrarMatricula(bean);
    }
    public List<Map<String, Object>> mostrarMatriculas(){
        ServiceMatricula service = new ServiceMatricula();
        return service.mostrarMatriculas();
    }
    public List<Map<String, Object>> mostrarMatriculas(String codigo){
        ServiceMatricula service = new ServiceMatricula();
        return service.mostrarMatriculas(codigo);
    }
    
}
