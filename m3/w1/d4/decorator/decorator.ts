
/**
 * 
 * logger e' il decoratr, serve a decorare classi metodi proprieta funzioni
 * ed e' di fatto una funzione che si aggancia ad una struttura per
 * aggiungere funzionalita'
 * 
 * in angular saranno gia pronti e se collegate ad una determinata classse o 
 * prioprieta andranno a fare delle modifice o delle
 * aggiunte alle cose sulle cui li attacco
 * 
 * Sul nostro decoratore logger il conosole log di f ci serve
 * a vedere su quale funzione/x si attacca,
 * in questo caso si vede sul log che si attacca al [class Person]
 * 
 */
function logger(f:Function){
    console.log('....loading');
    console.log(f);
}

//da abilitare "experimental decorator" nel ts confing
// 
// il decoratore va scritto attaccato alla clsse/funzione/ecc
// sulla quale devo attaccarlo
@logger
class Person{
    name:string = 'Mario';

    constructor(){
        console.log('istanziato');
    }
}

let person = new Person();
console.log(person);

//----------------------------

function AggiungiMetodo(f:Function){
    console.log(f);

    f.prototype.mostraNome = function(){
        console.log('Gusto: ' + this.gusto);
    }

    f.prototype.prezzo = 5;

    f.prototype.mostraPrezzo = function(){
        console.log('Prezzo: ' + this.prezzo);   
    };

    
}

@AggiungiMetodo
class Pizza{
    gusto:string = 'Margherita';

}

let margherita:any = new Pizza();
margherita.mostraNome();
margherita.mostraPrezzo();