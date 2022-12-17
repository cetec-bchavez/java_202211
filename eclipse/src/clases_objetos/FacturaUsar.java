package clases_objetos;

import java.util.ArrayList;

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
		
		
		
		FacturaClase factura2 = new FacturaClase();

		//Ingredientes
		factura2.nombre="Teclado";
		factura2.cantidad=50;
		factura2.precio=3.5;
		
		//Procesar
		factura2.calcularTotal();
		
		System.out.println("Nombre= " + factura2.nombre + ", Cantidad= "+factura2.cantidad + ", Precio= "+factura2.precio + ", Total="+factura2.total);
		
		
		FacturaClase factura3 = new FacturaClase();

		//Ingredientes
		factura3.nombre="Monitor";
		factura3.cantidad=70;
		factura3.precio=4.5;
		
		//Procesar
		factura3.calcularTotal();
		
		System.out.println("Nombre= " + factura3.nombre + ", Cantidad= "+factura3.cantidad + ", Precio= "+factura3.precio + ", Total="+factura3.total);
		
		ArrayList<FacturaClase> facturas = new ArrayList<FacturaClase>();
		//new hoja Excel
		
		facturas.add(factura1);
		facturas.add(factura2);
		facturas.add(factura3);
		
		System.out.println("---------- LISTA COMPLETA DE DATOS ----------");
		
		for(FacturaClase fac1 : facturas) {
			System.out.println("Nombre= " + fac1.nombre + ", Cantidad= "+fac1.cantidad + ", Precio= "+fac1.precio + ", Total="+fac1.total);			
		}
	}

}
