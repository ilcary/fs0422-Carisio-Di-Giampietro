//dati in uscita
function prova():void{
    //non posso restituire nulla perchè la funzione restituisce void
}

function stringa():string{
    return '';//va bene anche una stringa vuota, purchè il tipo di dato sia rispettato
}

//dati in entrata
function bold(testo:string):string{//testo è obbligatorio, return è obbligatorio
    return `<b>${testo}</b>`;
}

let boldCiao:string = bold('ciao');

console.log(boldCiao);

function creaHTMLBold(testo:string):void{//testo è obbligatorio
    document.write(`<b>${testo}</b>`)
}
creaHTMLBold('ciao')


function $(selettore:string):HTMLElement|null {
    return document.querySelector(selettore);
}

$('.elemento')?.style.color//il simbolo ? in questo caso serve a far si che gli attributi vengano letti solo se la funzione $() non restituisce null

let X:Function = (selettore:string):HTMLElement|null => document.querySelector(selettore);
X('.elemento')