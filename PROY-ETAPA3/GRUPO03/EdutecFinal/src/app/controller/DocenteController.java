/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;
import app.service.DocenteService;
import java.util.List;
import java.util.Map;

/**
 *
 * @author CBrayan
 */
public class DocenteController {
    public List<Map<String, Object>> Profesores(String codigo) {
        DocenteService service = new DocenteService();
        return service.Docentes(codigo);
    }

    public List<Map<String, Object>> Profesores() {
        DocenteService service = new DocenteService();
        return service.Docentes();
    }
}
