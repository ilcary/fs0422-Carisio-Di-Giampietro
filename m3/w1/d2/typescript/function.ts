function prova():void{
    //non posso restituire nulla perchè la funzione restituisce void
}
function $(selettore:string):HTMLElement|null{
    return document.querySelector(selettore)
}

function stringa():string{
    return 'ciao'
}

//dati in entrata

function bold(testo:string):string{//testo è obbligatorio
    return `<b>${testo}</b>`;
}

let boldCiao = bold('ciao')
console.log(boldCiao)

function creaHTMLBold(testo:string){//testo è obbligatorio
    document.write(`<b>${testo}</b>`)
}

$(`.elemento`)?.style.color // il simbolo? in questo caso serve a far si che gli attributi vengano letti solo se la funzione $() non restituisce null

let X = (selettore:string):HTMLElement | null=> document.querySelector(selettore);
X('.elemento')


