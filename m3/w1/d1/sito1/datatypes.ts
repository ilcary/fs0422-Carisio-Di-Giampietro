let stringa:string = 'Mario';
let numero:number = 0;
let booleano:boolean = false;
let oggetto:object = {};
let array:any[] = [];
let union:(string|number|boolean) = true;
let any:any = {
    nome:'Mario',
    cognome:'Rossi'
};

console.log(any.nome);

let sconosciuto:unknown = {
    nome:'Mario',
    cognome:'Rossi'
}

function saluta():void{//funzione che non restituisce nulla
    console.log('ciao');
}

function saluta2():string{//deve restituire una stringa
    return 'Ciao'
}

function saluta3(saluto:string):string{//deve restituire una stringa
    return saluto
}

saluta()//nessun argomento
saluta2()//nessun argomento
saluta3('ciao')//1 argomento di tipo stringa


function saluta4(saluto:string|null = null):string|null{//deve restituire una stringa
    return saluto
}

saluta4()






/**
 * tipizzazione oggetti
 */
let oggetto2:{nome:string, cognome:string} = {
    nome:'Mario',
    cognome:'Rossi'
}

console.log(oggetto2.nome)

class User{

    nome:string;
    cognome:string;

    // constructor(nome:string, cognome:string){
    //     this.nome = nome;
    //     this.cognome = cognome;
    // }
}

let oggetto3:User = {
    nome:'Mario',
    cognome:'Rossi'
}

let utenti:User[] = [oggetto2, oggetto3]


/*
date
*/

let oggi:Date = new Date()