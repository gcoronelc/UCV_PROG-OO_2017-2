/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.model.Matricula;
import app.service.MatriculaService;
import java.util.List;
import java.util.Map;

public class MatriculaController {

    public void registrar(Matricula bean) {
        MatriculaService service = new MatriculaService();
        service.registrarMatricula(bean);
    }
    public List<Map<String, Object>> mostrarMatriculas(){
        MatriculaService service = new MatriculaService();
        return service.mostrarMatriculas();
    }
    public List<Map<String, Object>> mostrarMatriculas(String codigo){
        MatriculaService service = new MatriculaService();
        return service.verMatricula(codigo);
    }
    
}
