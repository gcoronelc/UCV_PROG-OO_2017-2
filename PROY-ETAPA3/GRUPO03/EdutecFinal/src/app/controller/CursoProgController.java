/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.service.CursosProgService;

import java.util.List;
import java.util.Map;

public class CursoProgController {

    public List<String> leerCurso() {
        CursosProgService service = new CursosProgService();
        return service.leerCurso();
    }

    public List<Map<String, Object>> cursosProgramados(String curso) {
        CursosProgService service = new CursosProgService();
        return service.cursosProgramados(curso);
    }

}
