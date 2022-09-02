"use strict";
/*
//classe per creare una carta in html tramite dei parametri
class Card{
    durataChiamata:number;
    costoChiamata:number;
    constructor(__durataChiamata:number, __costoChiamata: number){
        this.durataChiamata = __durataChiamata;
        this.costoChiamata = __costoChiamata;

        this.createcard();
    }

    takeClassAndWrite(card:Node, classe:string, write:string) {
       
        let element:HTMLElement|null = document.querySelector(classe);
        element!.textContent = write
        return element;
    }

    //creazione dell'html tramite il duplicato in d-none
    createcard() {
        let carta:any = document.querySelector('#cardTemplate')?.cloneNode(true);
        this.takeClassAndWrite(carta, 'p', `${this.durataChiamata}` )
        this.takeClassAndWrite(carta, 'cite', ` ${this.durataChiamata} minuti, dal costo di ${this.costoChiamata} `)
       let diplay:HTMLElement|null =  document.querySelector('#displaycard')
       diplay?.append(carta)
    }
}


//al caricamento della pagina lancio una funzione che mi carica tutti i messaggi
window.onload = () => {

    fetch(API_CHIAMATE)
    .then(res=>res.json())
    .then(mess=>{
        for(let m of mess){
            // nuova istanza di Card per ogni messaggio presente nella rotta
            new Card(m.durataChiamata, m.costoChiamata)
        }
    })

} */ 
//# sourceMappingURL=registro.js.map