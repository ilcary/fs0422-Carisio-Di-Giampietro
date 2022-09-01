/**
 * abbastanza chiaro, definisco un combinable quidni un nuov tipo 
 * dato per la tipizzazione
 * 
 * strnum e' il combinable
 */

type strnum = number|string;

let x:strnum = '4'
let y:strnum = 4


function combina(input1:strnum, input2:strnum):strnum{

    if(typeof input1 === 'number' && typeof input2 === 'number'){
        let result:strnum = Number(input1) + Number(input2);
        return result
    }else{
        let result:strnum = input1 + ' ' + input2;
        return result
    }

}

console.log(combina('ciao','Mario'));
console.log(combina(4,5));
console.log(combina('Ciao',5));
console.log(combina(3,'5'));
console.log(combina('3','5'));


// Tipi di intersezione

type Admin = {
    name:string,
    privileges: string[]
}

type Employee = {
    start:Date,
    skills:string[]
}

//somma/intersezione dei due conbinables
type PromotedEmplyee = Admin & Employee;

//devo rispettare il formato altrimenti mi va in errore
let amministratore:Admin ={
    name:'Mario',
    privileges:['tutti']
}

let dipendente:Employee = {
    start: new Date,
    skills:['popipopi']
}

//questo deve avere le proprieta' di Admin ed Employee
let megaDipendente:PromotedEmplyee = {
    name: 'Piero',
    privileges:['tutti'],
    start: new Date,
    skills:['popipopi']
}


// PROMEMORIA

interface SuperEmployee{
    name:string,
    privileges: string[],
    start:Date,
    skills:string[]
}

let ugo:SuperEmployee = {
    name: 'Ugo',
    privileges:['tutti'],
    start: new Date,
    skills:['popipopi']
}