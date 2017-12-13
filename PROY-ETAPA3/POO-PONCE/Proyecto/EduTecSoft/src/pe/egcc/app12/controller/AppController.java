package pe.egcc.app12.controller;

import pe.egcc.app12.service.AppService;

public class AppController {

  private AppService appService;

  public AppController() {
    appService = new AppService();
  }

  public String leerUltimoCiclo() {
    return appService.leerUltimoCiclo();
  }
  public String nuevoCiclo(String ultimoCiclo){
    
    return appService.generarCiclo(ultimoCiclo); 
}

  
}
