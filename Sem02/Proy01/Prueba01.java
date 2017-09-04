public class Prueba01{


	public static void main(String[] args){
		
		int[] datos = new int[args.length];
		
		for(int i=0; i < args.length; i++){
			datos[i] = Integer.parseInt( args[i] );
		}
		
		int suma = 0;
		switch( args.length ){
			
			case 2:
				suma = sumar(datos[0], datos[1]);
				break;
				
			case 3:
				suma = sumar(datos[0], datos[1], datos[2]);
				break;
				
			case 4:
				suma = sumar(datos[0], datos[1], datos[2], datos[3]);
				break;
		}
		
		System.out.println("Suma: " + suma );
		
	}
	
	
	public static int sumar(int n1, int n2){
		return (n1 + n2);
	}

	public static int sumar(int n1, int n2, int n3){
		return (n1 + n2 + n3);
	}

	public static int sumar(int n1, int n2, int n3, int n4){
		return (n1 + n2 + n3 + n4);
	}
}