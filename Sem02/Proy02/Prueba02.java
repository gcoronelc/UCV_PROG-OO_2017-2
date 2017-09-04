public class Prueba02{

  public static void main(String[] args){
	  
	  // Datos
	  DatosModel bean = new DatosModel();
      bean.num1 = 15;
	  bean.num2 = 14;
	  
	  // Proceso
	  MateService service = new MateService();
	  bean = service.procesar( bean );
	  
	  // Reporte
	  System.out.println("Suma: " + bean.suma);
	  System.out.println("Resta: " + bean.resta);
	  
  }


}