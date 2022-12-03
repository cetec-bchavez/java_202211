package clases_objetos;

public class FacturaClase {
	
	//Ingredientes
	public String nombre="";
	public Integer cantidad=0;
	public Double precio=0.0;
	
	//Resultado
	public Double total=0.0;
	
	//FUNCION Procesar
	public void calcularTotal() {
		this.total = this.cantidad * this.precio;
	}
}
