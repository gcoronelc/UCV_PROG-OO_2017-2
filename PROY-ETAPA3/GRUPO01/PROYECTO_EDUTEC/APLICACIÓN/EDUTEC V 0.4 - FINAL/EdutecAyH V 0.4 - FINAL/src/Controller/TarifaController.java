package Controller;

import model.Tarifa;
import service.TarifaServive;

public class TarifaController {

    private TarifaServive tarifaService;

    public TarifaController() {
        tarifaService = new TarifaServive();
    }

    public Tarifa registrarTarifa(Tarifa bean) {
        return tarifaService.registrarTarifa(bean);
    }

}
