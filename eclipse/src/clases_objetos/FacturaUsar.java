package clases_objetos;

public class FacturaUsar {

	public static void main(String[] args) {
		// Tipo nombre = new Tipo();
		
		FacturaClase factura1 = new FacturaClase();

		//Ingredientes
		factura1.nombre="Mouse";
		factura1.cantidad=5;
		factura1.precio=2.5;
		
		//Procesar
		factura1.calcularTotal();
		
		System.out.println("Nombre= " + factura1.nombre + ", Cantidad= "+factura1.cantidad + ", Precio= "+factura1.precio + ", Total="+factura1.total);
		
	}

}
