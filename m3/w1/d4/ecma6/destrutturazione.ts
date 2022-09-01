
// DESTRUTTURAZIONE

let lista:number[] = [1,2,3,4]

let [n1, n2, n3, n4] = lista;

// lasciogli spazi vuoti cosi posso prendere il primo e l'ultimo elemento
// ovviamente ha senso su un array piccolo
let [num1, , ,num2] = lista

// destrutturazione oggetti
let res = {
    gusto:"Margerita",
    tipo:"Napoletana",
    prezzo:5
}

let {gusto, tipo, prezzo} = res;