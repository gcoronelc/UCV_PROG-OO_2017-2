public class MateService{

   public DatosModel procesar( DatosModel bean ){
      // Variables
	  int suma, resta;
	  // Proceso
	  suma = bean.num1 + bean.num2;
	  resta = bean.num1 - bean.num2;
	  // Resultado
	  bean.suma = suma;
	  bean.resta = resta;
	  // Retorno
	  return bean;
   }


}