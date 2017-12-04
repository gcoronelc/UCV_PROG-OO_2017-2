/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;
import app.service.ServiceProfesores;
import java.util.List;
import java.util.Map;

/**
 *
 * @author CBrayan
 */
public class ControllerProfesores {
    public List<Map<String, Object>> Profesores(String codigo) {
        ServiceProfesores service = new ServiceProfesores();
        return service.Profesores(codigo);
    }

    public List<Map<String, Object>> Profesores() {
        ServiceProfesores service = new ServiceProfesores();
        return service.Profesores();
    }
}
