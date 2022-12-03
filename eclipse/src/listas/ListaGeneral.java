package listas;

public class ListaGeneral {

	public static void main(String[] args) {
		
		String[] paises = {"Venezuela", "Colombia", "Ecuador", "Peru","Chile"};
		
		//Formula General
		//Tipo[] nombre = {"Valor1","Valor2","Valor3"};
		
		System.out.println(paises[2]);
		
		System.out.println(paises[3]);
		
		//Error
		System.out.println(paises[4]);
		
		
		//Pais Chile
		paises[4] = "Argentina";
		System.out.println(paises[4]);
		
		System.out.println("-------------------------- FOR SIMPLE ---------------------");
		
		for (int i = 0; i < paises.length; i++) {
			System.out.println(paises[i]);
		}
		
		System.out.println("-------------------------- FOR MEJORADO ---------------------");
		
		// for(Tipo nombre : lista) {
		
		for(String pais_actual : paises) {
			System.out.println(pais_actual);
		}
	}

}
