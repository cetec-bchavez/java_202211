package basico;

public class FacturaFuncion {

	public static double ProcesarProducto(int cantidad, double precio) {
		double total = 0.0;
		
		total = cantidad * precio;
		
		total = total + total*0.14;
		
		return total;
	}
	
	// public static nombre(Tipo nombre_var1,Tipo nombre_var2) {
	//Tipo nombre = valor;
	// return resultado;
	//}

	public static void main(String[] args) {
		
		double total=0.0;
		
		total = ProcesarProducto(7,5.6);			
		System.out.println("Total="+total);
		
		total = ProcesarProducto(8,6.6);			
		System.out.println("Total="+total);
		
		total = ProcesarProducto(5,3.6);			
		System.out.println("Total="+total);
	}

}
