

const API_CAPI = "http://localhost:3000/capi"

//definizione interfaccia capi abbigliamento
interface ICapi {
    id: number;
    codprod: number;
    collezione: string;
    capo: string;
    modello: number;
    quantita: number;
    colore: string;
    prezzoIvaEsclusa: number;
    prezzoIvaInclusa: number;
    disponibile: string;
    saldo: number;

}

//creo la classe che verrà istanziata mediante la funzione fetch
class Capo implements ICapi {

    id: number;
    codprod: number;
    collezione: string;
    capo: string;
    modello: number;
    quantita: number;
    colore: string;
    prezzoIvaEsclusa: number;
    prezzoIvaInclusa: number;
    disponibile: string;
    saldo: number;

    constructor(id: number, codprod: number, collezione: string,
        capo: string, modello: number, quantita: number, colore: string, prezzoIvaEsclusa: number,
        prezzoIvaInclusa: number, disponibile: string, saldo: number) {
        this.id = id;
        this.codprod = codprod;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantita = quantita;
        this.colore = colore;
        this.prezzoIvaEsclusa = prezzoIvaEsclusa;
        this.prezzoIvaInclusa = prezzoIvaInclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
        console.log(this);
        console.log(this.getacquistocapo())
    }

    //metodo get per calcolare il saldo del capo da sottrarre al momento dell'acqusto
    getsaldocapo(): number {
        return (this.prezzoIvaInclusa / 100) * this.saldo
    }

    //metodo get per calcolare il prezzo del capo d'abbigliamento una volta applicato lo sconto
    getacquistocapo(): number {
        return this.prezzoIvaInclusa - this.getsaldocapo()
    }
}


let allcapi: ICapi[] = [];

(async function getCapi(): Promise<ICapi[]|void> {
    try {
        let capi: ICapi[] = await fetch(API_CAPI).then(res => res.json());
        console.log(capi);
        capi.forEach(capo => new Capo(capo.id, capo.codprod, capo.collezione, capo.capo, capo.modello, capo.quantita, capo.colore, capo.prezzoIvaEsclusa, capo.prezzoIvaInclusa, capo.disponibile, capo.saldo));
        return capi
    } catch (e) {
        console.error(e)
    }
})()


//funzione fetch che permette di visualizzare in console le caratteristiche dei singoli capi
/* fetch(API_CAPI)
    .then(res => res.json())
    .then(res => {
        for (let capo of res) {
            new Capo(capo.id, capo.codprod, capo.collezione, capo.capo,
                capo.modello, capo.quantita, capo.colore, capo.prezzoIvaEsclusa,
                capo.prezzoIvaInclusa, capo.disponibile, capo.saldo)
        }
    }) */