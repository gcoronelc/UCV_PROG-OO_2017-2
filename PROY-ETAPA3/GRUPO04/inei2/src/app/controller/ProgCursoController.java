/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.service.ProgCursosService;

import java.util.List;
import java.util.Map;

public class ProgCursoController {

    public List<String> leerCurso() {
        ProgCursosService service = new ProgCursosService();
        return service.leerCurso();
    }

    public List<Map<String, Object>> cursosProgramados(String curso) {
        ProgCursosService service = new ProgCursosService();
        return service.cursosProgramados(curso);
    }

}
