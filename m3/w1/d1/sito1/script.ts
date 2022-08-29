let a:number = 5;
let b:string = '5';

//b = 4//non posso assegnare numero a stringa

//commento su una riga
/*
Commento su più
righe
*/

let ternario:string =  a < 2 ? 'è vero' : 'è falso';

console.log(ternario)


let bool:boolean = true

if(!bool){
    console.log('ciao')
}

//Operatore &&
console.log(bool && a < 2)
console.log(bool && a > 2)
console.log(bool && !(a > 2))

//operatore ||
console.log(bool || a < 2)
console.log(bool || a > 2)
console.log(bool || !(a > 2))

let c:string|[] = b || [];

//array
let arr:string[] = ['ciao'];

let arrMisto:any[]

if(!bool){

}

if(bool){

}else{

}

/**
 * Cicli 
 */

for(let i:number = 0; i <= 10; i++){
    console.log(i)
}


