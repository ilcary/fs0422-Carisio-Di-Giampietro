"use strict";
const style = [
    'color: salmon',
    'background: wheat',
    'font-size: 25px',
    'border: 1px solid red',
].join(';');
class firstUser {
    constructor(__carica) {
        this.carica = __carica; /* credito */
        this.numeroChiamate = 0; /* chiamate effettuate */
        this.costoPerMinuto = 0.20; /* tariffa */
    }
    ricarica(unaRicarica) {
        this.carica += unaRicarica;
    }
    chiamata(minutiDurata) {
        let credito = (this.carica - (minutiDurata * this.costoPerMinuto)).toFixed(2);
        this.carica = +credito; // to convert the string fixed we can use the parseInt or parseFloat functions, or simply use the unary + operator
        this.numeroChiamate++;
    }
    numero404() {
        return this.carica;
    }
    getNumeroChiamate() {
        return this.numeroChiamate;
    }
    azzeraChiamate() {
        this.numeroChiamate = 0;
    }
}
let primoUtente = new firstUser(15);
console.log('%cPRIMO UTENTE', style);
console.log(primoUtente);
primoUtente.chiamata(6);
primoUtente.chiamata(3);
console.log(`il numero di chiamate da lei effettuate è ${primoUtente.numeroChiamate}`);
console.log(`${primoUtente.numero404()}€ è il credito dopo le due chiamate`);
primoUtente.azzeraChiamate();
console.log(primoUtente);
class secondUser {
    constructor(__carica) {
        this.carica = __carica; /* credito */
        this.numeroChiamate = 0; /* chiamate effettuate */
        this.costoPerMinuto = 0.20; /* tariffa */
    }
    ricarica(unaRicarica) {
        this.carica += unaRicarica;
    }
    chiamata(minutiDurata) {
        let credito = (this.carica - (minutiDurata * this.costoPerMinuto)).toFixed(2);
        this.carica = +credito; // to convert the string fixed we can use the parseInt or parseFloat functions, or simply use the unary + operator
        this.numeroChiamate++;
    }
    numero404() {
        return this.carica;
    }
    getNumeroChiamate() {
        return this.numeroChiamate;
    }
    azzeraChiamate() {
        this.numeroChiamate = 0;
    }
}
let secondoUtente = new secondUser(15);
console.log('%cSECONDO UTENTE', style);
console.log(secondoUtente);
secondoUtente.chiamata(10);
secondoUtente.chiamata(6);
console.log(`il numero di chiamate da lei effettuate è ${secondoUtente.numeroChiamate}`);
console.log(`${secondoUtente.numero404()}€ è il credito dopo le due chiamate`);
secondoUtente.azzeraChiamate();
console.log(secondoUtente);
class thirdUser {
    constructor(__carica) {
        this.carica = __carica; /* credito */
        this.numeroChiamate = 0; /* chiamate effettuate */
        this.costoPerMinuto = 0.20; /* tariffa */
    }
    ricarica(unaRicarica) {
        this.carica += unaRicarica;
    }
    chiamata(minutiDurata) {
        let credito = (this.carica - (minutiDurata * this.costoPerMinuto)).toFixed(2); // with the method toFixed we leave only the decimal we want by a parameter, it return a string so:
        this.carica = +credito; // to convert the string fixed we can use the parseInt or parseFloat functions, or simply use the unary + operator
        this.numeroChiamate++;
    }
    numero404() {
        return this.carica;
    }
    getNumeroChiamate() {
        return this.numeroChiamate;
    }
    azzeraChiamate() {
        this.numeroChiamate = 0;
    }
}
let terzaUtente = new thirdUser(15);
console.log('%cTERZO UTENTE', style);
console.log(terzaUtente);
terzaUtente.chiamata(12);
terzaUtente.chiamata(29);
console.log(`il numero di chiamate da lei effettuate è ${terzaUtente.numeroChiamate}`);
console.log(`${terzaUtente.numero404()}€ è il credito dopo le due chiamate`);
terzaUtente.azzeraChiamate();
console.log(terzaUtente);
//# sourceMappingURL=app.js.map