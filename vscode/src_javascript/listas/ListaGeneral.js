let paises = ["Venezuela", "Colombia", "Ecuador", "Peru","Chile"];
		
//Formula General
//Tipo[] nombre = {"Valor1","Valor2","Valor3"};

console.log(paises[2]);

console.log(paises[3]);

//Error
console.log(paises[4]);


//Pais Chile
paises[4] = "Argentina";
console.log(paises[4]);

console.log("-------------------------- FOR SIMPLE ---------------------");

for (let i = 0; i < paises.length; i++) {
    console.log(paises[i]);
}

console.log("-------------------------- FOR MEJORADO ---------------------");

// for(Tipo nombre : lista) {

for(let pais_actual of paises) {
    console.log(pais_actual);
}