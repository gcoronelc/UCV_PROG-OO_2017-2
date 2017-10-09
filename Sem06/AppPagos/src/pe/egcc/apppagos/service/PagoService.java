package pe.egcc.apppagos.service;

import pe.egcc.apppagos.model.PagoModel;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class PagoService {

  public PagoModel procesar(PagoModel bean) {
    
    // Variables
    int horasTra;
    double sueldo, asignacion, bono, ingresos, renta, neto;
    
    // Proceso
    horasTra = bean.getHorasDia() * bean.getDias();
    sueldo = horasTra * bean.getPagoHora();
    asignacion = 60 * bean.getHijos();
    double factor = ((horasTra > 150) ? 0.15 : 00);
    bono = factor * sueldo;
    ingresos = sueldo + asignacion + bono;
    renta = 0.0;
    if (ingresos > 1500.0) {
      renta = ingresos * 0.08;
    }
    neto = ingresos - renta;
    
    // Actualizar bean
    bean.setHorasTra(horasTra);
    bean.setSueldo(sueldo);
    bean.setAsignacion(asignacion);
    bean.setBono(bono);
    bean.setIngresos(ingresos);
    bean.setRenta(renta);
    bean.setNeto(neto);

    // Retornar bean
    return bean;

  }

}
