
package pe.egcc.app12.controller;

import pe.egcc.app12.model.Profesor;
import pe.egcc.app12.service.ProfesorService;

/**
 *
 * @author Elida
 */
public class ProfesorController {
    
    private ProfesorService profesorService;

    public ProfesorController() {
        profesorService = new ProfesorService();
    }

    public Profesor registrarProfesor(Profesor bean) {
        return profesorService.registrarProfesor(bean);
    }

}
