/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.model.Ciclo;
import app.service.CicloService;
import java.util.List;
import java.util.Map;

/**
 *
 * @author CBrayan
 */
public class CicloController {
    public Ciclo generarCiclo(Ciclo bean){
        CicloService service = new CicloService();
        return service.generarCiclo(bean);
    }
    public List<Map<String, Object>> Ciclo(){
        CicloService service = new CicloService();
        return service.Ciclo();
    }
}
