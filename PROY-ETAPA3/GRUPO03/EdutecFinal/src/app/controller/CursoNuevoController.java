/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import java.util.List;
import app.service.CursoNuevoService;
import app.model.Curso;
import java.util.Map;

/**
 *
 * @author CBrayan
 */
public class CursoNuevoController {

    public List<String> tarifa() {
        CursoNuevoService service = new CursoNuevoService();
        return service.leerTarifa();
    }

    public Curso reistrarAlumno(Curso bean) {
        CursoNuevoService service = new CursoNuevoService();
        return service.registrarAlumno(bean);
    }

    public List<Map<String, Object>> cursos() {
        CursoNuevoService service = new CursoNuevoService();
        return service.cursos();
    }

}
