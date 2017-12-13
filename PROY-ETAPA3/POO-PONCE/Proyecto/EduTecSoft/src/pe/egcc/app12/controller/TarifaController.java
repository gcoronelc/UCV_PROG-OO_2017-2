/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app12.controller;

import pe.egcc.app12.model.Tarifa;
import pe.egcc.app12.service.TarifaService;

public class TarifaController {
    
    private TarifaService tarifaService;

    public TarifaController() {
        tarifaService = new TarifaService();
    }

    public Tarifa registrarTarifa(Tarifa bean) {
        return tarifaService.registrarTarifa(bean);
    }

}
