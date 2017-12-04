/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.model.Alumno;
import app.service.ServiceAlumnos;
import java.util.List;
import java.util.Map;

/**
 *
 * @author CBrayan
 */
public class AlumnosController {

    public List<Map<String, Object>> Alumnos(String codigo) {
        ServiceAlumnos service = new ServiceAlumnos();
        return service.Alumnos(codigo);
    }

    public List<Map<String, Object>> Alumnos() {
        ServiceAlumnos service = new ServiceAlumnos();
        return service.Alumnos();
    }
    public Alumno registarAlumno(Alumno bean){
        ServiceAlumnos service = new ServiceAlumnos();
        return service.registrarAlumno(bean);
    }
    
}
