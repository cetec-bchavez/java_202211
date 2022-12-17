class FacturaClase {
	
	//Ingredientes
	nombre="";
	cantidad=0;
	precio=0.0;
	
	//Resultado
	total=0.0;
	
	//FUNCION Procesar
	calcularTotal() {
		this.total = this.cantidad * this.precio;
	}
}




let factura1 = new FacturaClase();

//Ingredientes
factura1.nombre="Mouse";
factura1.cantidad=5;
factura1.precio=2.5;

//Procesar
factura1.calcularTotal();

console.log("Nombre= " + factura1.nombre + ", Cantidad= "+factura1.cantidad + ", Precio= "+factura1.precio + ", Total="+factura1.total);