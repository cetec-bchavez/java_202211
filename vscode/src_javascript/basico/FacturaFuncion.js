function ProcesarProducto(cantidad, precio) {
    let total = 0.0;
    
    total = cantidad * precio;
    
    total = total + total*0.14;
    
    return total;
}

// public static nombre(Tipo nombre_var1,Tipo nombre_var2) {
//Tipo nombre = valor;
// return resultado;
//}

    
let total=0.0;

total = ProcesarProducto(7,5.6);			
console.log("Total="+total);

total = ProcesarProducto(8,6.6);			
console.log("Total="+total);

total = ProcesarProducto(5,3.6);			
console.log("Total="+total);
