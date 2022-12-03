package basico;

public class FacturaVariables {

	public static void main(String[] args) {
				
		//Tipos Primitivos
		int cantidad=0;
		double precio=0.0;
		double total =0.0;
		
		cantidad=5;
		precio=6.3;
		
		total = cantidad * precio;		
		
		//cantidad =null;
		System.out.println("Total = "+total);
		
		
		//Tipos Clases/Complejos
		Integer cantidad2=null;
		Double precio2=0.0;
		Double total2 =0.0;
		
		cantidad2=7;
		precio2=4.3;
				
		total2 = cantidad2 * precio2;		
		
		System.out.println("Total = "+total2);
	}

}
